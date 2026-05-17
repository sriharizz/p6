package com.example;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Unit test for simple App.
 */
public class AppTest
{
    @Test
    public void testAddition(){
        double num1=5;
        double num2=10;
        double expectedsum=num1+num2;
        double actsum=num1+num2;
        assertEquals(expectedsum,actsum,0.01);
    }
}