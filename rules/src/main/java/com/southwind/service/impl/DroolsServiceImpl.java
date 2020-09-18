package com.southwind.service.impl;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.apache.commons.codec.Charsets;
import org.drools.core.impl.InternalKnowledgeBase;
import org.drools.core.impl.KnowledgeBaseFactory;
import org.kie.api.definition.KiePackage;
import org.kie.api.io.ResourceType;
import org.kie.api.runtime.KieSession;
import org.kie.internal.builder.KnowledgeBuilder;
import org.kie.internal.builder.KnowledgeBuilderError;
import org.kie.internal.builder.KnowledgeBuilderErrors;
import org.kie.internal.builder.KnowledgeBuilderFactory;
import org.kie.internal.io.ResourceFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.southwind.service.DroolsDrlService;
import com.southwind.service.DroolsService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author wzl
 * @since 2020-09-18 10:45
 */
@Slf4j
@Service
public class DroolsServiceImpl implements DroolsService {


    @Autowired
    private DroolsDrlService droolsDrlService;


    @Override
    public void process(Map<String, String> msg) {
        log.info("{}", msg);

        KieSession kSession = getSession();
        kSession.insert(msg);

        log.debug("匹配项目下的全部规则");
        int ruleFiredCount = kSession.fireAllRules();

        log.debug("数据共触发了 {} 条规则", ruleFiredCount);
        kSession.dispose();
    }


    private KieSession getSession() {
        InternalKnowledgeBase kBase = KnowledgeBaseFactory.newKnowledgeBase();
        // 从数据库获取到所有的规则配置信息
        Collection<KiePackage> pkg = loadDynamicRules();

        kBase.addPackages(pkg);

        return kBase.newKieSession();
    }

    private Collection<KiePackage> loadDynamicRules() {

        List<String> rules = droolsDrlService.loadDrls();

        KnowledgeBuilder kb = KnowledgeBuilderFactory.newKnowledgeBuilder();

        // 将规则动态添加到drools服务内。
        for (String ruleStr : rules) {
            kb.add(ResourceFactory.newByteArrayResource(ruleStr.getBytes(Charsets.UTF_8)), ResourceType.DRL);
        }

        // 检查规则正确性
        KnowledgeBuilderErrors errors = kb.getErrors();
        for (KnowledgeBuilderError error : errors) {
            log.error("规则文件正确性有误：{}", error);
            throw new RuntimeException("Rule Check Exception");
        }
        return kb.getKnowledgePackages();
    }


}
