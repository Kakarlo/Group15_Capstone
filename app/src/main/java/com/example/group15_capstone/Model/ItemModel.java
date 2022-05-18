package com.example.group15_capstone.Model;

public class ItemModel {
    public ItemModel(String header, String text, int image){
        this.header = header;
        this.text = text;
        this.image = image;
    }

    private String header, text;
    private int image;

    //Getters
    public String getHeader() {return header;}
    public String getText() {return text;}
    public int getImage() {return image;}

    //Setters
    public void setHeader(String header) {this.header = header;}
    public void setText(String text) {this.text = text;}
    public void setImage(int image) {this.image = image;}
}
