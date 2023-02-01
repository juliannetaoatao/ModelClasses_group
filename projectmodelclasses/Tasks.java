/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectmodelclasses;

/**
 *
 * @author julia
 */
public class Tasks {
    private String name;
    private int energyCost,hungerCost, experienceRequirement;
    private double wage;
    private Workplace workplace;
    
    public Tasks(String name, int energyCost, int hungerCost, int experienceRequirements,double wage, Workplace workplace){
        this.name = name;
        this.energyCost = energyCost;
        this.hungerCost = hungerCost;
        this.experienceRequirement = experienceRequirement;
        this.wage = wage;
        this.workplace = workplace;
    }
            
            
    public String getName(){
        return name;
    }
    public int getEnergyCost(){
        return energyCost;
    }
    public int getHungerCost(){
        return hungerCost;
    }
    public int getExperienceRequirement(){
        return experienceRequirement;
    }
    public double getWage(){
        return wage;
    }
    public Workplace getWorkplace(){
        return workplace;
    }
}
