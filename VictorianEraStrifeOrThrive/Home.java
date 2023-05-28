        /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VictorianEraStrifeOrThrive;

import java.util.ArrayList;

public class Home extends Location{
    private double rentCost;
    private static ArrayList<Items> storage;
    
    public Home(String name, double rentCost){
        this.name = name;
        this.rentCost = rentCost;
    }
    
    
    public double getRentCost(){
        return rentCost;
    }
      
    public void seeStorageList(){
        System.out.println(); // prints list of items in storage
    }
    
    /*item I from player inventory*/
    public void storeItem(Player me, Items i){
        storage.add(i);
        me.getInventoryList().remove(i);
    }
    public void takeItem(Player me, Items i){
        storage.remove(i);
        me.getInventoryList().add(i);
    }
}