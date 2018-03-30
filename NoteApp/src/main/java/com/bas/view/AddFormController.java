package com.bas.view;

import com.bas.service.ICollectionController;

public class AddFormController {
    ICollectionController collectionController;
    MainFormController mainFormController;

    AddFormController(ICollectionController controller, MainFormController outerMainFormController) {
        collectionController = controller;
        mainFormController = outerMainFormController;
    }

    public AddFormController() {
    }
}
