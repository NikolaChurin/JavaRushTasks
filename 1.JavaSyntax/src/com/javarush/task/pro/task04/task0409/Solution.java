package com.javarush.task.pro.task04.task0409;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 2147483647;
        while (scanner.hasNextInt()) {
            int in = scanner.nextInt();
            if (in < min) min = in;
        }
        System.out.println(min);
    }
}