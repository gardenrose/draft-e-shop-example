package com.gardenrose.shoppaneer.models;

public class Word {
    private String _id;
    private String NAME;
    private int WORD_GROUP;

    public Word(String _id, String NAME, int WORD_GROUP) {
        this._id = _id;
        this.NAME = NAME;
        this.WORD_GROUP = WORD_GROUP;
    }

    public String getId() {
        return _id;
    }

    public void setId(String id) {
        this._id = id;
    }

    public String getName() {
        return NAME;
    }

    public void setName(String Name) {
        this.NAME = Name;
    }

    public int getWordGroup() {
        return WORD_GROUP;
    }

    public void setWordGroup(int wordGroup) {
        this.WORD_GROUP = wordGroup;
    }
}