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
import javafx.scene.control.ProgressBar;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author julia
 */
public class ScreenMenuController implements Initializable {
    @FXML private ImageView HouseScreen;
    @FXML private ImageView ShopScreen;
    @FXML private ImageView InventoryScreen;
    @FXML private ImageView WorkplaceScreen;
    @FXML private Button exit;
    @FXML private ProgressBar health, energy, hunger, hydration;
    @FXML private Text money;

    Player mc = Main.getMC();
    
    
    @FXML public void goToHome(MouseEvent event)throws IOException{
        try {
            Node node = (Node) event.getSource();
            Scene currentScene = node.getScene();
            Stage currentStage = (Stage) currentScene.getWindow();
        
            FXMLLoader loader = new FXMLLoader(getClass().getResource("HouseScreen.fxml"));
            Parent root = loader.load();
            HouseScreenController controller = loader.getController();

            Scene scene = new Scene(root);
            currentStage.setScene(scene);
            currentStage.show();
        }
        catch (IOException e){
            Logger logger = Logger.getLogger(getClass().getName());
            logger.log(Level.SEVERE, "error", e);
        }
    }
    @FXML public void goToShop(MouseEvent event)throws IOException{
        try {
            Node node = (Node) event.getSource();
            Scene currentScene = node.getScene();
            Stage currentStage = (Stage) currentScene.getWindow();
        
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ShopScreen.fxml"));
            Parent root = loader.load();
            ShopScreenController controller = loader.getController();

            Scene scene = new Scene(root);
            currentStage.setScene(scene);
            currentStage.show();
        }
        catch (IOException e){
            Logger logger = Logger.getLogger(getClass().getName());
            logger.log(Level.SEVERE, "error", e);
        }
    }
    @FXML public void goToWorkplace(MouseEvent event)throws IOException{
        try {
            Node node = (Node) event.getSource();
            Scene currentScene = node.getScene();
            Stage currentStage = (Stage) currentScene.getWindow();
        
            FXMLLoader loader = new FXMLLoader(getClass().getResource("WorkplaceScreen.fxml"));
            Parent root = loader.load();
            WorkplaceScreenController controller = loader.getController();

            Scene scene = new Scene(root);
            currentStage.setScene(scene);
            currentStage.show();
        }
        catch (IOException e){
            Logger logger = Logger.getLogger(getClass().getName());
            logger.log(Level.SEVERE, "error", e);
        }
    }
    @FXML public void goToInventory(MouseEvent event)throws IOException{
        try {
            Node node = (Node) event.getSource();
            Scene currentScene = node.getScene();
            Stage currentStage = (Stage) currentScene.getWindow();
        
            FXMLLoader loader = new FXMLLoader(getClass().getResource("InventoryScreen.fxml"));
            Parent root = loader.load();
            InventoryScreenController controller = loader.getController();

            Scene scene = new Scene(root);
            currentStage.setScene(scene);
            currentStage.show();
        }
        catch (IOException e){
            Logger logger = Logger.getLogger(getClass().getName());
            logger.log(Level.SEVERE, "error", e);
        }
    }
    @FXML public void exit(ActionEvent event)throws Exception{
        try {
            Node node = (Node) event.getSource();
            Scene currentScene = node.getScene();
            Stage currentStage = (Stage) currentScene.getWindow();
        
            FXMLLoader loader = new FXMLLoader(getClass().getResource("StartupScreen.fxml"));
            Parent root = loader.load();
            StartupScreenController controller = loader.getController();

            Scene scene = new Scene(root);
            currentStage.setScene(scene);
            currentStage.show();
        }
        catch (IOException e){
            Logger logger = Logger.getLogger(getClass().getName());
            logger.log(Level.SEVERE, "error", e);
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        money.setText("S" + mc.getMoney());
    }    
    
}
