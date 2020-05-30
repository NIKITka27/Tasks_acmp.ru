package com.company;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Poleshuk_Task_1 {
    public static void main(String[] args) throws IOException {
        try (FileInputStream fileInputStream = new FileInputStream(new File("input.txt"));
             Scanner scanner = new Scanner(fileInputStream);
             FileWriter fileWriter = new FileWriter("output.TXT")) {
            int n = scanner.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            int min = arr[0];
            int max = arr[0];
            int tempMin = 0;
            int tempMax = 0;
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    tempMin = j;
                }
                if (arr[j] > max) {
                    max = arr[j];
                    tempMax = j;
                }
            }

            fileWriter.write(tempMin + "\n");
            fileWriter.write(tempMax + " ");
        }
    }
}
