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

public class Shop extends Location{
    private static ArrayList<Items> itemList;
    
    public Shop(String name){
        this.name = name;
    }
    
    public void seeItemList(){
        System.out.print("");
    }
    
    public void addItem(Items i){
        itemList.add(i);
    }
    
    public void removeItem(Items i){
        itemList.remove(i);
    }
}
