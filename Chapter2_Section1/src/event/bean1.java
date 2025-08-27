package event;

import java.awt.*;
import java.awt.event.*;
import java.io.Serializable;

public class bean1 extends java.applet.Applet implements ActionListener, Serializable{
		private int a = 0;
	
		public bean1() {
		}
	
	public synchronized void paint(Graphics g) 
	{ 
		String valueText = " " + a; 
		FontMetrics fmt = g.getFontMetrics(); 
		g.setColor(getBackground()); 
		g.setColor(getForeground()); 
		g.drawString(valueText, 0,0); 
	}
	
	public synchronized void update(Graphics g) 
	{ 
		Image hidden = createImage(getSize().width, getSize().height); 
		paint(hidden.getGraphics()); 
		g.drawImage(hidden, 0, 0, null); 
	}
	
	public void actionDone(ActionEvent aevt) {
		a = a + 1;
		repaint();
	}
}