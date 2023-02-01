/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectmodelclasses;

/**
 *
 * @author julia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Player kirby = new Player("Kirby", home/*home class*/, 5, 5, 5, 5, 5, 20);
        NPC jules = new NPC("Jules", work/*workplace class*/, "dialogue", "worker", "stranger", 5, 20);
        NPC chijmes = new NPC("Jules", market/*shop class*/, "dialogue", "manager", "stranger", 5, 40);
    }
    
}
