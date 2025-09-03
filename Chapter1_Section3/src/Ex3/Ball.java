package Ex3;

import java.awt.*;

public class Ball extends Thread {
    private Panel canvas;
    public int x = 50, y = 50, diameter = 30;
    private int xSpeed = 2, ySpeed = 2;
    private boolean running = true;
    private boolean paused = false;

    public Ball(Panel canvas) {
        this.canvas = canvas;
    }

    @Override
    public void run() {
        while (running) {
            if (!paused) {
                moveBall();
                canvas.repaint();  
            try {
                Thread.sleep(10); 
            } catch (InterruptedException e) {
                break; 
            }
            }
        }	
    }

   
    private void moveBall() {
        x += xSpeed;
        y += ySpeed;


        if (x < 0 || x + diameter > canvas.getWidth()) {
            xSpeed = -xSpeed;
        }
        if (y < 0 || y + diameter > canvas.getHeight()) {
            ySpeed = -ySpeed;
        }
    }


    public void drawBall(Graphics g) {
        g.setColor(Color.RED); 
        g.fillOval(x, y, diameter, diameter); 
    }

    public void pauseBall() {
        paused = true;
    }

    public void resumeBall() {
        paused = false;
    }

    public void stopBall() {
        running = false;
    }
}
