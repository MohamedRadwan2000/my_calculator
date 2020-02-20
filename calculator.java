package com.company;

public class calculator implements ICalculator {
    public int add(int x, int y) {
        return x+y;
    }

    public float devide(int x, int y)throws RuntimeException {
        if (y==0)throw new IllegalArgumentException("MATH ERROR : Cannot divide by 0");
        return (float)x/y;
    }

}
