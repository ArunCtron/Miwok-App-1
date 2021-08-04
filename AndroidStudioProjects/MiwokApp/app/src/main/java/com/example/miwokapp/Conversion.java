package com.example.miwokapp;

public class Conversion
{
    private String miwokTranslation;
    private String defaultTranslation;
    private final int IMAGE_CHECKER=0;
    private int mImage=IMAGE_CHECKER;
    private int mAudio;

    public Conversion(String mwok,String def,int audio)
    {
        miwokTranslation=mwok;
        defaultTranslation=def;
        mAudio=audio;
    }

    public Conversion(String mwok,String def,int image,int audio)
    {
        miwokTranslation=mwok;
        defaultTranslation=def;
        mImage=image;
        mAudio=audio;
    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }
    public String getMiwokTranslation(){
        return miwokTranslation;
    }
    public int getImage()
    {
        return mImage;
    }
    public boolean hasImage()
    {
        return mImage==IMAGE_CHECKER;
    }
    public int getAudio()
    {
        return mAudio;
    }

}
