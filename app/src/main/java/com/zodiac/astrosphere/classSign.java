package com.zodiac.astrosphere;

import android.graphics.drawable.Drawable;

import java.io.Serializable;

public class classSign implements Serializable {

    String name;
    String description;
    String period;

    int img;

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public classSign(String name, String description, String period, int img) {
        this.name = name;
        this.description = description;
        this.period = period;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }
}
