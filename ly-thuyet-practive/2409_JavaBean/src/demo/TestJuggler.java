package demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TestJuggler {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Juggler Bean Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Tạo bean
        JugglerBean juggler = new JugglerBean();

        // Tạo nút Start & Stop
        JButton startBtn = new JButton("Start");
        JButton stopBtn = new JButton("Stop");

        // Gán sự kiện
        startBtn.addActionListener(e -> juggler.startJuggling());
        stopBtn.addActionListener(e -> juggler.stopJuggling());

        // Panel chứa button
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(startBtn);
        buttonPanel.add(stopBtn);

        // Thêm vào frame
        frame.add(juggler, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        frame.pack();
        frame.setVisible(true);
    }
}
