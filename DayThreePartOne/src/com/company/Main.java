package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fileByteStream = new FileInputStream("C:/Users/Adam/Documents/AOCD3.txt");
        Scanner scnr = new Scanner(fileByteStream);
        int count = 0;
        int i = 0;
        int line = 0;

        while (scnr.hasNextLine()) {

            String txtData = scnr.nextLine();
            if(i > (txtData.length() -1)){
                i = (i - txtData.length());
            }
            if (txtData.charAt(i) == '#'){
                count++;
            }
            i+=3;
        }
        System.out.println(count);
    }
}
