package src.src.src.ru.itmo.java.basics.lesson4;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Task2 {
    public static void task2 () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Task 1");
        int[] num = new int[10];
        Random randomizer = new Random();
        for (int a = 0; a < num.length; a++) {
            num[a] = randomizer.nextInt(30);
        }
        System.out.println("array = " + Arrays.toString(num));
        for (int a = 0; a < num.length; a++) {
            for (int b = 0; b < num.length - a - 1; b++) {
                if (num[b + 1] < num[b]) {
                    int c = num[b + 1];
                    int d = num[b];
                    num[b] = a;
                    num[b + 1] = d;
                }
            }
        }
        System.out.println("array = " + Arrays.toString(num));
        boolean sorted = true;
        for (int a = 0; a < num.length; a++) {
            for (int b = 0; b < num.length - a - 1; b++) {
                if (num[b] > num[b + 1]) {
                    sorted = false;
                    break;
                }
            }
        }
        if (sorted) {
            System.out.println("OK");
        } else {
            System.out.println("Please, try again!");
        }
        System.out.println("Task 2");
        System.out.println("Enter number: ");
        int length = scanner.nextInt();
        int[] arr = new int[length];
        for (int a = 0; a < arr.length; a++) {
            System.out.println("Enter number: ");
            arr[a] = scanner.nextInt();
        }
        System.out.println("Result: " + Arrays.toString(arr));

        System.out.println("Task 3");
        System.out.println("Array 1: " + Arrays.toString(arr));
        int b = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = b;
        System.out.println("Array 2: " + Arrays.toString(arr));

        System.out.println("Task 4");
        int[] num2 = new int[10];

        for (int a = 0; a < num2.length; a++) {
            num2[a] = randomizer.nextInt(30);
        }
        System.out.println("array = " + Arrays.toString(num2));
        int d = num2[0];
        for (int a = 0; a < num2.length; a++) {
            for (int c = a + 1; c < num2.length; c++) {
                if (d == num2[c]) {
                    d = num2[a + 1];
                }
                System.out.println(d);
                break;
            }
            break;
        }
    }
}
