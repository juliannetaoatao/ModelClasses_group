/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML.java to edit this template
 */
package VictorianEraStrifeOrThrive;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author julia
 */
public class Main extends Application {
    static Player mc;
    @Override
    public void start(Stage stage) throws Exception {
        //Player kirby = new Player("Kirby", 5, 5, 5, 5, 5, 20);
        //Tasks[] list = new Tasks[6];
    
        new Tasks("Chimney Ash Collection",2,1,1,0,3,1);
        new Tasks("Street Cleaning",3,2,2,0,6,2);
        new Tasks("Ash Sifting",2,1,1,0,2,3);
        new Tasks("Carpet Beating",1,1,1,0,2,4);
        new Tasks("Bone Collection and Cleaning",2,1,1,0,3,5);
        new Tasks("Cloth Washing",2,2,2,0,3,6);
             
             
        
        new Items("bread", 5, "food", 4,3,4,1);
        new Items("water", 3, "food", 0,5,1,2);
        new Items("egg", 4, "food", 4,0,5,3);
        new Items("tea", 7, "food",0,4,0,4);
        new Items("chicken", 8, "food",6,0,7,5);
        new Items("potion", 15, "food",5,5,5,6);
        new Items("coat", 15, "clothes",0,0,0,7); 
        
        
        
        //home storage
        //Home house = new Home("house", 4);
        
        mc = new Player("MainCharacter", 5,5,5,5,5, 20);
        Parent root = FXMLLoader.load(getClass().getResource("ShopScreen.fxml"));   
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
        
        
    }
    public static Player getMC(){
            return mc;
        }

    public static void main(String[] args) {
        launch(args);
        
    }
    
}
