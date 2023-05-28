/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
import javafx.scene.control.ProgressBar;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author julia
 */
public class InventoryScreenController implements Initializable{
    @FXML private Rectangle screenChanger;
    @FXML private ImageView coin;
    @FXML private Text money;
     @FXML private ProgressBar health, energy, hunger, hydration;
        
    Player mc = Main.getMC();
    
    @FXML public void goToWorkplace(ActionEvent event)throws IOException{
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
    @FXML public void backToScreenMenu(MouseEvent event)throws IOException{
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
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        money.setText("S" + mc.getMoney());
    }    
    
}
