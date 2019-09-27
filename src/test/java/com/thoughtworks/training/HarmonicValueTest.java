package com.thoughtworks.training;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HarmonicValueTest {
    @Test
    public void givenOne_WhenEvaluate_ThenShouldReturnOne() {
        HarmonicValue harmonicValue = new HarmonicValue(1);

        Assertions.assertEquals(1, harmonicValue.get());
    }

    @Test
    public void givenOneAndTwo_WhenEvaluate_ThenShouldReturnOnePointFive() {
        HarmonicValue harmonicValue = new HarmonicValue(2);

        Assertions.assertEquals(1.5, harmonicValue.get());
    }

    @Test
    public void givenThree_WhenEvaluate_ThenShouldReturnOnePointEightThree() {
        HarmonicValue harmonicValue = new HarmonicValue(3);

        Assertions.assertEquals(1.8333333333333333, harmonicValue.get());
    }
}
