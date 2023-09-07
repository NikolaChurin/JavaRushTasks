package com.javarush.task.pro.task04.task0406;

import java.util.Scanner;

/* 
Показываем, что получаем
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String i = scanner.nextLine();
            if (i.equals("enough")) break;
            System.out.println(i);
        }
    }
}