package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int sumIn = 0;
        boolean exit = false;
        while (!exit) {
            if (scanner.hasNextInt()) {
                sumIn = scanner.nextInt();
                sum = sum + sumIn;
            } else {
                String word = scanner.nextLine();
                exit = word.equals("ENTER");
            }
        }
        System.out.println(sum);
    }
}