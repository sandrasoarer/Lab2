package com.bas.serviceImpl;

import com.bas.model.Note;
import com.bas.service.ICollectionController;

public class CollectionController implements ICollectionController {
    @Override
    public boolean Add(Note note) {
        return false;
    }

    @Override
    public boolean Delete(Note note) {
        return false;
    }

    @Override
    public boolean Replace(Note oldNote, Note newNote) {
        return false;
    }
}
