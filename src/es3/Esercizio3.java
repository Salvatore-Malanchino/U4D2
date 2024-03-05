package es3;

import java.util.Scanner;

public class Esercizio3 {


    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String spazio = "";

        do {
            System.out.println("inserisci una stringa");
            spazio = myScanner.nextLine();
            String[] caratteri = spazio.split("");
            System.out.println(String.join(",", caratteri));
        } while (!spazio.equals(":q"));
        {
            System.out.println("sei fuori");
        }

    }
}


//       int y= myScanner.nextInt();
//       int z = x>y ? x: y;
//
//       while (x <= x +6){
//           System.out.print(y);
//           y+=3;

//CON DO
//        do{
//            System.out.print(x = x + 1);
//        }while (x < 10);5 volt
