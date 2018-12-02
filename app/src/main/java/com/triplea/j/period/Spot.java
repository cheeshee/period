package com.triplea.j.period;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class Spot {
    private int x;
    private int y;
    private int avail;
    private int used;
    private int donated;
    public Button marker;

    public Spot(int x, int y) {
        this.x = x;
        this.y = y;
        this.avail = 0;
        this.used = 0;
        this.donated = 0;
    }

    public void addOne() {
        avail++;
        donated++;
    }

    public void minusOne() {
        avail--;
        used++;
    }

    public void makeButton(Button butt) {
        marker = butt;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public int getAvail(){
        return this.avail;
    }

    public int getUsed() {
        return this.used;
    }

    public int getDonated() {
        return this.donated;
    }
}
