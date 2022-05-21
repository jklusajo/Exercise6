package com.example.exercise6;

import java.util.Arrays;

public class Task1a {
    public static void main(String[] args){
        int plane[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println("Before:");
        System.out.println(Arrays.toString(plane));

        for (int i = 0; i < plane.length - 1; i++){
            if (plane[i] > plane[i + 1]){
                int larger = plane[i];
                plane[i] = plane[i + 1];
                plane[i + 1] = larger;
            }
        }
        System.out.println("After: ");
        System.out.println(Arrays.toString(plane));
    }
}