package es2;

import java.util.Scanner;

public class Esercizio2 {


    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("inserisci il tuo numero");
        int y = myScanner.nextInt();
        switch (y) {
            case 0: {
                System.out.print("Questo vale 0");
                break;
            }
            case 1: {
                System.out.print("Questo vale 1");
                break;
            }
            case 2: {
                System.out.print("Questo vale 2");
                break;
            }
            case 3: {
                System.out.print("Questo vale 3");
                break;
            }
            default: {
                System.out.print("nessuna delle precedenti");
            }
        }

    }
}

