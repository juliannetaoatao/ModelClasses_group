/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VictorianEraStrifeOrThrive;

import java.util.ArrayList;
import java.util.concurrent.BlockingQueue;
import static jdk.nashorn.internal.objects.ArrayBufferView.buffer;

/**
 *
 * @author julia
 */
public class Player {
    private String name;
    private int hungerBar, energyLevel, experience, hydrationLevel, health;
    private double money;
    private static ArrayList<Items> inventoryList = new ArrayList();

    
    public Player(String name, int hungerBar, int energyLevel, int experience, int hydrationLevel, int health, double money){
        this.name = name;
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
    public double getMoney(){
        return money;
    }
    public static ArrayList<Items> getInventoryList(){
        return inventoryList;
    }
    public int sleepEnergyAddition(int hour, int multiple){
        int energyGain = hour * multiple;
        return energyGain;
    }
    public void eat(Items i){
        energyLevel += i.getEnergyGain();
        hungerBar += i.getHungerGain();
        hydrationLevel += i.getHydrationGain();
    }
    
    public void doTask(Tasks task){
        energyLevel -= task.getEnergyCost();
        hungerBar -= task.getHungerCost();
        money += task.getWage();
    }
    public String getName(){
        return name;
    }
    
    public void buy(Items item){
        money -= item.getItemPrice();
        inventoryList.add(item);
    }
    public void sell(Items i){
        inventoryList.remove(i);
        //money += i.itemPrice;
    }
}
