
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class HandleCheckboxEvent extends Applet implements ItemListener {

    Checkbox java = null;
    Checkbox C = null;
    Checkbox Cpp = null;

    public void init(){

        //create checkboxes
        java = new Checkbox("Java");
        C = new Checkbox("C");
        Cpp = new Checkbox("C++");

        add(java);
        add(C);
        add(Cpp);

        //add item listeners
        java.addItemListener(this);
        C.addItemListener(this);
        Cpp.addItemListener(this);
    }

    public void paint(Graphics g){

        g.drawString("Java: " + java.getState(),10,80);
        g.drawString("C: " + C.getState(), 10, 100);
        g.drawString("C++: " + Cpp.getState(), 10, 120);

    }

    public void itemStateChanged(ItemEvent ie) {
        repaint();
    }
/*
<applet code="HandleCheckboxEvent" width=200 height=200>
</applet>
*/
}

