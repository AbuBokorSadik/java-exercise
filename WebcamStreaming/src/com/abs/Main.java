package com.abs;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamResolution;
import com.sun.xml.internal.messaging.saaj.soap.JpegDataContentHandler;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Main{

    public static void main(String[] args) {

        initFrame();
//        template1();

    }

    private static void initFrame() {

        JFrame jFrame = new JFrame();
        JPanel jPanel = new JPanel();

        jFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        jFrame.setUndecorated(true);

        jPanel.add(initWeabcam());
        jFrame.add(jPanel);

        jFrame.pack();
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);

    }

    private static Component initWeabcam() {

        Webcam webcam = Webcam.getDefault();
        webcam.setViewSize(WebcamResolution.VGA.getSize());

        WebcamPanel webcamPanel = new WebcamPanel(webcam);
        webcamPanel.setImageSizeDisplayed(true);
        webcamPanel.setFPSDisplayed(true);
        webcamPanel.setFPSLimited(false);
        webcamPanel.setMirrored(true);

        webcamPanel.add(template1());

        return webcamPanel;

    }

    private static JPanel template1(){

        JPanel jPanel = new JPanel();
        jPanel.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.2f));

        jPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        
        int width = 200;
        int height = 200;
        JPanel jPanel1 = new JPanel();
        jPanel1.setBorder(new LineBorder(Color.RED, 3));
        jPanel1.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));
        jPanel1.setPreferredSize(new Dimension(width, height));
        jPanel1.setMaximumSize(new Dimension(width, height));
        jPanel1.setMinimumSize(new Dimension(width, height));

        gbc.gridx = 0;
        gbc.gridy = 0;
        jPanel.add(jPanel1,gbc);

        return jPanel;

    }

}
