package com.company;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends Frame implements ActionListener {

    Label l1,l2,l3;
    TextField t1,t2,t3;
    Button btnAdd;

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAdd) {
            int sum = Integer.parseInt(t1.getText()) + Integer.parseInt(t2.getText());
            String result = Integer.toString(sum);
            t3.setText(result);

        }
    }


    Calculator()
    {
        setVisible(true);
        setSize(400,400);
        setLayout(new FlowLayout());

        l1=new Label("First Number");
        add(l1);
        t1=new  TextField(15);
        add(t1);

        l2=new Label("Second Number");
        add(l2,new  FlowLayout());
        t2=new TextField(15);
        add(t2);

        l3=new Label("Result");
        add(l2);
        t3=new TextField(15);
        add(t3);

        btnAdd=new Button("Add");
        add(btnAdd,BorderLayout.EAST);

        btnAdd.addActionListener(this);

    }

    }

