/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectmodelclasses;

/**
 *
 * @author julia
 */
public class NPC extends Character{
    private String dialogue, role, relationship;
    private int relationshipPoints;
    
    public NPC(String name, Location currentLocation, String dialogue, String role, String relationship, int relationshipPoints, double money){
        this.name = name;
        this.currentLocation = currentLocation;
        this.dialogue = dialogue;
        this.role = role;
        this.relationship = relationship;
        this.relationshipPoints = relationshipPoints;
        this.money = money;
    }
    
    
    //getter methods
    public String getDialogue(){
        return dialogue;
    }
    public String getRole(){
        return role;
    }
    public String getRelationship(){
        return relationship;
    }
    public int getRelationshipPoints(){
        return relationshipPoints;
    }
    
    
    public void seeInfo(){
        System.out.println(); 
    }
    
    
    public void interact(Player p){
        //interact w/ player 
        // plus/minus relationship points
    }
}
