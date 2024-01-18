package src.src.src.ru.itmo.java.basics.lesson5;

import java.util.Arrays;
public class Task5 {
    public static void longWord(String n) {
        System.out.println("Task 1");
        String[] split = n.split(" ");
        System.out.println(Arrays.toString(split));
        int max = 0;
        String w = "";
        for (int a = 0; a < split.length; a++) {
            if (split[a].length() > max) {
                max = split[a].length();
                w = split[a];
            }
        }
        System.out.println("Слово: " + w + " Кол-во символов: " + max);
    }

    public static void palindrom(StringBuilder word) {
        System.out.println("Task 2");
        String w = word.toString();
        String r = word.reverse().toString();
        System.out.println(w);
        System.out.println(r);
        if (w.equalsIgnoreCase(r)) {
            System.out.println("Палиндром");
        } else {
            System.out.println("Не палиндром");
        }
    }

    public static void censored() {
        System.out.println("Task 3");
        String str1 = "Встретились Бяка и Бука.\n" +
                "Никто не издал ни звука.\n" +
                "Никто не подал и знака —\n" +
                "Молчали Бука и Бяка.";
        String zamStr = str1.replace("Бяка", "-вырезано цензурой-");
        System.out.println(zamStr);
    }

    public static void entryString(String a, String b) {
        System.out.println("Task 4");
        System.out.println(a);
        System.out.println(b);
        int d = 0;
        for (int c = 0; c < a.length(); c++) {
            if (a.contains(b)) {
                d++;
                a = a.replaceFirst(b, "");
            }
        }
        System.out.println("Вхождений: " + d);
    }

    public static void inverstString(String str) {
        System.out.println("Task 5");
        str = str.replace(":", "");
        StringBuilder s = new StringBuilder(str);
        StringBuilder w = new StringBuilder();
        str = s.reverse().toString();
        String[] split = str.split(" ");
        int a = split.length;
        String temp;
        for (int b = 0; b < a / 2; b++) {
            temp = split[a - b - 1];
            split[a - b - 1] = split[b];
            split[b] = temp;
        }
        for (String i : split) {
            w.append(i).append(" ");
        }
        System.out.println(w.toString());
    }
}