package com.company;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task_195 {
    public static void main(String[] args) throws IOException {

        try (FileInputStream fileInputStream = new FileInputStream(new File("input.txt"));
             Scanner scanner = new Scanner(fileInputStream);
             FileWriter fileWriter = new FileWriter("output.txt")) {

            Integer a = 2;
            while (scanner.hasNextInt()) {
                a *= scanner.nextInt();
            }


            fileWriter.write(a.toString());
        }


    }


}
