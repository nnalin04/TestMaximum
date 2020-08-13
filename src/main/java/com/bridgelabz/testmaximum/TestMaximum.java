package com.bridgelabz.testmaximum;

public class TestMaximum<E extends Comparable<E>> {

    E input1, input2, input3;

    TestMaximum(E input1, E input2, E input3){
        this.input1 = input1;
        this.input2 = input2;
        this.input3 = input3;
    }

    public E testMaximum(){
        return inputWithMaxValue(input1, input2, input3);
    }

    public static <E extends Comparable> E inputWithMaxValue(E input1, E input2, E input3){
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
