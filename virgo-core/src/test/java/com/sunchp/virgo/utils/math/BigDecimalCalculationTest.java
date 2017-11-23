package com.sunchp.virgo.utils.math;

import org.junit.Test;

import java.math.BigDecimal;

import static com.sunchp.virgo.utils.math.BigDecimalUtils.cal;
import static org.junit.Assert.*;

/**
 * @author sunchangpeng
 */
public class BigDecimalCalculationTest {
    BigDecimal one = new BigDecimal("3.521");
    BigDecimal two = new BigDecimal("1.4201");
    BigDecimal three = new BigDecimal("4.9411");
    BigDecimal four = new BigDecimal("2.1009");
    BigDecimal five = new BigDecimal("5.0001721");
    BigDecimal six = new BigDecimal("2.479");
    BigDecimal seven = new BigDecimal("2.479403");

    @Test
    public void testTwoBigdecimalsPlus() {
        assertTrue(cal(one).plus(two).result().compareTo(three) == 0);
        assertTrue(cal("3.521").plus("1.4201").result().compareTo(three) == 0);
    }

    @Test
    public void testTwoBigdecimalsMinus() {
        assertTrue(cal(one).minus(two).result().compareTo(four) == 0);
        assertTrue(cal("3.521").minus("1.4201").result().compareTo(four) == 0);
    }

    @Test
    public void testTwoBigdecimalsMul() {
        assertTrue(cal(one).mul(two).result().compareTo(five) == 0);
        assertTrue(cal("3.521").mul("1.4201").result().compareTo(five) == 0);
    }

    @Test
    public void testTwoBigdecimalsDive() {
        assertTrue(cal(one).div(two).result().compareTo(six) == 0);
        assertTrue(cal("3.521").div("1.4201").result().compareTo(six) == 0);
    }

    @Test
    public void testTwoBigdecimalsDiveWithScale() {
        assertTrue(cal(one).div(two, 6).result().compareTo(seven) == 0);
        assertTrue(cal("3.521").div("1.4201", 6).result().compareTo(seven) == 0);
    }
}