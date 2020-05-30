package com.company;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task_16 {

    static int get_count(int prev_level, int n) {
        if (0 == n)
            return 1;

        int count = 0;
        for (int level = 1; level < prev_level; ++level) {
            if ((n - level) < 0)
                break;
            count += get_count(level, n - level);
        }

        return count;
    }


    public static void main(String[] args) throws IOException {
        try (FileInputStream fileInputStream = new FileInputStream(new File("input.txt"));
             Scanner scanner = new Scanner(fileInputStream);
             FileWriter fileWriter = new FileWriter("output.TXT")) {
            int n = scanner.nextInt();
            int count = get_count(n + 1, n);
            fileWriter.write(count + "");
        }
    }
}
