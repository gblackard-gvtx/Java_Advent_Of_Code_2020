package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fileByteStream = new FileInputStream("C:/Users/Adam/Documents/AOCD1.txt");
        Scanner scnr = new Scanner(fileByteStream);
        ArrayList<Integer> num = new ArrayList<>();

        while (scnr.hasNext()){
            num.add(scnr.nextInt());
        }
        for (int k = 0; k < num.size() ; k++) {
            for (int i = 0; i < num.size(); i++) {
                for (Integer integer : num) {
                    if ((num.get(k) + num.get(i) + integer) == 2020) {
                        System.out.println(num.get(k) + num.get(i) + " + " + integer + " = " + (num.get(i)) * integer);
                    }
                }
            }
        }
        scnr.close();
    }
}

