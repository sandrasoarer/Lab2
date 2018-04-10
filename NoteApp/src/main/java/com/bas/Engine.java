package com.bas;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Engine extends Application {
    Stage mainFormStage = new Stage();
    Stage addFormStage= new Stage();;
    Stage editFormStage= new Stage();;
    AnchorPane mainPane;
    AnchorPane addPane;
    AnchorPane editPane;
    Engine engine;
    {

    }
    public static void main(String[] args) {
        Application.launch(Engine.class);
    }

    @Override
    public void start(Stage primaryStage) {
        engine = this;
        this.mainFormStage = primaryStage;
        mainFormStage.setTitle("NotePad");
        initPanes();
        mainFormStage.show();
    }
    public void initPanes()
    {
        FXMLLoader loader = new FXMLLoader();
        try {
            mainPane = FXMLLoader.load(Engine.class.getResource("view/MainForm.fxml"));
            addPane = FXMLLoader.load(Engine.class.getResource("./view/AddForm.fxml"));
            editPane = FXMLLoader.load(Engine.class.getResource("./view/EditForm.fxml"));
            Scene scene = new Scene(mainPane);
            mainFormStage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
