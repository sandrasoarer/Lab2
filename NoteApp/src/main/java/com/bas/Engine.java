package com.bas;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Engine extends Application {
    Stage stage;
    AnchorPane mainPane;
    Engine engine;

    public static void main(String[] args) {
        Application.launch(Engine.class);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        engine = this;
        this.stage = primaryStage;
        stage.setTitle("NotePad");
        showMainForm();
    }

    public void showMainForm() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        mainPane =(AnchorPane)FXMLLoader.load(Engine.class.getResource("./view/MainForm.fxml"));
        Scene scene = new Scene(mainPane);
        stage.setScene(scene);
        stage.show();
    }
}
