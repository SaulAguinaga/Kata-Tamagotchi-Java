package com.kata;

public class Tamagotchi {
    
    int mood = 4;
    int hunger = 4;
    int energy = 4;
    
    
    public Tamagotchi(int mood, int hunger, int energy) {
        this.mood = mood;
        this.hunger = hunger;
        this.energy = energy;
    }


    public int getMood() {
        return mood;
    }


    public void setMood(int mood) {
        this.mood = mood;
    }


    public int getHunger() {
        return hunger;
    }


    public void setHunger(int hunger) {
        this.hunger = hunger;
    }


    public int getEnergy() {
        return energy;
    }


    public void setEnergy(int energy) {
        this.energy = energy;
    }
    
    
}
