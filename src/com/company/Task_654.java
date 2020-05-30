package com.company;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task_654 {
    public static void main(String[] args) throws IOException {
        try (FileInputStream fileInputStream = new FileInputStream(new File("input.txt"));
             Scanner scanner = new Scanner(fileInputStream);
             FileWriter fileWriter = new FileWriter("output.txt")) {
            int n = scanner.nextInt();
            int prev = scanner.nextInt();
            int max = prev;
            long sum = 0;
            for (int i = 1; i < n ; i++){
                int cur = scanner.nextInt();
                max = Math.max(max, cur);
                if( cur > prev){
                    sum += cur -prev;
                }
                prev = cur;

            }
            sum += max-prev;

            fileWriter.write(sum+"");
        }
    }
}
