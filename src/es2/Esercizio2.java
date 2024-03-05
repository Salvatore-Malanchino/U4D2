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

// SWTICH CASE + SCANNNER
//        Scanner myScanner = new Scanner((System.in));
//        System.out.print("Dammi X");
//        int x= myScanner.nextInt();
//
//        System.out.print("Dammi Y");
//        int y= myScanner.nextInt();
//        int z = x>y ? x: y;
//        switch (z) {
//            case 10:{ System.out.print("z è 10");
//            break;}
//            case 100:{ System.out.print("z è 100");
//            break;}
//            case 1000:{ System.out.print("z è 10000");
//            break;}
//            default:{System.out.print("z non è nessuno di questi");
//            break;}
//
//            }
//            myScanner.close();