package com.javarush.task.pro.task04.task0407;

/* 
Сумма чисел, не кратных 3
*/

public class Solution {
    public static void main(String[] args) {
        int n = 0;
        int sum = 0;
        while (true) {
            n++;
            if (n % 3 != 0)
                sum = sum + n;
            if (n < 100) continue;
            else break;
        }
        System.out.println(sum);
    }
}
