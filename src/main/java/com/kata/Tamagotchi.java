package com.kata;

public class Tamagotchi {
    
    int mood = 4;
    int hunger = 4;
    int energy = 4;
    int fullness = 0;
    
    
    public Tamagotchi() {
        
    }

    public void eating(){
        hunger -= 2;
        energy ++;
        fullness ++;
    }
    public void playing(){
        mood ++;
        hunger ++;
        energy --;
    }
    public void sleeping(){
        energy += 2;
    }
    public void poop(){
        fullness = 0;
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

    public int getFullness() {
        return fullness;
    }

    public void setFullness(int fullness) {
        this.fullness = fullness;
    }
    
}
