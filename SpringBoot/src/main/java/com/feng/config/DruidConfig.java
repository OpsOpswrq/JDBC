//package com.feng.config;
//
//import com.alibaba.druid.pool.DruidDataSource;
//import com.alibaba.druid.support.http.StatViewFilter;
//import com.alibaba.druid.support.http.StatViewServlet;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.web.servlet.FilterRegistrationBean;
//import org.springframework.boot.web.servlet.ServletRegistrationBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import javax.sql.DataSource;
//import java.util.LinkedHashMap;
//
//@Configuration
//public class DruidConfig{
//    @Bean
//    @ConfigurationProperties(prefix = "spring.datasource")
//    public DataSource druidDataSource(){
//        return new DruidDataSource();
//    }
//    @Bean
//    public ServletRegistrationBean StatViewServlet(){
//        ServletRegistrationBean<StatViewServlet> bean = new ServletRegistrationBean<>(new StatViewServlet(),"/druid/*");
//        LinkedHashMap<String, String> initParameters = new LinkedHashMap<>();
//        initParameters.put("loginUsername","feng");
//        initParameters.put("loginPassword","123456");
//        initParameters.put("allow","");
////        initParameters.put("deny","localhost");
//        initParameters.put("resetEnable","false");
//        bean.setInitParameters(initParameters);
//        return bean;
//    }
//    @Bean
//    public FilterRegistrationBean StatViewFilter(){
//        FilterRegistrationBean<StatViewFilter> bean = new FilterRegistrationBean<>(new StatViewFilter());
//        bean.addUrlPatterns("/*");
//        bean.addInitParameter("exclusions","*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*,");
//        return bean;
//    }
//}