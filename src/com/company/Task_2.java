package com.company;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Task_2 {
    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static int search(int arr[], int element) {
        int firstIndex = 0;
        int lastIndex = arr.length - 1;
        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            if (arr[middleIndex] == element) {
                return middleIndex;
            } else if (arr[middleIndex] < element) {
                firstIndex = middleIndex + 1;
            } else if (arr[middleIndex] > element) {
                lastIndex = middleIndex - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {
        try (FileInputStream fileInputStream = new FileInputStream(new File("input.txt"));
             Scanner scanner = new Scanner(fileInputStream);
             FileWriter fileWriter = new FileWriter("output.TXT")) {
            int a = scanner.nextInt();
            Integer sumA = 0;
            if (a > 0) {
                for (int i = 0; i <= a; ++i) {
                    sumA += i;
                }
            } else {
                for (int i = 1; i >= a; --i) {
                    sumA += i;
                }
            }
            fileWriter.write(sumA.toString());
        }


        int[] array = {4, 6, 2, 5, 7, 8, 3};
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    swap(array, i, i - 1);
                    flag = true;
                }

            }

        }
        System.out.println(Arrays.toString(array));

    }
}