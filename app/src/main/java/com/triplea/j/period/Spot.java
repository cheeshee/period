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
    private Button marker;

    public Spot(int x, int y) {
        this.x = x;
        this.y = y;
        this.avail = 0;
        this.used = 0;
        this.donated = 0;
        this.marker = new Button()
    }

    public void addOne() {
        avail++;
        donated++;
    }

    public void minusOne() {
        avail--;
        used++;
    }

}
