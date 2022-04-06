package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WithoutTestTest {

    @Test
    void test_calculate() {
        int number1 = 10;
        int number2 = 2;

        String addition = WithoutTest.calculate(number1, number2, '+');
        assertEquals("12", addition);

        String subtraction = WithoutTest.calculate(number1, number2, '-');
        assertEquals("8", subtraction);

        String multiply = WithoutTest.calculate(number1, number2, '*');
        assertEquals("20", multiply);

        String division = WithoutTest.calculate(number1, number2, '/');
        assertEquals("5", division);

        String other = WithoutTest.calculate(number1, number2, 'a');
        assertEquals("", other);
    }

    @Test
    void test_isPrime() {
        assertTrue(WithoutTest.isPrime(2));
        assertTrue(WithoutTest.isPrime(3));
        assertTrue(WithoutTest.isPrime(7));
        assertTrue(WithoutTest.isPrime(11));
        assertTrue(WithoutTest.isPrime(Integer.MAX_VALUE));

        assertFalse(WithoutTest.isPrime(0));
        assertFalse(WithoutTest.isPrime(1));
        assertFalse(WithoutTest.isPrime(-2));
        assertFalse(WithoutTest.isPrime(9));
        assertFalse(WithoutTest.isPrime(25));
    }

    @Test
    void test_checkGender() {
        String woman = WithoutTest.checkGender(0);
        assertEquals("nő", woman);

        String man = WithoutTest.checkGender(1);
        assertEquals("férfi", man);

        String other = WithoutTest.checkGender(5);
        assertEquals("valami más", other);
    }

    @Test
    void test_trafficLight() {
        String green = WithoutTest.trafficLight("zöld");
        assertEquals("SZABAD", green);

        String yellow = WithoutTest.trafficLight("sárga");
        assertEquals("LASSÍTS", yellow);

        String red = WithoutTest.trafficLight("piros");
        assertEquals("MEGÁLLJ", red);

        String other = WithoutTest.trafficLight("lila");
        assertEquals("NEM TUDOM", other);
    }

    @Test
    void test_isLeapYear() {
        assertTrue(WithoutTest.isLeapYear(1904));
        assertTrue(WithoutTest.isLeapYear(1940));
        assertTrue(WithoutTest.isLeapYear(2000));
        assertTrue(WithoutTest.isLeapYear(2048));

        assertFalse(WithoutTest.isLeapYear(1905));
        assertFalse(WithoutTest.isLeapYear(1941));
        assertFalse(WithoutTest.isLeapYear(2001));
        assertFalse(WithoutTest.isLeapYear(2050));
    }

}