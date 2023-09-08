package com.javarush.task.pro.task05.task0508;

import java.util.Scanner;

/* 
Удаляем одинаковые строки
*/

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        strings = new String[6];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            strings[i] = scanner.nextLine();
        }
        for (int i = 0; i < 5; i++) {
            String word = strings[i];
            for (int j = i + 1; j < 6; j++) {
                if (word!=null && word.equals(strings[j])) {
                    strings[j] = null;
                    strings[i] = null;
                }
            }
        }
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}
