/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VictorianEraStrifeOrThrive;

import java.util.ArrayList;

/**
 *
 * @author julia
 */
public class Items {
    private String itemName;
    private double itemPrice;
    private String type;
    private int hungerGain;
    private int hydrationGain;
    private int energyGain;
    private int index;
    private static ArrayList<Items> shopItemList = new ArrayList();
    
    public Items(String itemName, double itemPrice, String type, int hungerGain, int hydrationGain, int energyGain, int index){
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.type = type;
        this.hungerGain = hungerGain;
        this.hydrationGain = hydrationGain;
        this.energyGain = energyGain;
        this.index = index;
        shopItemList.add(this);
    }
    
    public String getItemName(){
        return itemName;
    }
    public double getItemPrice(){
        return itemPrice;
    }
    public String getItemType(){
        return type;
    }
    public static Items getItemByIndex(int index){
        return shopItemList.get(index);
    }
    
    public int getHungerGain(){
        return hungerGain;
    }
    public int getHydrationGain(){
        return hydrationGain;
    }
    public int getEnergyGain(){
        return energyGain;
    }
    public static int getItemIndex(Items i) throws NullPointerException {
        if(shopItemList.contains(i)) return shopItemList.indexOf(i);
        else throw new NullPointerException();
    }
}