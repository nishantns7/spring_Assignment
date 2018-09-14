package com.zemoso.springAssignment;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class mainClass {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationContext.class);

        Calculator calculator = context.getBean(Calculator.class);

        System.out.println("1 + 2 = " + calculator.add());
        System.out.println("1 - 2 = " + calculator.subtract());
        System.out.println("1 * 2 = " + calculator.multiply());
        System.out.println("1 / 2 = " + calculator.divide());
    }
}
