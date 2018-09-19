package com.example.termi.jacksonvilletourapp;

public class ListItem {

    private String listTitle, listLocation;

    public ListItem(String listTitle, String listLocation){
        this.listTitle = listTitle;
        this.listLocation = listLocation;
    }

    public String getListTitle() {
        return listTitle;
    }

    public String getListLocation() {
        return listLocation;
    }
}
