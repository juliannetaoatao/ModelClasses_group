/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VictorianEraStrifeOrThrive;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.HashSet;
import java.util.ResourceBundle;
import java.util.Set;
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
import javafx.scene.layout.HBox;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author julia
 */
public class ShopScreenController implements Initializable{
    @FXML private Rectangle screenChanger;
    @FXML private ImageView coin;
    @FXML private Text money;
    @FXML private ProgressBar health, energy, hunger, hydration;
    @FXML private Button item1, item2, item3, item4, item5, item6;
    @FXML private Text itemName01, itemName02, itemName03, itemName04, itemName05, itemName06;
    @FXML private Text cost01, cost02, cost03, cost04, cost05, cost06;
    @FXML private Text type01, type02, type03, type04, type05, type06;
    Player mc = Main.getMC();
    
    
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
    
    
    @FXML public void buyItem(ActionEvent event){
        int index = Integer.parseInt(((Button)event.getSource()).getId());
        mc.buy(Items.getItemByIndex(index-1));
        money.setText("S" + mc.getMoney());
    }
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
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        money.setText("S" + mc.getMoney());
        itemName01.setText((Items.getItemByIndex(0)).getItemName());
        itemName02.setText((Items.getItemByIndex(1)).getItemName());
        itemName03.setText((Items.getItemByIndex(2)).getItemName());
        itemName04.setText((Items.getItemByIndex(3)).getItemName());
        itemName05.setText((Items.getItemByIndex(4)).getItemName());
        itemName06.setText((Items.getItemByIndex(5)).getItemName());
        itemName06.setText((Items.getItemByIndex(6)).getItemName());
        
        cost01.setText("$" + (Items.getItemByIndex(0)).getItemPrice());
        cost02.setText("$" + (Items.getItemByIndex(1)).getItemPrice());
        cost03.setText("$" + (Items.getItemByIndex(2)).getItemPrice());
        cost04.setText("$" + (Items.getItemByIndex(3)).getItemPrice());
        cost05.setText("$" + (Items.getItemByIndex(4)).getItemPrice());
        cost06.setText("$" + (Items.getItemByIndex(5)).getItemPrice());
        cost06.setText("$" + (Items.getItemByIndex(6)).getItemPrice());
        
        type01.setText((Items.getItemByIndex(0)).getItemType());
        type02.setText((Items.getItemByIndex(1)).getItemType());
        type03.setText((Items.getItemByIndex(2)).getItemType());
        type04.setText((Items.getItemByIndex(3)).getItemType());
        type05.setText((Items.getItemByIndex(4)).getItemType());
        type06.setText((Items.getItemByIndex(5)).getItemType());
        type06.setText((Items.getItemByIndex(6)).getItemType());
        
        
        
        
    }    
}
