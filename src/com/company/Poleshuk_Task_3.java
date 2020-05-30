package com.company;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Poleshuk_Task_3 {
    public static int sum(int a, int b) {
        int result = a + b;
        return result;
    }

    public static int raz(int a, int b) {
        int result = a - b;
        return result;

    }


    public static double pow(int a, int b) {
        double pow = Math.pow(a, b);

        return pow;

    }

    public static int ymn(int a, int b) {
        int result = a * b;

        return result;

    }

    public static int del(int a, int b) {
        int result = a / b;
        return result;
    }


    public static int del_ost(int a, int b) {
        int result = a % b;

        return result;

    }

    public static void main(String[] args) throws IOException {
        try (FileInputStream fileInputStream = new FileInputStream(new File("input.txt"));
             Scanner scanner = new Scanner(fileInputStream);
             FileWriter fileWriter = new FileWriter("output.TXT")) {
            String line = scanner.nextLine();

            line.contains("-");
            line.contains("/");
            line.contains("*");
            line.contains("%");
            line.contains("()");


            String[] s1 = line.split(" ");
            Integer a = Integer.parseInt(s1[0]);
            Integer b = Integer.parseInt(s1[1]);

            fileWriter.write("" + sum(a, b));
        }
    }
}
