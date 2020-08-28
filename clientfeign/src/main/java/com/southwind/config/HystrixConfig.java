package com.southwind.config;

/**
 * 配置文件
 * management:
 *   endpoints:
 *     web:
 *       exposure:
 *         include: 'hystrix.stream'
 * @author wzl
 * @since 2020-08-27 14:13
 */
//@Configuration
//public class HystrixConfig {
//
//    @Bean
//    public ServletRegistrationBean<HystrixMetricsStreamServlet> getServlet(){
//        HystrixMetricsStreamServlet servlet = new HystrixMetricsStreamServlet();
//        ServletRegistrationBean<HystrixMetricsStreamServlet> bean =
//                new ServletRegistrationBean<>(servlet);
//        bean.addUrlMappings("/hystrix.stream");
//        bean.setName("HystrixMetricsStreamServlet");
//        return bean;
//    }
//}
