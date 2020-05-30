package com.company;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Task_7 {
    static String max(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return s1;
        } else if (s1.length() < s2.length()) {
            return s2;
        }
        if (s1.equals(s2)) {
            return s1;
        }
        int i = 0;
        while (true) {
            if (s1.charAt(i) > s2.charAt(i)) {
                return s1;

            } else if (s1.charAt(i) < s2.charAt(i)) {
                return s2;
            }
            i++;

        }

    }

    public static void main(String[] args) throws IOException {
        try (FileInputStream fileInputStream = new FileInputStream(new File("input.txt"));
             Scanner scanner = new Scanner(fileInputStream);
             FileWriter fileWriter = new FileWriter("output.TXT")) {
            String s = scanner.nextLine();
            String[] split = s.split(" ");
            String s1 = split[0];
            String s2 = split[1];
            String s3 = split[2];
            String max = max(s1, max(s2, s3));

            fileWriter.write(max);
        }

    }
}
