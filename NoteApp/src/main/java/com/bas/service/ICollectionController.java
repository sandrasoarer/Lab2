package com.bas.service;

import com.bas.model.Note;

public interface ICollectionController {
    boolean Add(Note note);
    boolean Delete(Note note);
    boolean Replace(Note oldNote, Note newNote);
}
