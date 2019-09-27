package com.thoughtworks.training;

public class HarmonicValue {
    private final int value;

    public HarmonicValue(int value) {
        this.value = value;
    }

    public double get() {
        if (value == 1)
            return 1;
        return 1 + 0.5;
    }
}

