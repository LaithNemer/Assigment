package com.example.ass;

public class Subject {
    private String name;
    private int imageID;

    public static final Subject[] subject ={
            new Subject("Math",R.drawable.math),
        new Subject("Scince",R.drawable.scince),
        new Subject("Arabic",R.drawable.arabic),
            new Subject("English",R.drawable.english)

    };
    private Subject(String name, int imageID){
        this.name = name;
        this.imageID = imageID;
    }
    public String getName(){return name;}
    public int getImageID(){return imageID;}

}
