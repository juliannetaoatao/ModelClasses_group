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
public class Tasks {
    private String name;
    private int energyCost,hungerCost, experienceRequirement, index;
    private double wage;
    private static ArrayList<Tasks> taskList = new ArrayList();
    //private Workplace workplace;
    
    public Tasks(String name, int energyCost, int hungerCost, int hydrationCost, int experienceRequirements, double wage,int index){
        this.name = name;
        this.energyCost = energyCost;
        this.hungerCost = hungerCost;
        this.experienceRequirement = experienceRequirement;
        this.wage = wage;
        this.index = index;
        taskList.add(this);
    }
            
            
    public String getTaskName(){
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
    public static ArrayList<Tasks> getTaskList(){
        return taskList;
    }
    public int getIndex(){
        return index;
    }
    public static Tasks getTaskByIndex(int index){
        return taskList.get(index);
    }
    public static int getTaskIndex(Tasks t) throws NullPointerException {
        if(taskList.contains(t)) return taskList.indexOf(t);
        else throw new NullPointerException();
    }
}
