package com.company;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Task_254 {
    public static void main(String[] args) throws IOException {

        try (FileInputStream fileInputStream = new FileInputStream(new File("input.txt"));
             Scanner scanner = new Scanner(fileInputStream);
             FileWriter fileWriter = new FileWriter("output.txt")) {
            Integer numberOfGraf = Integer.parseInt(scanner.nextLine());

            List<String> grafs = Arrays.asList(scanner.nextLine().split(" "));

            Integer numberOfChoice = Integer.parseInt(scanner.nextLine());

            List<List<String>> listOfChoices = new ArrayList<>();

            for (int i = 0; i < numberOfChoice; i++) {
                listOfChoices.add(Arrays.asList(scanner.nextLine().split(" ")));
            }

            String[] arrGrafs = new String[grafs.size()];
            arrGrafs = grafs.toArray(arrGrafs);
            String[] arrGrafsCopy = arrGrafs.clone();


            for (int i = 0; i < numberOfChoice; ++i) {
                for (int j = 0; j < arrGrafs.length; ++j) {
                    List<String> choice = listOfChoices.get(i);
                    if (Integer.parseInt(arrGrafs[j]) == Integer.parseInt(choice.get(0))) {
                        arrGrafsCopy[j] = choice.get(1);
                    }
                }
            }

            String arrGraf = " ";
            for (int i = 0; i < arrGrafsCopy.length; i++) {
                arrGraf = arrGraf + " " + arrGrafsCopy[i];
            }


            fileWriter.write(arrGraf);
        }


    }

}
