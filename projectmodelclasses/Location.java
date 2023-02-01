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


public abstract class Location {
    protected String name;
    protected static ArrayList<Character> characterList;
    
    //getter methods
    public String getName(){
        return name;
    }
    
    public void interact(){
        
    }
    
    public void addPerson(Character c){
        characterList.add(c);
    }
    public void removePerson(Character c){
        characterList.remove(c);
    }
}
