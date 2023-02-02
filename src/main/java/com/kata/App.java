package com.kata;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Tamagotchi tamagochi = new Tamagotchi();
        Integer option;
        do {
            option=0;
            System.out.println(" 1. Eat \n 2. Play \n 3. Sleep \n 4. Poop \n 5. Status \n 6. Exit \n ");
            Scanner qwerty = new Scanner(System.in);
            option = Integer.parseInt(qwerty.next());

        if (option == 1) {
            tamagochi.eating();
            System.out.println(option);      
        }
        if (option == 2) {
            tamagochi.playing();
            System.out.println(option); 
        }
        if (option == 3) {
            tamagochi.sleeping();
        }            
        if (option == 4) {
            tamagochi.poop();
        }
        if (option == 5) {
            tamagochi.status(); 
        }
        if (option == 6) {
            qwerty.close();
        }

        } while (option != 6);
    }
}
