package com.example.exercise6;

import java.util.Arrays;

public class Task1d {
    public static void main(String[] args){
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int counter = 0;
        System.out.println("Before:");
        System.out.println(Arrays.toString(array));

        boolean toSort = true;

        for (int i = 1; i < array.length && toSort; i++){
            toSort = false;
            counter++;
            for (int j = 0; j < array.length - i; j++){
                counter++;
                if (array[j] > array[j + 1]){
                    counter++;
                    int better = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = better;
                    toSort = true;
                }
            }
        }
        System.out.println("After:");
        System.out.println(Arrays.toString(array));
        System.out.println("Number of actions: " + counter);
    }
}
