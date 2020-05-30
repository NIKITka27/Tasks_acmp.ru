package com.company;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task_175 {
    public static void main(String[] args) throws IOException {
        try (FileInputStream fileInputStream = new FileInputStream(new File("input.txt"));
             Scanner scanner = new Scanner(fileInputStream);
             FileWriter fileWriter = new FileWriter("output.TXT")) {
            String s = scanner.nextLine();
            String[] split = s.split(":");
            int time = 0;
            Integer h = Integer.parseInt(split[0]);
            Integer m = Integer.parseInt(split[1]);
            if (h < 10) {
                time = 20;
            } else if (h < 17) {
                time = 24;
            } else if (h < 20) {
                time = 29;
            } else {
                time = 34;
            }
            fileWriter.write(time * 60 - (h * 60 + m) + "");
        }
    }
}
