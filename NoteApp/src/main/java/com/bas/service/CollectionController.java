package com.bas.service;

import com.bas.model.Note;

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
