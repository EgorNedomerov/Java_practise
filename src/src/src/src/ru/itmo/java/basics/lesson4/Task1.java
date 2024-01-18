package src.src.src.ru.itmo.java.basics.lesson4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Task1 {
    public static void task1() {
        System.out.println("Task 1");
        for (int x = 1; x <= 99; x++) {
            if (x % 2 != 0) {
                System.out.println(x);
            }
        }

        System.out.println("Task 2");
        System.out.print("/ 3: ");
        for (int x = 1; x <= 100; x++) {
            if (x % 3 == 0) {
                System.out.print(x + " ");
            }
        }
        System.out.println();
        System.out.print("/ 5: ");
        for (int x = 1; x <= 100; x++) {
            if (x % 5 == 0) {
                System.out.print(x + " ");
            }
        }
        System.out.println();
        System.out.print("/ 3 and / 5: ");
        for (int x = 1; x <= 100; x++) {
            if (x % 3 == 0 && x % 5 == 0) {
                System.out.print(x + " ");
            }
        }

        System.out.println("Task 3");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 number:");
        int a = scanner.nextInt();
        System.out.println("Enter 2 number:");
        int b = scanner.nextInt();
        System.out.println("Enter 3 number:");
        int c = scanner.nextInt();

        boolean d;
        if (a + b == c) {
            d = true;
        } else {
            d = false;
        }
        System.out.println("Result: " + d);
        System.out.println("Task 4");
        if (a < b && c > b) {
            d = true;
        } else {
            d = false;
        }
        System.out.println("Result: " + d);
        System.out.println("Task 5");
        System.out.println("Enter a number from 2: ");
        int length = scanner.nextInt();
        if (length >= 2) {
            int[] num = new int[length];
            Random randomizer = new Random();
            for (int k = 0; k < num.length; k++) {
                num[k] = randomizer.nextInt(30);
            }
            System.out.println("array = " + Arrays.toString(num));
            for (int k = 0; k < num.length; k++) {
                if (num[0] == 3 || num[num.length - 1] == 3) {
                    d = true;
                } else {
                    d = false;
                }
            }
            System.out.println("result = " + d);

            System.out.println("Task 6");
            for (int k = 0;
                 k < num.length; k++) {
                if (num[k] == 3 || num[k] == 1) {
                    d = true;
                } else {
                    d = false;
                }
            }
            System.out.println("result = " + d);
        }
        System.out.println("Second part");
    }
}