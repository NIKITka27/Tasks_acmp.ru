package com.company;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Task_99 {
    public static void main(String[] args) throws IOException {
        try (FileInputStream fileInputStream = new FileInputStream(new File("input.txt"));
             Scanner scanner = new Scanner(fileInputStream);
             FileWriter fileWriter = new FileWriter("output.txt")) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            String arr[][][] = new String[a][b][c];
            for (int i = 0; i < a ; i++){
                for (int j = 0; j < b ; j++){
                    for (int q = 0; q< c ; q++){

                    }
                }
            }






            fileWriter.write(Arrays.toString(arr));
        }
    }
}
