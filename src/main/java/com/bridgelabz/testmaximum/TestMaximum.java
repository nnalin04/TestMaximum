package com.bridgelabz.testmaximum;

public class TestMaximum<E extends Comparable<E>> {

    int arrayLength;
    E[] inputArray;

    public TestMaximum(int arrayLength, E[] inputArray){
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
        printMax(max);
        return max;
    }

    private static <E extends Comparable> void printMax(E max) {
        System.out.println("the Max for "+ max.getClass().getSimpleName() +" is "+ max);
    }

    public static void main(String[] args) {
        Integer[] integerArray = {3,2,1};
        Float[] floatArray = {1.1f, 2.2f, 3.3f};
        String[] stringArray = {"Apple", "Banana", "Peach"};
        new TestMaximum(integerArray.length, integerArray).testMaximum();
        new TestMaximum(floatArray.length, floatArray).testMaximum();
        new TestMaximum(stringArray.length, stringArray).testMaximum();
    }
}
