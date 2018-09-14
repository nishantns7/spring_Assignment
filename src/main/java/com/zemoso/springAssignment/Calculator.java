package com.zemoso.springAssignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Calculator {

    @Autowired
    @Qualifier("numberOne")
    private Operand number1;

    @Autowired
    @Qualifier("numberTwo")
    private Operand number2;


    public int add() {
        return number1.getNumber() + number2.getNumber();
    }

    public int subtract() {
        return number1.getNumber() - number2.getNumber();
    }

    public int multiply() {
        return number1.getNumber() * number2.getNumber();
    }

    public int divide() {
        return number1.getNumber() / number2.getNumber();
    }
}
