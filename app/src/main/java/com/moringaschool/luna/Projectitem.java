package com.moringaschool.luna;

public class Projectitem {
    private int mimageResource;
    private String mText1;
    private String mText2;

    public Projectitem (int mimageResource, String text1, String text2){
        mimageResource = mimageResource;
        mText1 = text1;
        mText2 = text2;
    }

    public int getMimageResource() {
        return mimageResource;
    }

    public String getmText1(){
        return mText1;
    }
    public String getmText2(){
        return mText2;
    }
}
