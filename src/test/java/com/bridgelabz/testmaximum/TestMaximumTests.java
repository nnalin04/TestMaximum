package com.bridgelabz.testmaximum;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximumTests {

    @Test
    public void givenNumbers_1stPositionIsMax_shouldReturn1stNumber() {
        Integer[] array = {3, 2, 1};
        TestMaximum maximum = new TestMaximum(3, array);
        int max = (int) maximum.testMaximum();
        Assert.assertEquals(3, max);
    }

    @Test
    public void givenNumbers_2ndPositionIsMax_shouldReturn2ndNumber() {
        Integer[] array = {3, 2, 1};
        TestMaximum maximum = new TestMaximum(3, array);
        int max = (int) maximum.testMaximum();
        Assert.assertEquals(3, max);
    }

    @Test
    public void givenNumbers_3rdPositionIsMax_shouldReturn3rdNumber() {
        Integer[] array = {1, 2, 3};
        TestMaximum maximum = new TestMaximum(3, array);
        int max = (int) maximum.testMaximum();
        Assert.assertEquals(3, max);
    }

    @Test
    public void givenFloats_1stPositionIsMax_shouldReturn1stFloat() {
        Float[] array = {3.3f, 1.1f, 2.2f};
        TestMaximum maximum = new TestMaximum(3, array);
        float max = (float) maximum.testMaximum();
        Assert.assertEquals(3.3, max,1);
    }

    @Test
    public void givenFloats_2stPositionIsMax_shouldReturn2stFloat() {
        Float[] array = {2.2f, 3.3f, 1.1f};
        TestMaximum maximum = new TestMaximum(3, array);
        float max = (float) maximum.testMaximum();
        Assert.assertEquals(3.3, max, 1);
    }

    @Test
    public void givenFloats_3stPositionIsMax_shouldReturn3stFloat() {
        Float[] array = {2.2f, 1.1f, 3.3f};
        TestMaximum maximum = new TestMaximum(3, array);
        float max = (float) maximum.testMaximum();
        Assert.assertEquals(3.3, max, 1);
    }

    @Test
    public void givenString_1stPositionIsMax_shouldReturn1stString() {
        String[] array = {"Peach", "Apple", "Banana"};
        TestMaximum maximum = new TestMaximum(3, array);
        String max = (String) maximum.testMaximum();
        Assert.assertEquals("Peach", max);
    }

    @Test
    public void givenString_2stPositionIsMax_shouldReturn2stString() {
        String[] array = {"Apple", "Peach", "Banana"};
        TestMaximum maximum = new TestMaximum(3, array);
        String max = (String) maximum.testMaximum();
        Assert.assertEquals("Peach", max);
    }

    @Test
    public void givenString_3stPositionIsMax_shouldReturn3stString() {
        String[] array = {"Apple", "Banana", "Peach"};
        TestMaximum maximum = new TestMaximum(3, array);
        String max = (String) maximum.testMaximum();
        Assert.assertEquals("Peach", max);
    }
}