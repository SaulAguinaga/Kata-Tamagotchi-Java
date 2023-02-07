package com.kata;

import java.time.LocalDateTime;
import static java.time.temporal.ChronoUnit.DAYS;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Tamagotchi tamagochi = new Tamagotchi();

        LocalDateTime bornDay = LocalDateTime.parse("2023-02-01T00:00"); 
        LocalDateTime today = LocalDateTime.now();
        long days = DAYS.between(bornDay, today);

        Integer option;
        do {
            option=0;
            System.out.println(" 1. Eat \n 2. Play \n 3. Sleep \n 4. Poop \n 5. Status \n 6. Exit \n ");
            Scanner qwerty = new Scanner(System.in);
            option = Integer.parseInt(qwerty.next());

        if (option == 1) {
            tamagochi.eating();     
        }
        if (option == 2) {
            tamagochi.playing();
        }
        if (option == 3) {
            tamagochi.sleeping();
        }            
        if (option == 4) {
            tamagochi.poop();
        }
        if (option == 5) {
            System.out.println("Días de vida: " + days);
            tamagochi.status(); 
        }
        if (option == 6) {
            qwerty.close();
        }

        } while (option != 6);
    }
}
