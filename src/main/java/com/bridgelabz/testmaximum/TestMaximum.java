package com.bridgelabz.testmaximum;

public class TestMaximum {

    public <E extends Comparable> E inputWithMaxValue(E input1, E input2, E input3){
        E max = input1;
        if(input2.compareTo(max) > 0){
            max = input2;
        }
        if(input3.compareTo(max) > 0){
            max = input3;
        }
        return max;
    }
}
