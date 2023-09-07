package com.javarush.task.pro.task04.task0417;

import java.util.Scanner;

/* 
Скорость ветра
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int speed = scanner.nextInt();
        double speedAnswer = speed * 3.6;
        int answer = (int) Math.round(speedAnswer);
        System.out.println(answer);

    }
}