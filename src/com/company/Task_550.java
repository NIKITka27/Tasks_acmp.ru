package com.company;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Task_550 {
    public static void main(String[] args) throws IOException {

        try (FileInputStream fileInputStream = new FileInputStream(new File("input.txt"));
             Scanner scanner = new Scanner(fileInputStream);
             FileWriter fileWriter = new FileWriter("output.txt")) {

            int year = scanner.nextInt();

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            GregorianCalendar gCal = new GregorianCalendar();

            gCal.setGregorianChange(new Date(Long.MIN_VALUE));

            gCal.set(year, 0, 0);
            gCal.add(Calendar.DAY_OF_YEAR, 256);

            sdf.setCalendar(gCal);
            String dayP = sdf.format(gCal.getTime());
            fileWriter.write(dayP);
        }


    }
}
