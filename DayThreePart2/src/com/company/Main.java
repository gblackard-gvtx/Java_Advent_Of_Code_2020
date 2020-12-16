package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fileByteStream = new FileInputStream("C:/Users/Adam/Documents/AOCD3.txt");
        Scanner scnr = new Scanner(fileByteStream);
        int rows = 323;
        int columns = 31;
        char [][] myArray = new char[rows][columns];
        int count1 =0;
        int count2 =0;
        int count3 =0;
        int count4 =0;
        int count5 =0;
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int f = 0;
        int k = 0;
        int l = 0;
        int n = 0;
        int o = 0;


        while(scnr.hasNextLine()) {
            for (int i=0; i<myArray.length; i++) {
                String line = scnr.nextLine();
                for (int j=0; j<line.length(); j++) {
                    myArray[i][j] = line.charAt(j);
                }
            }
        }
        while (k<rows){
            if (l > (columns -1)){
                l = (l - columns);
            }
            if (myArray[k][l] == '#'){
                count1++;
                k++;
                l+=3;
            }else{
                k++;
                l+=3;
            }
        }
        while (a<rows){
            if (b > (columns -1)){
                b = (b - columns);
            }
            if (myArray[a][b] == '#'){
                count2++;
                a++;
                b+=1;
            }else{
                a++;
                b+=1;
            }
        }
        while (c<rows){
            if (d > (columns -1)){
                d = (d - columns);
            }
            if (myArray[c][d] == '#'){
                count3++;
                c++;
                d+=5;
            }else{
                c++;
                d+=5;
            }
            while (n<rows){
                if (o > (columns -1)){
                    o = (o - columns);
                }
                if (myArray[n][o] == '#'){
                    count4++;
                    n++;
                    o+=7;
                }else{
                    n++;
                    o+=7;
                }
            }
            while (e<rows){
                if (f > (columns -1)){
                    f = (f - columns);
                }
                if (myArray[e][f] == '#'){
                    count5++;
                    e+=2;
                    f++;
                }else{
                    e+=2;
                    f++;
                }
            }
        }

        System.out.println(count1);
        System.out.println(count2);
        System.out.println(count3);
        System.out.println(count4);
        System.out.println(count5);
    }
}
