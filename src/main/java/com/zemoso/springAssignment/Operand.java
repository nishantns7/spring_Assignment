package com.zemoso.springAssignment;

public class Operand {

    public int number;

    public Operand(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return String.valueOf(number);
    }
}
