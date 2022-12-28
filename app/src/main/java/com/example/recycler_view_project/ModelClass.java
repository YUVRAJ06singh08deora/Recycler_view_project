package com.example.recycler_view_project;

public class ModelClass {
    private  String textView1;
    private int imageUser;

    private String textView2;
    private String textView3;
    private String divider;


    public ModelClass(int imageUser, String textView1, String textView2, String textView3, String divider) {
        this.imageUser = imageUser;
        this.textView1 = textView1;
        this.textView2 = textView2;
        this.textView3 = textView3;
        this.divider = divider;
    }

    public int getImageUser() {
        return imageUser;
    }

    public  String getTextView1() {
        return textView1;
    }

    public String getTextView2() {
        return textView2;
    }

    public String getTextView3() {
        return textView3;
    }

    public String getDivider() {
        return divider;
    }
}
