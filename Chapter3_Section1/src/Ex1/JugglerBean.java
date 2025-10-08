package Ex1;

import java.awt.*;
import java.awt.event.*;
import java.io.Serializable;

public class JugglerBean extends Canvas implements Runnable, Serializable {
    private boolean juggling = false;
    private Thread thread;
    private int ballY = 100;
    private int direction = -1; // di chuyển lên (-1) hoặc xuống (1)
    private int speed = 20; // tốc độ mặc định (càng nhỏ càng nhanh)

    public JugglerBean() {
        setSize(300, 300);
        setBackground(Color.WHITE);
    }

    public void startJuggling() {
        if (!juggling) {
            juggling = true;
            thread = new Thread(this);
            thread.start();
        }
    }

    public void stopJuggling() {
        juggling = false;
        if (thread != null) {
            thread.interrupt();
        }
    }

    public void increaseSpeed() {
        if (speed > 5) speed -= 5;
    }

    public void decreaseSpeed() {
        speed += 5;
    }

    @Override
    public void run() {
        while (juggling) {
            ballY += direction * 5;

            if (ballY <= 50) direction = 1;   // chạm đỉnh -> đi xuống
            if (ballY >= 200) direction = -1; // chạm đáy -> đi lên

            repaint();

            try {
                Thread.sleep(speed);
            } catch (InterruptedException e) {
                break;
            }
        }
    }

    @Override
    public void paint(Graphics g) {
        // Vẽ người
        g.setColor(Color.BLACK);
        g.drawOval(130, 200, 40, 40); // đầu
        g.drawLine(150, 240, 150, 280); // thân
        g.drawLine(150, 250, 120, 230); // tay trái
        g.drawLine(150, 250, 180, 230); // tay phải
        g.drawLine(150, 280, 130, 310); // chân trái
        g.drawLine(150, 280, 170, 310); // chân phải

        // Vẽ bóng
        g.setColor(Color.RED);
        g.fillOval(140, ballY, 20, 20);
    }
}
