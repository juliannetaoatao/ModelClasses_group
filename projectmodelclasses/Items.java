/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectmodelclasses;

/**
 *
 * @author julia
 */
public class Items {
    protected String itemName;
    protected double itemPrice;
    
    public Items(String itemName, double itemPrice){
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }
    
    public String getItemName(){
        return itemName;
    }
    public double getItemPrice(){
        return itemPrice;
    }
}
