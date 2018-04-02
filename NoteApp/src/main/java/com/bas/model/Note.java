package com.bas.model;

public class Note implements INote{
    String title;
    String content;

    public Note(String title, String body) {
        this.title = title;
        this.content= body;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getContent() {
        return content;
    }

}
