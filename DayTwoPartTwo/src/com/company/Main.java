package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fileByteStream = new FileInputStream("C:/Users/Adam/Documents/AOCD2P1.txt");
        Scanner scnr = new Scanner(fileByteStream);
        String aocstr;
        int pass =0;
        while (scnr.hasNextLine()) {
            aocstr = scnr.next();
            if (aocstr.contains("-")) {

                String[] arrofSTR = aocstr.split("-");
                int one = Integer.parseInt(arrofSTR[0]);
                int two = Integer.parseInt(arrofSTR[1]);
                char letter = scnr.next().charAt(0);
                String password = scnr.next().trim();
                if (password.charAt(one - 1) == letter && password.charAt(two - 1) == letter ){
                    System.out.println();
                }
                else if (password.charAt(one - 1) == letter) {
                    System.out.println("" + one + "-" + two + letter + ": " + password);
                    pass++;
                    System.out.println("First Char");
                }
                else if (password.charAt(two - 1) == letter){
                    System.out.println("" + one + "-" + two + letter + ": " + password);
                    pass++;
                    System.out.println("Second Char");
                }

            }
        }
        System.out.println(pass);
        scnr.close();
    }
}
