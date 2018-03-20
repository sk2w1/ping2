package ping2;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class windowsping extends Canvas{

	private static final long serialVersionUID = 4393880733541047933L;
	
	public windowsping(int width, int height, String title, gameping game) {
		JFrame frame=new JFrame(title);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(width, height));
		frame.setMaximumSize(new Dimension(width, height));
		frame.setMinimumSize(new Dimension(width, height));
		
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.add(game);
		frame.setVisible(true);
		game.start();
	}
	

}
