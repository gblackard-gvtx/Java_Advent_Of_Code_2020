package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fileByteStream = new FileInputStream("C:/Users/Adam/Documents/AOCD4.txt");
        Scanner scnr = new Scanner(fileByteStream);
        ArrayList<String> passports = new ArrayList<String>();
        String passport = "";
        int legal= 0;
        int count = 0;


        while (scnr.hasNextLine()){
            String line = scnr.nextLine();
            if (line.equals("")) {
                passports.add(passport);
                passport = "";
            } else {
                passport += " " + line;}
        }
        passports.add(passport); // adds in last passport found
        for (String s : passports) {
            if (isLegal(s)) {
                legal++;
            }

        }
        System.out.println(legal);

    }
    private static boolean isLegal(String pp) {

        return pp.contains("byr:") && pp.contains("iyr:") && pp.contains("eyr:")
                && pp.contains("hgt:") && pp.contains("hcl:") && pp.contains("ecl:")
                && pp.contains("pid:");

    }
}

