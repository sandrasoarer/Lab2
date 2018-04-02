package com.bas;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Engine extends Application {
    Stage mainFormStage;
    Stage addFormStage;
    Stage editFormStage;
    AnchorPane mainPane;
    AnchorPane addPane;
    AnchorPane editPane;
    Engine engine;
    {
        FXMLLoader loader = new FXMLLoader();
        try {
            mainPane = FXMLLoader.load(Engine.class.getResource("./view/MainForm.fxml"));
            addPane = FXMLLoader.load(Engine.class.getResource("./view/AddForm"));
            editPane = FXMLLoader.load(Engine.class.getResource("./view/EditForm"));
            Scene scene = new Scene(mainPane);
            mainFormStage.setScene(scene);
            scene = new Scene(addPane);
            addFormStage.setScene(scene);
            scene = new Scene(editPane);
            editFormStage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Application.launch(Engine.class);
    }

    @Override
    public void start(Stage primaryStage) {
        engine = this;
        this.mainFormStage = primaryStage;
        mainFormStage.setTitle("NotePad");
        mainFormStage.show();
    }
}
