package com.bas.model;

public class Note implements INote {
    String title;
    String content;

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getContent() {
        return content;
    }
}
