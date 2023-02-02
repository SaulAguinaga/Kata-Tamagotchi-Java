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

    @Test
    public void should_be_tired()
    {
        Tamagotchi tamagotchi = new Tamagotchi();
        tamagotchi.setEnergy(1);
        String result = tamagotchi.checkingEnergy();
        assertEquals(result, "(-_-)");
    }
    @Test
    public void should_be_sleeped()
    {
        Tamagotchi tamagotchi = new Tamagotchi();
        tamagotchi.setEnergy(0);
        String result = tamagotchi.checkingEnergy();
        assertEquals(result, "(-_-)zZZ");
    }
    @Test
    public void should_be_normal_energy()
    {
        Tamagotchi tamagotchi = new Tamagotchi();
        tamagotchi.setEnergy(3);
        String result = tamagotchi.checkingEnergy();
        assertEquals(result, ":-|");
    }
    @Test
    public void should_be_happy()
    {
        Tamagotchi tamagotchi = new Tamagotchi();
        tamagotchi.setMood(9);
        String result = tamagotchi.checkingMood();
        assertEquals(result, ":-)");
    }
    @Test
    public void should_be_angry()
    {
        Tamagotchi tamagotchi = new Tamagotchi();
        tamagotchi.setMood(1);
        String result = tamagotchi.checkingMood();
        assertEquals(result, "ఠ_ఠ");
    }
    @Test
    public void should_be_nomral_mood()
    {
        Tamagotchi tamagotchi = new Tamagotchi();
        tamagotchi.setMood(5);
        String result = tamagotchi.checkingMood();
        assertEquals(result, ":-|");
    }
    
}
