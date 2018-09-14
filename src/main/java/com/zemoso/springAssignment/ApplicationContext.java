package com.zemoso.springAssignment;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationContext {

    @Bean
    public Calculator calculator() {
        return new Calculator();
    }

    @Bean
    public Operand numberOne() {
        return new Operand(1);
    }

    @Bean
    public Operand numberTwo() {
        return new Operand(2);
    }
}
