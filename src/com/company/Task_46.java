package com.company;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task_46 {
    public static void main(String[] args) throws IOException {
        try (FileInputStream fileInputStream = new FileInputStream(new File("input.txt"));
             Scanner scanner = new Scanner(fileInputStream);
             FileWriter fileWriter = new FileWriter("output.txt")) {
            Integer n = Integer.parseInt(scanner.nextLine());
            String result = "" ;
            int arrE[] = {2,7,1,8,2,8,1,8,2,8,4,5,9,0,4,5,2,3,5,3,6,0,2,8,7,5};
            if(n==0){
                result = "3";
            }else if(n==25){
                result = "2.7182818284590452353602875";
            }else{
                for(int d = 0 ;d<=n; d++){
                    if(d==1){
                        result = "2.";
                    }
                    if (d==n && arrE[n+1]>=5&&n!=26 ){
                        arrE[d]=arrE[d]+1;
                    }
                    result = result+ arrE[d];
                }
            }

            fileWriter.write(result);
        }

    }
}
