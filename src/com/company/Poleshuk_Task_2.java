package com.company;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Poleshuk_Task_2 {
    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) throws IOException {
        try (FileInputStream fileInputStream = new FileInputStream(new File("input.txt"));
             Scanner scanner = new Scanner(fileInputStream);
             FileWriter fileWriter = new FileWriter("output.TXT")) {
            int n = scanner.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            boolean flag = true;
            while (flag) {
                flag = false;
                for (int i = 1; i < arr.length; i++) {
                    if (arr[i] > arr[i - 1]) {
                        swap(arr, i, i - 1);
                        flag = true;
                    }

                }

            }

            fileWriter.write(Arrays.toString(arr));

        }
    }


}
