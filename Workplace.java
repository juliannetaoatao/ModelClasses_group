/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VictorianEraStrifeOrThrive;

import java.util.ArrayList;

public class Workplace extends Location{  
    private static ArrayList<Tasks> taskList = new ArrayList();
    public Workplace(String name){
        this.name = name;
    }
    
    
    public ArrayList<Tasks> getTaskList(){
        return taskList;
    }
    
    
}