package com.javarush.task.pro.task04.task0415;

import java.util.Scanner;

/* 
Площадь круга
*/

public class Solution {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      double pi = 3.14;
      double radius = scanner.nextDouble();
      int s =(int) (pi * radius * radius);
        System.out.println(s);
    }
}