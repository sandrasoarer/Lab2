package com.bas.serviceImpl;

import com.bas.model.INote;
import com.bas.model.Note;
import com.bas.service.ICollectionController;

import java.util.ArrayList;
import java.util.LinkedList;

public class CollectionController implements ICollectionController {
    LinkedList<INote> notes = new LinkedList<>();

    @Override
    public boolean Add(Note note) {
        try {
            notes.add(note);
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    @Override
    public boolean Delete(Note note) {
        try {
            notes.remove(note);
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    @Override
    public boolean Replace(Note oldNote, Note newNote) {
        return false;
    }
}
