package demo;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.Serializable;

public class JugglerBean extends JPanel implements Serializable {
    private int y = 150;          // Vị trí Y của bóng
    private int dy = -5;          // Tốc độ di chuyển
    private Timer timer;          // Bộ hẹn giờ (animation)

    public JugglerBean() {
        setPreferredSize(new Dimension(300, 300));
        setBackground(Color.WHITE);

        // Tạo timer cho animation
        timer = new Timer(50, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                animateBall();
            }
        });
    }

    // Hàm start juggling
    public void startJuggling() {
        if (!timer.isRunning()) {
            timer.start();
        }
    }

    // Hàm stop juggling
    public void stopJuggling() {
        if (timer.isRunning()) {
            timer.stop();
        }
    }

    // Logic di chuyển bóng
    private void animateBall() {
        y += dy;
        if (y < 50 || y > 250) {
            dy = -dy;  // Đổi hướng khi chạm biên
        }
        repaint();
    }

    // Vẽ người + bóng
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Vẽ "juggler" đơn giản (hình que)
        g.setColor(Color.BLACK);
        g.drawOval(130, 200, 40, 40); // đầu
        g.drawLine(150, 240, 150, 300); // thân
        g.drawLine(150, 260, 120, 280); // tay trái
        g.drawLine(150, 260, 180, 280); // tay phải
        g.drawLine(150, 300, 130, 340); // chân trái
        g.drawLine(150, 300, 170, 340); // chân phải

        // Vẽ bóng
        g.setColor(Color.RED);
        g.fillOval(140, y, 20, 20);
    }
}
