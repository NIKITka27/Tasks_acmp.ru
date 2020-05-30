package com.company;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task_17 {
    public static void main(String[] args) throws IOException {
        try (FileInputStream fileInputStream = new FileInputStream(new File("input.txt"));
             Scanner scanner = new Scanner(fileInputStream);
             FileWriter fileWriter = new FileWriter("output.TXT")) {
            int n = scanner.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            for (int p = 1; p <= n - 1; p++) {
                if ((n - 1) % p == 0) {
                    boolean good = true;
                    for (int i = p; i < n - 1; i++) {
                        if (a[i] != a[i - p]) {
                            good = false;
                            break;
                        }
                    }
                    if (good) {
                        fileWriter.write(p + "");
                        return;
                    }
                }

            }
        }

    }
}
