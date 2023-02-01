/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectmodelclasses;

/**
 *
 * @author julia
 */
import java.util.ArrayList;

public abstract class Character implements Interactive{
    protected String name;
    protected Location currentLocation;
    protected double money;
    protected static ArrayList<Items> inventoryList;
    

    //getter methods
    public String getName(){
        return name;
    }
    public Location getCurrentLocation(){
        return currentLocation;
    }
    public double getMoney(){
        return money;
    }
    //arraylist
            
            
    public void buy(Items i){
        inventoryList.add(i) ;
        money -= i.itemPrice;
    }
    public void sell(Items i){
        inventoryList.remove(i);
        money += i.itemPrice;
    }
    
    public void gift(Items i, Character c){
        inventoryList.remove(i);
        //c.inventoryList.add(i);
    }
    
    public void travel(Location l){
        currentLocation.removePerson(this);
        currentLocation = l; //current location is now new location l 
        currentLocation.addPerson(this);
    }
}
