package com.bridgelabz.testmaximum;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximumTests {

    @Test
    public void givenNumbers_1stPositionIsMax_shouldReturn1stNumber() {
        TestMaximum maximum = new TestMaximum(3, 2, 1);
        Integer max = maximum.numberWithMaxValue();
        Assert.assertEquals(3, (int) max);
    }

    @Test
    public void givenNumbers_2ndPositionIsMax_shouldReturn2ndNumber() {
        TestMaximum maximum = new TestMaximum(3, 2, 1);
        Integer max = maximum.numberWithMaxValue();
        Assert.assertEquals(3, (int) max);
    }

    @Test
    public void givenNumbers_3rdPositionIsMax_shouldReturn3rdNumber() {
        TestMaximum maximum = new TestMaximum(3, 2, 1);
        Integer max = maximum.numberWithMaxValue();
        Assert.assertEquals(3, (int) max);
    }
}
