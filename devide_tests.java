package com.company;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class devide_tests {

    @Test
    public void test1() {
        calculator x=new calculator();
        float result=x.devide(5,5);

        assertEquals(1,result,0.0);
    }
    @Test
    public void test2(){
        calculator x=new calculator();
        float result=x.devide(10,5);

        assertEquals(2,result,0.0);

    }
    @Test
    public void test3(){
        calculator x=new calculator();
        float result=x.devide(10,7);

        assertEquals((float)10/7,result,0.0);

    }
    @Test
    public void whenDerivedExceptionThrown_thenAssertionSucceds() {
        Exception exception = assertThrows(RuntimeException.class, () -> {
            Integer.parseInt("1a");
        });

        String expectedMessage = "For input string";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

}