/**
 * 
 */
package com.assignment.demo.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author dgaram
 *
 */
@Configuration
public class AppConfig {
//    @Autowired
//    private ApplicationContext cntxt;

    @Bean
    public ObjectMapper setObjectMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.setConfig(mapper.getDeserializationConfig()
                .with(JsonParser.Feature.STRICT_DUPLICATE_DETECTION)
                .with(JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS)
                .with(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)
                .with(DeserializationFeature.FAIL_ON_READING_DUP_TREE_KEY));
        return mapper;
    }

//    /**
//     * Switch between different ways to storage assignments
//     * @return
//     */
//    @Bean
//    public TareasHelper setTareasHelper() {
//        cntxt.getBean(Void.class);
//        return null;
//    }
}
