package com.example.exercise6;

import java.util.Arrays;
import java.util.Collections;

public class Task2c {
    public static void main(String[] args) {
        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println("Before:");
        System.out.println(Arrays.toString(array));

        int min, max, a, b = 0, c, fav;

        for (a = 0; b < array.length - 1; a++, b--){
            min = array[a];
            max = array[a];
            int min_a = a, max_a = a;
            for (c = a; c <= b; c++) {
                if (array[c] > max) {
                    max = array[c];
                    max_a = c;
                } else if (array[c] < min) {
                    min = array[c];
                    min_a = c;
                }
            }

            Collections.swap(Collections.singletonList((array)), a, min_a);

            if (array[min_a] == max)
                Collections.swap(Collections.singletonList((array)), b, min_a);
            else
                Collections.swap(Collections.singletonList((array)), b, max_a);
        }
        System.out.println("After:");
        System.out.println(Arrays.toString(array));
    }
}