package com.bridgelabz.testmaximum;

public class TestMaximum {

    public Integer numberWithMaxValue(Integer input1, Integer input2, Integer input3){
        Integer max = input1;
        if(input2.compareTo(max) > 0){
            max = input2;
        }
        if(input3.compareTo(max) > 0){
            max = input3;
        }
        return max;
    }

    public Float floatWithMaxValue(Float input1, Float input2, Float input3){
        Float max = input1;
        if(input2.compareTo(max) > 0){
            max = input2;
        }
        if(input3.compareTo(max) > 0){
            max = input3;
        }
        return max;
    }

    public String stringWithMaxValue(String input1, String input2, String input3){
        String max = input1;
        if(input2.compareTo(max) > 0){
            max = input2;
        }
        if(input3.compareTo(max) > 0){
            max = input3;
        }
        return max;
    }
}
