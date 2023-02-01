package com.kata;

public class Tamagotchi {
    
    int mood = 4;
    int hunger = 4;
    int energy = 4;
    int fullness = 0;
    
    
    public Tamagotchi() {
        
    }

    private void checking() {
        if (energy < 3 && energy > 0) {
            System.out.println("Energy: (-_-)");
        }
        if(energy == 0){
            System.out.println("Energy: (-_-)zZZ");
        }
        if(energy >= 3){
            System.out.println("Energy: :-|");
        }
        if(mood <= 8 && mood >=2){
            System.out.println("Mood: :-|");
        }
        if (mood > 8) {
            System.out.println("Mood: :-)");
        }
        if (mood < 2) {
            System.out.println("Mood: ఠ_ఠ");
        }
    }

    public void eating(){
        hunger -= 2;
        energy ++;
        fullness ++;
        checking();
    }
    public void playing(){
        mood ++;
        hunger ++;
        energy --;
        checking();
    }
    public void sleeping(){
        energy += 2;
        checking();
    }
    public void poop(){
        fullness = 0;
        checking();
    }
    public void status(){
        System.out.println("Tamagotchi \n mood= " + mood + "\n hunger= " + hunger + "\n energy= " + energy + "\n fullness= " + fullness + "\n");
    }  

    @Override
    public String toString() {
        return "Tamagotchi \n mood=" + mood + "\n hunger=" + hunger + "\n energy=" + energy + "\n fullness=" + fullness + "\n";
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
