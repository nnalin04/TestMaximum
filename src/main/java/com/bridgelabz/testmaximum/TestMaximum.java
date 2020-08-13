package com.bridgelabz.testmaximum;

public class TestMaximum {

    public Integer numberWithMaxValue(Integer num1, Integer num2, Integer num3){
        Integer max = num1;
        if(num2.compareTo(num1) > 0){
            max = num2;
        }
        if(num3.compareTo(num2) > 0){
            max = num3;
        }
        return max;
    }

    public Float floatWithMaxValue(Float float1, Float float2, Float float3){
        Float max = float1;
        if(float2.compareTo(float1) > 0){
            max = float2;
        }
        if(float3.compareTo(float2) > 0){
            max = float3;
        }
        return max;
    }
}
