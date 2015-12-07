package drew;

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
			System.err.println("createGUI did not complete!");
		}
	}
	
	private void createGUI() {
		Quiz myQuiz = new Quiz();
		myQuiz.setOpaque(true);
		setContentPane(myQuiz);
	}
}
