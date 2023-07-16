package com.example.javaapp.model;

public class Flags {

    private String png;
    private String alt;

    public Flags(String svg, String alt) {
        this.png = svg;
        this.alt = alt;
    }

    public String getSvg() {
        return png;
    }

    public void setSvg(String svg) {
        this.png = svg;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }
}
