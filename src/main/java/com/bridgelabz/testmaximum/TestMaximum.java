package com.bridgelabz.testmaximum;

public class TestMaximum {

    Integer num1;
    Integer num2;
    Integer num3;

    TestMaximum(Integer num1, Integer num2, Integer num3){
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public Integer numberWithMaxValue(){
        Integer max = num1;
        if(num2.compareTo(num1) > 0){
            max = num2;
        }
        if(num3.compareTo(num2) > 0){
            max = num3;
        }
        return max;
    }
}
