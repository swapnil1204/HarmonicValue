package com.thoughtworks.training;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HarmonicValueTest {
    @Test
    public void givenOne_WhenEvaluate_ThenShouldReturnOne() {
        HarmonicValue harmonicValue = new HarmonicValue(1);

        Assertions.assertEquals(1, harmonicValue.get());
    }
}
