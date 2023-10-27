package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1. Skriv ut ”Hej, världen!” med System.out.println().
        System.out.println("Hej, världen!");

        // 2. Skapa en variabel av typen int och skriv ut via System.out.println()
        // ”Ditt nummer är ” plus din variabel.
        int dittNummer = 5;
        System.out.println("Ditt nummer är " + dittNummer);

        // 3. Skapa två stycken variabler av variabel-typen int.
        // Addera dessa till en ny int-variabel och
        // skriv ut mer System.out.println().
        int num1 = 3;
        int num2 = 7;
        int num3 = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + num3);

        // 4. Skapa två variabler av typen byte. Gör så att tillsammans
        // så blir deras värde över vad en byte
        // kan innehålla. Vad händer om du försöker addera de två och
        // sätta in resultatet i en ny byte?
        byte b1 = 126;
        byte b2 = 2;
        //byte b3 = b1 + b2;

        // 5. När det ovan får ett error, försök att sätta din ekvation
        // inom en parantes, sedan skriva (byte)
        // framför det. Vad händer då? Vad för värde får du?
        byte b3 = (byte)(b1 + b2);
        System.out.println(b1 + " + " + b2 + " = " + b3);
        byte hight = 127;
        hight += 1;
        System.out.println(hight);
        // 00000000

        // 6. Be användaren att skriva in sitt namn med en
        // System.out.println(), sedan låt dem faktiskt
        // göra det med Scanner scanner = new Scanner(System.in);
        // och sedan String name = scanner.nextLine();.
        // Skriv ut en hälsning där du refererar till användaren som
        // det namn de skrev in.
        //System.out.println("What's your name?");
        Scanner scanner = new Scanner(System.in);
        /*String name = scanner.nextLine();
        System.out.println("Welcome, " + name + "!");*/

        // 7. Förläng programmet. Låt dem skriva in sitt namn, ålder,
        // email och adress en åt gången, och
        // sedan skriv ut alla dessa variabler samtidigt i en enda rad.
        // Addera era strings.
        /*System.out.println("What's your name?");
        String name = scanner.nextLine();
        System.out.println("What's your age?");
        String age = scanner.nextLine();
        System.out.println("What's your address?");
        String address = scanner.nextLine();
        System.out.println("Name: " + name + ", Age: " + age + ", Address: " + address);
*/
        // 8. Skapa en enkel miniräknare. Be användaren först om ett
        // nummer, som de skriver in med
        // System.out.println(). Gör om stringen du får till ett nummer
        // med Integer.parseInt(). Sedan be
        // dem skriva in ett till. Efter att du fått två nummer från
        // användaren, addera dem och skriv ut
        // resultatet till användaren.
        System.out.println("Write a number.");
        /*String numberInput = scanner.nextLine();
        int firstNumber = Integer.parseInt(numberInput);*/
        int firstNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Write a second number.");
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int added = firstNumber + secondNumber;
        System.out.println(firstNumber + " + " + secondNumber + " = " + added);
        
    }
}