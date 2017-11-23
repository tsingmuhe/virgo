package com.sunchp.virgo.utils.math;

import java.math.BigDecimal;

/**
 * @author sunchangpeng
 */
public abstract class BigDecimalUtils {
    public static BigDecimalLogic is(BigDecimal value) {
        return new BigDecimalLogic(value);
    }

    public static BigDecimalLogic is(String value) {
        return new BigDecimalLogic(value);
    }

    public static BigDecimalCalculation cal(BigDecimal value) {
        return new BigDecimalCalculation(value);
    }

    public static BigDecimalCalculation cal(String value) {
        return new BigDecimalCalculation(new BigDecimal(value));
    }
}
