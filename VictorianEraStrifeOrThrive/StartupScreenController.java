/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package VictorianEraStrifeOrThrive;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author julia
 */
public class StartupScreenController implements Initializable {
    @FXML private Button startGame, optionsPage, exit;
    
    public void startGame(ActionEvent event){
        try {
            Node node = (Node) event.getSource();
            Scene currentScene = node.getScene();
            Stage currentStage = (Stage) currentScene.getWindow();
        
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ScreenMenu.fxml"));
            Parent root = loader.load();
            ScreenMenuController controller = loader.getController();

            Scene scene = new Scene(root);
            currentStage.setScene(scene);
            currentStage.show();
        }
        catch (IOException e){
            Logger logger = Logger.getLogger(getClass().getName());
            logger.log(Level.SEVERE, "error", e);
        }
        
    }
    public void exit(ActionEvent event)throws IOException{
        System.exit(0);
    }
    
    public void goToOptions(ActionEvent event)throws IOException{
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("options.fxml"));

            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setTitle("New Window");
            stage.setScene(scene);
            stage.show();
        }
        catch (IOException e){
            Logger logger = Logger.getLogger(getClass().getName());
            logger.log(Level.SEVERE, "error", e);
        }
                
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
