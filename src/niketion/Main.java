package niketion;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ToolBar;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import javax.swing.*;
import java.io.File;

public class Main extends Application {

    private static Stage primaryStage;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Main.primaryStage = primaryStage;
        if (!new File(Main.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath()+"/../othertools/").exists()) {
            JOptionPane.showMessageDialog(new JFrame(), "Il tool deve essere nella stessa cartella di 'othertools'. Chiudo l'applicazione");
            return;
        }

        primaryStage.initStyle(StageStyle.UNDECORATED);

        BorderPane borderPane = new BorderPane();
        borderPane.setStyle("-fx-background-color: green;");

        ToolBar toolBar = new ToolBar();

        int height = 25;
        toolBar.setPrefHeight(height);
        toolBar.setMinHeight(height);
        toolBar.setMaxHeight(height);

        borderPane.setTop(toolBar);

        Parent root = FXMLLoader.load(getClass().getResource("herostool/gui.fxml"));

        primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("herostool/icons/heros.png")));

        primaryStage.setTitle("HerosTool 0.3");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public static Stage getPrimaryStage() {
        return primaryStage;
    }
}
