package com.bas.service;

import com.bas.model.INote;

import java.util.List;

public interface ISerializer {
    List<INote> get();
    Boolean save(List<INote> notesList);
}
