package es4;

import java.util.Scanner;

public class Esercizio4 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("innserisci il numero");
        int numeri = myScanner.nextInt();

        countdownn(numeri);
    }

    public static void countdownn(int num) {
        for (int i = num; i >= 0; i--) {


            System.out.println(i);
        }
    }
}
