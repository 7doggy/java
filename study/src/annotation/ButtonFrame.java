package annotation;

import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ButtonFrame extends JFrame {
	private static final int DEFAULT_WIDTH = 300;
	private static final int DEFAULT_HEIGHT = 200;
	
	private JPanel panel;
	private JButton yellowButton;
	private JButton blueButton;
	private JButton redButton;
	public ButtonFrame() throws HeadlessException {
		super();
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		
		panel = new JPanel();
		add(panel);
		
		yellowButton = new JButton("Yellow");
		blueButton = new JButton("Blue");
		redButton = new JButton("red");
		panel.add(yellowButton);
		panel.add(blueButton);
		panel.add(redButton);
		
		this.setVisible(true);
	}
	
	
}
