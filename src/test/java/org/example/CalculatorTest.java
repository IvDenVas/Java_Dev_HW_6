package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    @DisplayName("Проверка суммы")
    void sum() {
        assertEquals(5, 3,2);
    }

    @Test
    @DisplayName("Проверка getX")
    void getX() {
        calculator.setX(2);
        assertEquals(2,calculator.getX());
    }

    @Test
    @DisplayName("Проверка getY")
    void getY() {
        calculator.setY(11);
        assertEquals(11, calculator.getY());
    }

    @Test
    @DisplayName("Проверка setX")
    void setX() {
        calculator.setX(546);
        assertEquals(546,calculator.getX());
    }

    @Test
    @DisplayName("Проверка setY")
    void setY() {
        calculator.setY(999);
        assertEquals(999, calculator.getY());
    }
}