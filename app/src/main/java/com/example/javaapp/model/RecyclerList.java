package com.example.javaapp.model;

import java.util.List;

public class RecyclerList {

private List<RecyclerData> flags;

    public RecyclerList(List<RecyclerData> flags) {
        this.flags = flags;
    }

    public List<RecyclerData> getFlags() {
        return flags;
    }

    public void setFlags(List<RecyclerData> flags) {
        this.flags = flags;
    }
}
