package com.sages.training.unittesting;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestPower {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 1, 2, 1 }, { 2, 2, 4 }, { 3, 2, 9 }
        });
    }

    private int a;
    private int b;
    private int c;

    public TestPower(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Test
    public void test() {
        assertEquals(c, Math.pow(a, b), 0.1);
    }
}