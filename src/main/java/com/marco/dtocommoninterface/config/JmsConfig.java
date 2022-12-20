package com.marco.dtocommoninterface.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.jms.support.converter.MappingJackson2MessageConverter;
import org.springframework.jms.support.converter.MessageConverter;
import org.springframework.jms.support.converter.MessageType;

@Configuration
public class JmsConfig {

    public static final String NEW_INVENTORY_QUEUE = "new-inventory-queue";
    public static final String VALIDATE_ORDER_QUEUE = "validate-order";

    public static final String VALIDATE_ORDER_QUEUE_RESULT = "validate-order-result";

    public static final String DEALLOCATE_ORDER_QUEUE = "deallocate-order";

    public static final String ALLOCATE_ORDER_QUEUE = "allocate-order";

    @Bean
    public MessageConverter messageConverter(ObjectMapper objectMapper){

        MappingJackson2MessageConverter converter = new MappingJackson2MessageConverter();
        converter.setTargetType(MessageType.TEXT);
        converter.setTypeIdPropertyName("_type");
        converter.setObjectMapper(objectMapper);
        return converter;
    }
}
