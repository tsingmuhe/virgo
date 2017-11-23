package com.sunchp.virgo.utils.math;

import java.math.BigDecimal;

/**
 * @author sunchangpeng
 */
public class BigDecimalLogic {
    private static final int ZERO = 0;

    private final BigDecimal amount;

    public BigDecimalLogic(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimalLogic(String amount) {
        if (amount == null) {
            this.amount = null;
        } else {
            this.amount = new BigDecimal(amount);
        }
    }

    public boolean eq(BigDecimal bigDecimal) {
        return this.amount.compareTo(bigDecimal) == ZERO;
    }

    public boolean eq(String value) {
        return eq(new BigDecimal(value));
    }

    public boolean gt(BigDecimal bigDecimal) {
        return this.amount.compareTo(bigDecimal) > ZERO;
    }

    public boolean gt(String value) {
        return gt(new BigDecimal(value));
    }

    public boolean gteq(BigDecimal bigDecimal) {
        return this.amount.compareTo(bigDecimal) >= ZERO;
    }

    public boolean gteq(String value) {
        return gteq(new BigDecimal(value));
    }

    public boolean lt(BigDecimal bigDecimal) {
        return this.amount.compareTo(bigDecimal) < ZERO;
    }

    public boolean lt(String value) {
        return lt(new BigDecimal(value));
    }

    public boolean lteq(BigDecimal bigDecimal) {
        return this.amount.compareTo(bigDecimal) <= ZERO;
    }

    public boolean lteq(String value) {
        return lteq(new BigDecimal(value));
    }

    public boolean isZero() {
        return eq(BigDecimal.ZERO);
    }

    public boolean isNullOrZero() {
        return this.amount == null || isZero();
    }
}
