package com.company;

import java.io.*;
import java.util.Scanner;

public class Task_53 {
    public static void main(String[] args) throws IOException {
        try (FileInputStream fileInputStream = new FileInputStream(new File("input.txt"));
             Scanner scanner = new Scanner(fileInputStream);
             FileWriter fileWriter = new FileWriter("output.txt")) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int red = 0;
            int green = 0;
            int blue = 0;
            int black = 0;
            for (int i = 1;i<=a; i++){
                for (int j = 1;j<=b; j++){
                    int q =(i*j);
                    if (q%2==0&&q%3!=0&&q%5!=0){
                        red++;
                    } else if (q%3==0&&q%5!=0){
                        green++;
                    }else if (q%5==0){
                        blue++;
                    }


                }

            }
            black = a*b - red -green-blue;
            fileWriter.write("RED : "+ red + "\n");
            fileWriter.write("GREEN : "+ green+ "\n");
            fileWriter.write("BLUE : "+ blue+ "\n");
            fileWriter.write("BLACK : "+ black+ "\n");


        }
    }
}

