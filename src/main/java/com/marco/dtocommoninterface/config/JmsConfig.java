package com.marco.dtocommoninterface.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.jms.support.converter.MappingJackson2MessageConverter;
import org.springframework.jms.support.converter.MessageType;

@Configuration
public class JmsConfig {

    public static final String VALIDATE_ORDER_QUEUE = "validate-order";

    public static final String VALIDATE_ORDER_QUEUE_RESULT = "validate-order-result";

    public static final String MY_QUEUE = "my-hello-world";

    public static final String MY_SEND_RCV_QUEUE = "my-replay-back-hello-world";

    @Bean
    public MappingJackson2MessageConverter messageConverter(){

        MappingJackson2MessageConverter converter = new MappingJackson2MessageConverter();
        converter.setTargetType(MessageType.TEXT);
        converter.setTypeIdPropertyName("_type");
        return converter;
    }
}
