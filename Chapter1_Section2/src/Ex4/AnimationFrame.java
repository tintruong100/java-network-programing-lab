package Ex4;

import java.awt.*;

public class AnimationFrame extends Frame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Image[] img; 
	MyThread v; 
	public AnimationFrame (String s) { 
		super(s);
		img = new Image[2]; 
		img[0] = getToolkit().getImage("T1.jpg"); 
		img[1] = getToolkit().getImage("T2.jpg"); 
		setBounds(300, 200, 200, 200); 
		v = new MyThread(this); 
		v.start(); 
		show(); 
	}
	public void paint(Graphics g) { 
		g.drawImage(img[v.i], 0, 20, this); 
	}
}
