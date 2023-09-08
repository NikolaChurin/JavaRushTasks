package com.javarush.task.pro.task05.task0505;

import java.util.Scanner;

/* 
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }


        if (n % 2 != 0) {
            for (int i = 0; i < n; i++) {
                System.out.println(array[i]);
            }
        } else {
            for (int i = n-1; i > -1; i--) {
                System.out.println(array[i]);
            }
        }
    }
}



