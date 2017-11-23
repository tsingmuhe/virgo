package com.sunchp.virgo.utils.math;

import org.junit.Test;

import java.math.BigDecimal;
import static com.sunchp.virgo.utils.math.BigDecimalUtils.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BigDecimalLogicTest {
    BigDecimal one = new BigDecimal("1.4201");
    BigDecimal two = new BigDecimal("3.521");
    BigDecimal three = new BigDecimal("6.521");
    BigDecimal four = new BigDecimal("6.521");
    BigDecimal five = null;

    @Test
    public void testTwoBigdecimalsEquality() {
        assertTrue(is(three).eq(four));
        assertTrue(is(one).eq(one));
        assertTrue(!is(one).eq(two));
        assertTrue(is(three).eq("6.521"));
        assertTrue(is("1").eq("1"));
    }

    @Test
    public void testABigdecimalIsGratherThanTheOther() {
        assertTrue(!is(three).gt(four));
        assertTrue(!is(two).gt(two));
        assertTrue(is(two).gt(one));
        assertTrue(is(three).gt(two));

        assertTrue(!is(three).gt("6.521"));
        assertTrue(!is(two).gt("3.521"));
        assertTrue(is(two).gt("1.4201"));
        assertTrue(is(three).gt("3.521"));
    }

    @Test
    public void testABigdecimalIsGratherThanEqualsToTheOther() {
        assertTrue(is(three).gteq(four));
        assertTrue(is(two).gteq(two));
        assertTrue(is(two).gteq(one));
        assertTrue(!is(two).gteq(three));

        assertTrue(is(three).gteq("6.521"));
        assertTrue(is(two).gteq("3.521"));
        assertTrue(is(two).gteq("1.4201"));
        assertTrue(!is(two).gteq("6.521"));
    }

    @Test
    public void testABigdecimalIsLessThanTheOther() {
        assertTrue(!is(three).lt(four));
        assertTrue(!is(two).lt(two));
        assertTrue(is(one).lt(two));
        assertTrue(is(two).lt(three));

        assertTrue(!is(three).lt("6.521"));
        assertTrue(!is(two).lt("3.521"));
        assertTrue(is(one).lt("3.521"));
        assertTrue(is(two).lt("6.521"));
    }

    @Test
    public void testABigdecimalIsLessThanEqualsToTheOther() {
        assertTrue(is(three).lteq(four));
        assertTrue(is(two).lteq(two));
        assertTrue(is(one).lteq(two));
        assertTrue(!is(three).lteq(two));

        assertTrue(is(three).lteq("6.521"));
        assertTrue(is(two).lteq("3.521"));
        assertTrue(is(one).lteq("3.521"));
        assertTrue(!is(three).lteq(two));
    }

    @Test
    public void testZeroIsZero() {
        assertTrue(is("0").isZero());
    }

    @Test
    public void testNullOrZero() {
        assertTrue(is(five).isNullOrZero());
        assertTrue(is((String) null).isNullOrZero());
        assertTrue(is("0").isNullOrZero());
        assertFalse(is("1").isNullOrZero());
    }
}