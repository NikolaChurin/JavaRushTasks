package com.javarush.task.pro.task04.task0414;

import java.util.Scanner;

/* 
Хорошего не бывает много
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int n = scanner.nextInt();
        do {
            System.out.println(word);
            n--;
        }
        while (n>0&&n<4);
     }
}