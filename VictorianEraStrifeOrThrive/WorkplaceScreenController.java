/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VictorianEraStrifeOrThrive;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
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
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import java.util.Set;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;

/**
 *
 * @author julia
 */
public class WorkplaceScreenController implements Initializable {
    @FXML private Rectangle screenChanger;
    @FXML private ImageView coin;
    @FXML private ProgressBar health, energy, hunger, hydration;
    @FXML private Button task01, task02, task03, task04, task05, task06;
    @FXML private Label taskName01, taskName02, taskName03, taskName04, taskName05, taskName06;
    @FXML private Label hunger01, hunger02, hunger03, hunger04, hunger05, hunger06;
    @FXML private Label energy01, energy02, energy03, energy04, energy05, energy06;
    @FXML private Label exp01, exp02, exp03, exp04, exp05, exp06;
    @FXML private Label wage01, wage02, wage03, wage04, wage05, wage06;
    @FXML private Label money;
    
    Player mc = Main.getMC();
    
    @FXML public void doTask(ActionEvent event) {
        int index = Integer.parseInt(((Button)event.getSource()).getId());
        mc.doTask(Tasks.getTaskByIndex(index - 1));
        money.setText("S" + mc.getMoney());
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
    public void hideButton(Tasks t){
        
    }
        
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        int maxTaskList = Tasks.getTaskList().size();
        for (int i = 0; i < maxTaskList; i++){
            hideButton(Tasks.getTaskByIndex(i));
        }
        money.setText("S" + mc.getMoney());
        taskName01.setText((Tasks.getTaskByIndex(0)).getTaskName());
        energy01.setText("Energy Cost: " + (Tasks.getTaskByIndex(0)).getEnergyCost());
        hunger01.setText("Hunger Cost: " + (Tasks.getTaskByIndex(0)).getHungerCost());
        exp01.setText("Experience: " + (Tasks.getTaskByIndex(0)).getExperienceRequirement());
        wage01.setText("Wage: " + (Tasks.getTaskByIndex(0)).getWage());
        
        taskName02.setText((Tasks.getTaskByIndex(1)).getTaskName());
        energy02.setText("Energy Cost: " + (Tasks.getTaskByIndex(1)).getEnergyCost());
        hunger02.setText("Hunger Cost: " + (Tasks.getTaskByIndex(1)).getHungerCost());
        exp02.setText("Experience: " + (Tasks.getTaskByIndex(1)).getExperienceRequirement());
        wage02.setText("Wage: " + (Tasks.getTaskByIndex(1)).getWage());
        
        taskName03.setText((Tasks.getTaskByIndex(2)).getTaskName());
        energy03.setText("Energy Cost: " + (Tasks.getTaskByIndex(2)).getEnergyCost());
        hunger03.setText("Hunger Cost: " + (Tasks.getTaskByIndex(2)).getHungerCost());
        exp03.setText("Experience: " + (Tasks.getTaskByIndex(2)).getExperienceRequirement());
        wage03.setText("Wage: " + (Tasks.getTaskByIndex(2)).getWage());
        
        taskName04.setText((Tasks.getTaskByIndex(3)).getTaskName());
        energy04.setText("Energy Cost: " + (Tasks.getTaskByIndex(3)).getEnergyCost());
        hunger04.setText("Hunger Cost: " + (Tasks.getTaskByIndex(3)).getHungerCost());
        exp04.setText("Experience: " + (Tasks.getTaskByIndex(3)).getExperienceRequirement());
        wage04.setText("Wage: " + (Tasks.getTaskByIndex(3)).getWage());
        
        taskName05.setText((Tasks.getTaskByIndex(4)).getTaskName());
        energy05.setText("Energy Cost: " + (Tasks.getTaskByIndex(4)).getEnergyCost());
        hunger05.setText("Hunger Cost: " + (Tasks.getTaskByIndex(4)).getHungerCost());
        exp05.setText("Experience: " + (Tasks.getTaskByIndex(4)).getExperienceRequirement());
        wage05.setText("Wage: " + (Tasks.getTaskByIndex(4)).getWage());
        
        ("taskname0" + 6).setText((Tasks.getTaskByIndex(5)).getTaskName());
        energy06.setText("Energy Cost: " + (Tasks.getTaskByIndex(5)).getEnergyCost());
        hunger06.setText("Hunger Cost: " + (Tasks.getTaskByIndex(5)).getHungerCost());
        exp06.setText("Experience: " + (Tasks.getTaskByIndex(5)).getExperienceRequirement());
        wage06.setText("Wage: " + (Tasks.getTaskByIndex(5)).getWage());
    } 
}
