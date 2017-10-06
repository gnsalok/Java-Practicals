package com.company;

import java.applet.Applet;
import java.awt.*;



public class TestApplet extends Applet
{
    String str;
    public void init()
    {
        str="This is sample String";
    }
    public void paint(Graphics G)
    {
        G.drawString(str,100,100);
    }
    /*
    <applet code="TestApplet" width=400 height=400>
    Applet Not Found..
    </applet>
    */

}