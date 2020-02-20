package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class addition_tests {

    @Test
    public void test1() {
        calculator x=new calculator();
        int result=x.add(5,6);
        assertEquals(11,result);
    }

    @Test
    public void test2() {
        calculator x = new calculator();
        int result = x.add(0, 0);
        assertEquals(0, result);

    }
}