package com.company;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Task_58 {

    static boolean IsCute(int arr[][], int n, int m) {
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < m - 1; j++)
                if (arr[i][j] + arr[i][j + 1] + arr[i + 1][j] + arr[i + 1][j + 1] % 4 == 0)
                    return false;
        return true;
    }

    public static void main(String[] args) throws IOException {
        try (FileInputStream fileInputStream = new FileInputStream(new File("input.txt"));
             Scanner scanner = new Scanner(fileInputStream);
             FileWriter fileWriter = new FileWriter("output.txt")) {

            Integer t = Integer.parseInt(scanner.nextLine());
            List<String> result1 = new ArrayList<>();

            for (int i = 0; i < t; i++) {
                Integer n = scanner.nextInt();
                Integer m = scanner.nextInt();
                int arr[][] = new int[n][m];
                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < m; k++) {
                        arr[j][k] = scanner.nextInt();
                    }
                }
                if (IsCute(arr, n, m)) {
                    result1.add("YES");
                } else {
                    result1.add("NO");
                }
            }

            for (String result : result1) {
                fileWriter.write(result + "\n");
            }
        }


    }
}
