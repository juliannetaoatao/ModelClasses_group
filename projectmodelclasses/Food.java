/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectmodelclasses;

/**
 *
 * @author julia
 */
public class Food extends Items{
    private int hungerGain, hydrationGain, healthGain, energyGain;
    
    public Food(String itemName, double itemPrice, int hungerGain, int hydrationGain, int healthGain, int energyGain){
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.hungerGain = hungerGain;
        this.hydrationGain = hydrationGain;
        this.healthGain = healthGain;
        this.energyGain = energyGain;
    }
    
    public int getHungerGain(){
        return hungerGain;
    }
    public int getHydrationGain(){
        return hydrationGain;
    }
    public int getHealthGain(){
        return healthGain;
    }
    public int getEnergyGain(){
        return energyGain;
    }
}
