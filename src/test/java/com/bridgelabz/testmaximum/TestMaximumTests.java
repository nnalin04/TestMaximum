package com.bridgelabz.testmaximum;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximumTests {

    @Test
    public void givenNumbers_1stPositionIsMax_shouldReturn1stNumber() {
        TestMaximum maximum = new TestMaximum();
        int max = maximum.numberWithMaxValue(3, 2, 1);
        Assert.assertEquals(3, max);
    }

    @Test
    public void givenNumbers_2ndPositionIsMax_shouldReturn2ndNumber() {
        TestMaximum maximum = new TestMaximum();
        int max = maximum.numberWithMaxValue(3, 2, 1);
        Assert.assertEquals(3, max);
    }

    @Test
    public void givenNumbers_3rdPositionIsMax_shouldReturn3rdNumber() {
        TestMaximum maximum = new TestMaximum();
        int max = maximum.numberWithMaxValue(1, 2, 3);
        Assert.assertEquals(3, max);
    }

    @Test
    public void givenFloats_1stPositionIsMax_shouldReturn1stFloat() {
        TestMaximum maximum = new TestMaximum();
        float max = maximum.floatWithMaxValue((float)3.3, (float)2.2, (float)2.2);
        Assert.assertEquals(3.3, max,1);
    }

    @Test
    public void givenFloats_2stPositionIsMax_shouldReturn2stFloat() {
        TestMaximum maximum = new TestMaximum();
        double max = maximum.floatWithMaxValue((float)3.3, (float)2.2, (float)1.1);
        Assert.assertEquals(3.3, max, 1);
    }

    @Test
    public void givenFloats_3stPositionIsMax_shouldReturn3stFloat() {
        TestMaximum maximum = new TestMaximum();
        double max = maximum.floatWithMaxValue((float)3.3, (float)2.3, (float)1.3);
        Assert.assertEquals(3.3, max, 1);
    }

    @Test
    public void givenString_1stPositionIsMax_shouldReturn1stString() {
        TestMaximum maximum = new TestMaximum();
        String max = maximum.stringWithMaxValue("Peach", "Apple", "Banana");
        Assert.assertEquals("Peach", max);
    }

    @Test
    public void givenString_2stPositionIsMax_shouldReturn2stString() {
        TestMaximum maximum = new TestMaximum();
        String max = maximum.stringWithMaxValue("Apple", "Peach", "Banana");
        Assert.assertEquals("Peach", max);
    }

    @Test
    public void givenString_3stPositionIsMax_shouldReturn3stString() {
        TestMaximum maximum = new TestMaximum();
        String max = maximum.stringWithMaxValue("Apple", "Banana", "Peach");
        Assert.assertEquals("Peach", max);
    }
}
