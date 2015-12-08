package drew;

import java.awt.event.MouseListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.MouseEvent;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;

public class Options extends JPanel
			 implements MouseListener {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 3701573579935678995L;
	
	Font myFont = new Font("Serif", Font.BOLD | Font.ITALIC, 20);
    int HALF_WIDTH = getWidth() / 2;
    int HALF_HEIGHT = getHeight() / 2;
	GridLayout myLayout = new GridLayout(4,4);

    public Options() {
    	addMouseListener(this);
    	setLayout(myLayout);
    	System.out.println("In constructor");
		JLabel[] answers = new JLabel[16];
	    for(int i = 0; i < 16; i++)
	    {
	    	System.out.println("Loop: " + i);
	    	answers[i] = new JLabel();
	    	answers[i].setVisible(true);
	    	add(answers[i]);
	    }
	    answers[0].setText("<html>1. Assign instructional coach to work with new <br> teachers on instructional methods.</html>");
	    answers[1].setText("");
	    answers[2].setText("");
	    answers[3].setText("");
	    answers[4].setText("");
	    answers[5].setText("");
	    answers[6].setText("");
	    answers[7].setText("");
	    answers[8].setText("");
	    answers[9].setText("");
	    answers[10].setText("");
	    answers[11].setText("");
	    answers[12].setText("");
	    answers[13].setText("");
	    answers[14].setText("");
	    answers[15].setText("");
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
    }
}