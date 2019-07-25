package com.apkglobal.adapter;

/**
 * Created by Pawan on 13-05-2018.
 */

public class Data  {
    String name;
    int image;

    public Data(String name, int image) {
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
