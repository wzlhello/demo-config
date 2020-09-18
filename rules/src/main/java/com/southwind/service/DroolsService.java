package com.southwind.service;

import java.util.Map;

/**
 * @author wzl
 * @since 2020-09-18 10:45
 */
public interface DroolsService {
    void process(Map<String, String> msg);
}
