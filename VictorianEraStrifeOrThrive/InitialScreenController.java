/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package VictorianEraStrifeOrThrive;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import static javax.management.Query.value;


/**
 *
 * @author julia
 */
public class InitialScreenController implements Initializable {
    
    @FXML private ProgressBar healthBar, hungerBar, energyBar, hydrationBar;
    @FXML private Label money;
    @FXML private ImageView moneyImg;   
    @FXML private Rectangle screenChanger;
    @FXML private Button task01, task02;  
    //private double playerMoney = kirby.getMoney();
    /*
    @FXML
    public void changeScreen(MouseEvent onMouseClicked) throws IOException {
        //System.out.println("You clicked me!");
        Node node = (Node) event.getSource();
        Scene currentScene = node.getScene();
            
        //Stage currentStage (Stage) currentScene.getWindow();
        
        FXMLLoader loader = new FXMLLoader(url:getClass().getResource(name: "screenMenu.fxml"));
        Parent root = loader.load();
        InitialScreenController controller = loader.getController();
        Scene ScreenMenu = new Scene(parent.root);
        currentStage.setScene(value:subjectScene);
        
        
    }
    
    public void doTask(ActionEvent event){

        money.setText("$" + (kirby.getMoney())));
        
        
    }
    
    public void goToShop(ActionEvent event){
        Node node = (Node) event.getSource();
        Scene currentScene = node.getScene();
            
        //Stage currentStage (Stage) currentScene.getWindow();
        
        FXMLLoader loader = new FXMLLoader(url:getClass().getResource(name: "ShopScreen.fxml"));
        Parent root = loader.load();
        InitialScreenController controller = loader.getController();
        Scene ScreenMenu = new Scene(parent.root);
        currentStage.setScene(value:subjectScene);
    }*/
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
