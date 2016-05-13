package ru.lesson.lessions;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by art on 10.05.16.
 */
public class CalculatorTest {

    @Test
    public void testAdd() throws Exception {
        Calculator calculator = new Calculator();
        calculator.calculate(1,1,"+");
        assertEquals(2,calculator.getResult(),0);
    }

    @Test
    public void testSubtract() throws Exception {
        Calculator calculator = new Calculator();
        calculator.calculate(2,1,"-");
        assertEquals(1,calculator.getResult(),0);
    }

    @Test
    public void testMultiplication() throws Exception {
        Calculator calculator = new Calculator();
        calculator.calculate(2,1,"*");
        assertEquals(2,calculator.getResult(),0);
    }

    @Test
    public void testDiv() throws Exception {
        Calculator calculator = new Calculator();
        calculator.calculate(1,1,"/");
        assertEquals(1,calculator.getResult(),0);
    }

    @Test
    public void testInvolution() throws Exception {
        Calculator calculator = new Calculator();
        calculator.calculate(2,2,"inv");
        assertEquals(4,calculator.getResult(),0);
    }
}