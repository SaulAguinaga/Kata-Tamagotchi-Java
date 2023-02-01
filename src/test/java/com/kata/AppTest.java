package com.kata;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

public class AppTest 
{

    @Test
    public void should_eat()
    {
        Tamagotchi tamagochi = new Tamagotchi();
        tamagochi.eating();
        int hungry = tamagochi.getHunger();
        int energy = tamagochi.getEnergy();
        int fullness = tamagochi.getFullness();
        assertEquals(2, hungry);
        assertEquals(1, fullness);
        assertEquals(5, energy);
    }

    @Test
    public void should_play()
    {
        Tamagotchi tamagochi = new Tamagotchi();
        tamagochi.playing();
        int mood = tamagochi.getMood();
        int energy = tamagochi.getEnergy();
        int hunger = tamagochi.getHunger();
        assertEquals(5, mood);
        assertEquals(3, energy);
        assertEquals(5, hunger);
    }

    @Test
    public void should_sleep()
    {
        Tamagotchi tamagochi = new Tamagotchi();
        tamagochi.sleeping();
        int energy = tamagochi.getEnergy();
        assertEquals(6, energy);
    }

    @Test
    public void should_poop()
    {
        Tamagotchi tamagochi = new Tamagotchi();
        tamagochi.eating();
        tamagochi.poop();
        int fullness = tamagochi.getFullness();
        assertEquals(0, fullness);
    }
}
