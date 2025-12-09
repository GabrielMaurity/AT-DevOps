package com.devcalc;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorServiceTest {

    private final CalculatorService service = new CalculatorService();

    @Test
    public void testAdd() {
        assertEquals(15.0, service.add(10, 5));
    }

    @Test
    public void testSubtract() {
        assertEquals(5.0, service.subtract(10, 5));
    }

    @Test
    public void testMultiply() {
        assertEquals(50.0, service.multiply(10, 5));
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, service.divide(10, 5));
    }

    @Test
    public void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> service.divide(10, 0));
    }
}