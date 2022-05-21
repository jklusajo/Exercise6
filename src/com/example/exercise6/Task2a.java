package com.example.exercise6;

import java.util.Arrays;

public class Task2a {
    public static void main(String[] args){
        int[] row = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int min, j, l;

        min = j = 0;
        for (l = j + 1; l < row.length; l++){
            if (row[l] < row[min]){
                min = l;
            }
            j++;
        }
        System.out.println("In array: ");
        System.out.println(Arrays.toString(row));
        System.out.println("The minimum value is on the index: " + min);
    }
}