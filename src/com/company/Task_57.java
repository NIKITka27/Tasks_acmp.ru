package com.company;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task_57 {
    public static double len(int x1, int y1, int x2, int y2) throws Exception {
        double result = Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2);
        if (result < 0) {
            throw new Exception();
        }
        return Math.sqrt(result);
    }

    public static void main(String[] args) throws IOException {
        try (FileInputStream fileInputStream = new FileInputStream(new File("input.txt"));
             Scanner scanner = new Scanner(fileInputStream);
             FileWriter fileWriter = new FileWriter("output.TXT")) {
            int n = scanner.nextInt();
            int c = scanner.nextInt();
            long p = scanner.nextLong();
            double result = 0;
            int[] arrX = new int[n];
            int[] arrY = new int[n];
            for (int i = 0; i < n; i++) {
                arrX[i] = scanner.nextInt();
                arrY[i] = scanner.nextInt();
            }
            int xnet = scanner.nextInt();
            int ynet = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                result = len(arrX[i], arrY[i], xnet, ynet);
                for (int j = 0; j < n; j++) {
                    result += len(arrX[i], arrY[i], arrX[j], arrY[j]);
                }
                if (result * c - p < 10e-5) {
                    fileWriter.write("YES");
                    return;
                }

            }

            fileWriter.write("NO");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
