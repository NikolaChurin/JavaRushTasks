package com.javarush.task.pro.task05.task0516;

import java.util.Arrays;

/* 
Заполняем массив
*/

public class Solution {

    public static int[] array = new int[21];
    public static int valueStart = 10;
    public static int valueEnd = 13;

    public static void main(String[] args) {
        boolean honest = array.length % 2 == 0;
        int midle = array.length / 2;
        if (!(array.length % 2 == 0)) midle++;
        Arrays.fill(array, 0, midle, valueStart);
        Arrays.fill(array, midle, array.length, valueEnd);
        System.out.println(Arrays.toString(array));
    }
}
