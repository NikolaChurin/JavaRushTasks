package com.javarush.task.pro.task04.task0405;

/* 
Незаполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {
        int n = 0;
        while (n < 10) {
            int a = 0;
            while (a < 20) {
                System.out.print(n > 0 && n < 9 && a > 0 && a < 19 ? " " : "Б");
                a++;
            }
            n++;
            System.out.println();
        }
    }
}