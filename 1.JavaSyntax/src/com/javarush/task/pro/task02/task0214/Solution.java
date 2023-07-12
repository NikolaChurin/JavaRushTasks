package com.javarush.task.pro.task02.task0214;

import java.util.Scanner;

/*
Чтение и преобразование строк
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str_one = scanner.nextLine();
        String str_two = scanner.nextLine();
        String str_three = scanner.nextLine();
        System.out.println(str_three);
        System.out.println(str_two.toUpperCase());
        System.out.println(str_one.toLowerCase());
    }
}
