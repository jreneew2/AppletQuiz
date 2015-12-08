package drew;

import java.awt.GridLayout;
import javax.swing.JApplet;
import javax.swing.SwingUtilities;

public class Main extends JApplet{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6568278275823927953L;
	
	public void init() {
		try {
			SwingUtilities.invokeAndWait(new Runnable() {
				public void run() {
					createGUI();
				}
			});
		} catch(Exception e) {
			e.printStackTrace();
			System.err.println(e);
		}
	}
	
	private void createGUI() {
		setLayout(new GridLayout(2,1));
		Quiz myQuiz = new Quiz();
		Options myOption = new Options();
		add(myQuiz);
		add(myOption);
		setVisible(true);
	}
}
