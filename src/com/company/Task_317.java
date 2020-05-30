package com.company;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task_317 {
    public static void main(String[] args) throws IOException {
        try (FileInputStream fileInputStream = new FileInputStream(new File("input.txt"));
             Scanner scanner = new Scanner(fileInputStream);
             FileWriter fileWriter = new FileWriter("output.txt")) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();
            int w =  scanner.nextInt();
            int tempX,tempY,tempZ;
            int sum =0;
            for (int i=0;i<=w/x;i++){
                for (int j=0;j<=(w-(tempX=x*i))/y;j++){
                    tempY=y*j;
                    tempZ=w-(tempX+tempY);
                    if(tempZ%z==0){sum++;}
                }
            }

            fileWriter.write(sum+"");
        }
    }
}
