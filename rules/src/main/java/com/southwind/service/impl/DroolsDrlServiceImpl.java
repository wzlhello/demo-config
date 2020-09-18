package com.southwind.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.southwind.service.DroolsDrlService;

/**
 * @author wzl
 * @since 2020-09-18 10:49
 */
@Service
public class DroolsDrlServiceImpl implements DroolsDrlService {


    private String R001 = "import java.util.Map;" +
            "import com.southwind.entry.DefaultEntry;" +
            "rule \"R001\"" +
            "   salience 1"+
            "   when"+
            "       $map:Map()" +
            "       $cond : Object($map[\"id\"] == 1 && $map[\"name\"] == \"Bill\");" +
            "   then" +
            "       DefaultEntry.process($map, \"R001\");" +
            "end;";

    /**
     * 加载 DRL 模板
     * // TODO 真实业务场景，从数据库中获取业务所有的业务规则
     * */
    @Override
    public List<String> loadDrls() {
        return new ArrayList<String>(){{add(R001);}};
    }
}
