package drew;

import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.MouseEvent;
import java.awt.Color;
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
	boolean mouseDown = false;
	JLabel[] answers;

    public Options() {
    	addMouseListener(this);
    	setLayout(myLayout);
    	System.out.println("In constructor");
		answers = new JLabel[16];
	    for(int i = 0; i < 16; i++)
	    {
	    	answers[i] = new JLabel();
	    	answers[i].setVisible(true);
	    	answers[i].setBorder(BorderFactory.createLineBorder(Color.BLACK));
	    	add(answers[i]);
	    }
	    answers[0].setText("<html>1. Assign instructional coach to work with new teachers on instructional methods.</html>");
	    answers[1].setText("<html>2. Display student work prominently in school common areas and classrooms.</html>");
	    answers[2].setText("<html>3. Employ floating substitute to enable teachers to team teach on occasion.</html>");
	    answers[3].setText("<html>4. Encourage grade levels teams create a two week interdisciplinary project related to state standards.</html>");
	    answers[4].setText("<html>5. Establish a target that a minimum 50 percent of class time be student activity, not teacher talk.</html>");
	    answers[5].setText("<html>6. Establish requirement that each teacher have “bell ringer “ activity for students to work on as class begins.</html>");
	    answers[6].setText("<html>7. Follow district policy that learning objectives for each class be posted on the board in each classroom.</html>");
	    answers[7].setText("<html>8. Have administrative staff do 50 classroom walkthroughs per week.</html>");
	    answers[8].setText("<html>9. Offer school wide teacher workshop on differentiated Instruction.</html>");
	    answers[9].setText("<html>10. Put to a faculty vote on whether to use 90 minute or 45 minute classes.</html>");
	    answers[10].setText("<html>11. Require teachers to assign homework each night.</html>");
	    answers[11].setText("<html>12. Require that all teachers write one Gold Seal Lesson related to 21st Century skill.</html>");
	    answers[12].setText("<html>13. Require that weekly lessons plans be submitted Principal’s office.</html>");
	    answers[13].setText("<html>14. Set up staff video resource with samples of various instructional strategies.</html>");
	    answers[14].setText("<html>15. Use instructional coaches to schedule exemplary lessons that other teachers can observe.</html>");
	    answers[15].setText("<html>16. Work with student leadership to create monthly teacher award for outstanding Quadrant D lessons.</html>");
    }

    public void mouseEntered(MouseEvent event) {
    }
    public void mouseExited(MouseEvent event) {
    }
    public void mousePressed(MouseEvent event) {
    	if(event.getButton() == MouseEvent.BUTTON1) {
    		mouseDown = true;
    	}
    }
    public void mouseReleased(MouseEvent event) {
    	if(event.getButton() == MouseEvent.BUTTON1) {
    		mouseDown = false;
    	}
    }

    public void mouseClicked(MouseEvent event) {
	    for(int i = 0; i < 16; i++)
	    {
	    	float mouseX = event.getX();
	    	float mouseY = event.getY();
	    	//System.out.println("X: " + mouseX);
	    	//System.out.println("Y: " + mouseY);
	    	if(mouseX >= answers[i].getBounds().x && mouseX <= answers[i].getBounds().x + answers[i].getWidth()) {
	    		if(mouseY >= answers[i].getBounds().y && mouseY <= answers[i].getBounds().y + answers[i].getHeight()) {
	    			System.out.println("INSIDE BOX NUMBER: " + i);
	    		}
	    	}
	    }
    }
}