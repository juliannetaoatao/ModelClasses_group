/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectmodelclasses;

/**
 *
 * @author julia
 */
public class Player extends Character{
    private int hungerBar, energyLevel, experience, hydrationLevel, health;
    
    //getter methods

    public Player(String name, Location currentLocation, int hungerBar, int energyLevel, int experience, int hydrationLevel, int health, double money){
        this.name = name;
        this.currentLocation = currentLocation;
        this.hungerBar = hungerBar;
        this.energyLevel = energyLevel;
        this.experience = experience;
        this.hydrationLevel = hydrationLevel;
        this.health = health;
        this.money = money;
    }
    
    public int getHungerBar(){
        return hungerBar;
    }
    public int getEnergyLevel(){
        return energyLevel;
    }
    public int getExperience(){
        return experience;
    }
    public int getHydrationLevel(){
        return hydrationLevel;
    }
    public int getHealth(){
        return health;
    }
    public void sleep(){
        energyLevel +=10;
    }
    public void eat(Food f){
        energyLevel += f.getEnergyGain();
        hungerBar += f.getHungerGain();
        hydrationLevel += f.getHydrationGain();
        health += f.getHealthGain();
    }
    
    public void seeStats(){
        System.out.println(""); //opens stats
    }
    
    public void doTask(Tasks task, Character c){
        energyLevel -= task.getEnergyCost();
        hungerBar -= task.getHungerCost();
        money += task.getWage();
    }
    
    public void interact(){ 
        //interface
    }
    
    
}
