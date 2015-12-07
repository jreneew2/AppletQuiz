package drew;

import java.awt.event.MouseListener;
import javax.swing.JPanel;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Quiz extends JPanel
			 implements MouseListener {

    /**
	 * 
	 */
	private static final long serialVersionUID = -5939195595554245118L;
	
	StringBuffer strBuffer;
    Color green = new Color(0.2f, 0.6f, 0.2f);
    Color yellow = new Color(1.0f, 1.0f, 0.6f);
    Color red = new Color(0.6f, 0f, 0f);
    Color blue = new Color(0.0f, 0.2f, 0.6f);
    Font myFont = new Font("Serif", Font.BOLD | Font.ITALIC, 20);
    int HALF_WIDTH = getWidth() / 2;
    int HALF_HEIGHT = getHeight() / 2;

    public void init() {
	addMouseListener(this);
	strBuffer = new StringBuffer();
        addItem("initializing the apple ");
    }

    public void start() {
        addItem("starting the applet ");
    }
    
    public void stop() {
        addItem("stopping the applet ");
    }

    public void destroy() {
        addItem("unloading the applet");
    }

    void addItem(String word) {
        System.out.println(word);
        strBuffer.append(word);
        repaint();
    }

    public void paint(Graphics g) {
	//Draw a Rectangle around the applet's display area.
    	HALF_WIDTH = getWidth() / 2;
    	HALF_HEIGHT = getHeight() / 2;
    	//draws background colors
    	g.setColor(green);
        g.fillRect(0, 0, HALF_WIDTH, HALF_HEIGHT);
        g.setColor(yellow);
        g.fillRect(HALF_WIDTH, 0, HALF_WIDTH, HALF_HEIGHT);
        g.setColor(red);
        g.fillRect(0, HALF_HEIGHT, HALF_WIDTH, HALF_HEIGHT);
        g.setColor(blue);
        g.fillRect(HALF_WIDTH, HALF_HEIGHT, HALF_WIDTH, HALF_HEIGHT);
        //draws text
        g.setColor(Color.BLACK);
        g.setFont(myFont);
        g.drawString("C: Creative Leadership:", 10, 20);
        g.drawString("D: Adaptive Leadership:", HALF_WIDTH + 10, 20);
        g.drawString("A: Authoritative Leadership:", 10, HALF_HEIGHT + 20);
        g.drawString("B: Collaborative Leadership:", HALF_WIDTH + 10, HALF_HEIGHT + 20);
        //draws borders
        g.drawRect(0, 0, HALF_WIDTH, HALF_HEIGHT);
        g.drawRect(HALF_WIDTH, 0, HALF_WIDTH, HALF_HEIGHT);
        g.drawRect(0, HALF_HEIGHT, HALF_WIDTH, HALF_HEIGHT);
        g.drawRect(HALF_WIDTH, HALF_HEIGHT, HALF_WIDTH, HALF_HEIGHT);
    }

   
    public void mouseEntered(MouseEvent event) {
    }
    public void mouseExited(MouseEvent event) {
    }
    public void mousePressed(MouseEvent event) {
    }
    public void mouseReleased(MouseEvent event) {
    }

    public void mouseClicked(MouseEvent event) {
	addItem("mouse clicked! ");
    }
}