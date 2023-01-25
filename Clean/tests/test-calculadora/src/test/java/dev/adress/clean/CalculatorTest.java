package dev.adress.clean;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void multiply() {
        assertEquals(4.6, calculator.multiply(2.0, 2.3));
    }

    @Test
    void divide() {
        assertEquals(2.0, calculator.divide(4.0, 2.0));
    }

    @Test
    void invalidDivide() {
        assertThrows(DivisionByZeroException.class, () -> calculator.divide(2.0, 0.0));
    }

    @Test
    void abs() {
        assertEquals(4.0, calculator.abs(-4.0));
    }
}