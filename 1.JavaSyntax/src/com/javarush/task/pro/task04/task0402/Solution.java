package com.javarush.task.pro.task04.task0402;

import java.util.Scanner;

/* 
Все любят Мамбу
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String text = " любит меня.";
        int s=0;
        while (s<10){
            System.out.println(name+text);
            s++;
        }

    }
}
