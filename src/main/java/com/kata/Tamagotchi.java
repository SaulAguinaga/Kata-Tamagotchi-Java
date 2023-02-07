package com.kata;

public class Tamagotchi {
    
    int mood = 4;
    int hunger = 4;
    int energy = 4;
    int fullness = 0;
    
    
    public Tamagotchi() {

    }

    public String checkingEnergy() {
        if (energy < 3 && energy > 0) {
            return "(-_-)";
        }
        if(energy == 0){
            return "(-_-)zZZ";
        }
        if(energy >= 3){
            return ":-|";
        }
        return null;
    }

    public String checkingMood() {
        if(mood <= 8 && mood >=2){
            return ":-|";
        }
        if (mood > 8) {
            return ":-)";
        }
        if (mood < 2) {
            return "ఠ_ఠ";
        }
        return null;
    }

    public void eating(){
        hunger -= 2;
        energy ++;
        fullness ++;
        System.out.println(checkingEnergy());
        System.out.println(checkingMood());
    }
    public void playing(){
        mood ++;
        hunger ++;
        energy --;
        System.out.println(checkingEnergy());
        System.out.println(checkingMood());
    }
    public void sleeping(){
        energy += 2;
        System.out.println(checkingEnergy());
        System.out.println(checkingMood());
    }
    public void poop(){
        fullness = 0;
        System.out.println(checkingEnergy());
        System.out.println(checkingMood());
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
