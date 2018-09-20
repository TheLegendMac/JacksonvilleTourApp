package com.example.termi.jacksonvilletourapp;

public class ListItem {

    private String listTitle, listLocation;
    private int listImage;

    public ListItem(String listTitle, String listLocation) {
        this.listTitle = listTitle;
        this.listLocation = listLocation;
    }

    public ListItem(String listTitle, String listLocation, int listImage) {
        this.listTitle = listTitle;
        this.listLocation = listLocation;
        this.listImage = listImage;
    }

    public int getListImage() {
        return listImage;
    }

    public String getListTitle() {
        return listTitle;
    }

    public String getListLocation() {
        return listLocation;
    }

}
