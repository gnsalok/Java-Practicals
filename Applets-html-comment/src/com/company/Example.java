package com.company;

import java.applet.Applet;
import java.awt.*;

public class Example extends Applet{
   String str;

    @Override
    public void init( ) {
        super.init();
        str="This is sample String";

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString(str,100,100);
    }
}
