package com.example.exercise6;

import java.util.Arrays;

public class Task3 {
    public static void sort(int[] array) {sort(array, 0, array.length - 1);}

    static void sort(int[] numbers, int start, int end) {
        if (start < end) {
            int s = segment(numbers, start, end);
            sort(numbers, start, s - 1);
            sort(numbers, s + 1, end);
        }
    }

    static int segment(int[] numbers, int start, int end) {
        int fulcrum = numbers[end];
        int x = start - 1;
        for (int i = start; i < end; i++) {
            if (numbers[i] < fulcrum) {
                x++;

                int fly = numbers[x];
                numbers[x] = numbers[i];
                numbers[i] = fly;
            }
        }

        int fly = numbers[x + 1];
        numbers[x + 1] = numbers[end];
        numbers[end] = fly;
        return x + 1;
    }

    public static void main(String[] args){
        int array[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println("Before:");
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("After:");
        System.out.println(Arrays.toString(array));
    }
}