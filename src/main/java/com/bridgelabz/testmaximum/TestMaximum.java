package com.bridgelabz.testmaximum;

public class TestMaximum<E extends Comparable<E>> {

    int arrayLength;
    E[] inputArray;

    TestMaximum( E[] inputArray, int arrayLength){
        this.inputArray = inputArray;
        this.arrayLength = arrayLength;
    }

    public E testMaximum(){
        return inputWithMaxValue(inputArray, arrayLength);
    }

    public static <E extends Comparable> E inputWithMaxValue(E[] inputArray, int arrayLength){
        E max = inputArray[0];
        for(int i=1;i< arrayLength;i++){
            if(inputArray[i].compareTo(max) > 0){
                max = inputArray[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Integer[] integerArray = {3,2,1};
        Float[] floatArray = {1.1f, 2.2f, 3.3f};
        String[] stringArray = {"Apple", "Banana", "Peach"};
        new TestMaximum(integerArray, integerArray.length).testMaximum();
        new TestMaximum(floatArray, floatArray.length).testMaximum();
        new TestMaximum(stringArray, stringArray.length).testMaximum();
    }
}
