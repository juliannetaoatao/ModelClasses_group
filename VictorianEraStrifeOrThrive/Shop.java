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
public class Shop extends Location{
    public static ArrayList<Items> itemList;
    
    public Shop(String name){
        this.name = name;
    }
    
    public void seeItemList(){
        System.out.print("");
    }
    public void addItem(Items i){
        itemList.add(i);
    }
    public static Items searchItem(String search) throws NullPointerException {
        for(Items i : itemList){
            if(i.getItemName().equalsIgnoreCase(search)) return i;
        }
        throw new NullPointerException();
    }
    public static int getItemIndex(String s) throws NullPointerException {
        if(itemList.contains(searchItem(s))) return itemList.indexOf(searchItem(s));
        else throw new NullPointerException();
    }
    public static int getItembyIndex(Shop s) throws NullPointerException {
        if(itemList.contains(s)) return itemList.indexOf(s);
        else throw new NullPointerException();
    }
}
