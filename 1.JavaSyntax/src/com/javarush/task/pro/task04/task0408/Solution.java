package com.javarush.task.pro.task04.task0408;

import java.util.Scanner;

/* 
Максимум из введенных чисел
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = -2147483648;
        while (scanner.hasNextInt()) {
            int in = scanner.nextInt();
            if (in > max && in%2==0) max = in;
        }
        System.out.println(max);
    }
}