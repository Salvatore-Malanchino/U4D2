package es1;

import java.util.Scanner;

public class Esercizio1 {
public static boolean stringaPariDispari(String myString){
return  myString.length() %2==0;

    }

    public static void main(String[] args) {
        Scanner myScanner=new Scanner(System.in);
        System.out.print("inserisci la prima stringa");
       String myFirstString= myScanner.nextLine();
        if (stringaPariDispari(myFirstString)){
            System.out.print("la stringa è pari");
        }else { System.out.print("la stringa è dispari");}




        }
    }

