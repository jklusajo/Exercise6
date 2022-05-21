package com.example.exercise6;

import java.util.Arrays;

public class Task2b {
    public static void main(String[] args){
        int[] line = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int counter = 0;

        System.out.println("Before: ");
        System.out.println(Arrays.toString(line));

        int min, j, l, flee;

        for (j = 0; j < line.length - 1; j++){
            counter++;
            min = j;
            for (l = j + 1; l < line.length; l++){
                counter++;
                if (line[l] < line[min]){
                    counter++;
                    min = l;
                }
            }
            flee = line[min];
            line[min] = line[j];
            line[j] = flee;
        }

        System.out.println("After: ");
        System.out.println(Arrays.toString(line));
        System.out.println("Number of actions: " + counter);
    }
}