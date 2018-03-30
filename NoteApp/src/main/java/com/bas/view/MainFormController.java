package com.bas.view;

import com.bas.Engine;
import com.bas.model.INote;
import com.bas.service.ICollectionController;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.List;

public class MainFormController {

    ICollectionController collectionController;
    List<INote> collection;
    @FXML
    TextField titleField;

    @FXML
    TextArea contentField;

    @FXML
    ListView<INote> noteListView;

    MainFormController(ICollectionController controller) {
        collectionController = controller;
    }

    public MainFormController() {

    }

    @FXML
    void addButtonClick() throws IOException {
        AnchorPane addPane = FXMLLoader.load(Engine.class.getResource("./view/AddForm.fxml"));
        Scene scene = new Scene(addPane);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void deleteButtonClick() {
    }

    @FXML
    void editButtonClick() {

    }
}
