package com.javarush.task.pro.task04.task0410;

import java.util.Scanner;

/* 
Второе минимальное число из введенных
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 2;
        int b = 2;
        int i = 0;
        while (scanner.hasNextInt()) {
            if (i < 1) a = b = scanner.nextInt();
            i++;
            int n = scanner.nextInt();
            if (a == b && n > b) b = n;
            if (n < b && n < a) {
                b = a;
                a = n;
            }
            if (n < b && n > a) b = n;
        }
        System.out.println(b);
    }
}
