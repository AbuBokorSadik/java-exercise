package com.abs;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamResolution;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        initFrame();

    }

    private static void initFrame() {

        JFrame jFrame = new JFrame();
        jFrame.setTitle("Webcam Streaming");

        jFrame.setLocation(0, 0);

        jFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        jFrame.setUndecorated(true);

        jFrame.add(initWeabcam());
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

        return webcamPanel;

    }
}
