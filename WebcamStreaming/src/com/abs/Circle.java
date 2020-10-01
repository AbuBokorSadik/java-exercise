package com.abs;

import javax.swing.*;
import java.awt.*;

public class Circle extends JPanel {

    public void paint(Graphics g){
        setSize(500,500);
        g.setColor(Color.RED);
        g.drawOval(50,50,300,300);
        //g.drawOval(49,49,299,299);
    }

}
