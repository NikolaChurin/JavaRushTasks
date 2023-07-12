package test;

import java.util.Scanner;

public class TestTwo {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[]{"world", "world", "java", "task", "java", "world"};
//        for (int i = 0; i < strings.length; i++) {
//        strings[i] = scanner.nextLine();
//        }
        for (int i = 0; i < strings.length; i++) {
            String temp = strings[i];
            for (int j = i + 1; j < strings.length; j++) {
                if (strings[j] == null) break;
                if (strings[j].equals(temp)) {
                    strings[j] = null;
                    strings[i] = null;
                }
            }
        }
        for (int i = 0; i < strings.length; i++)
            System.out.print(strings[i] + ", ");

    }
}
