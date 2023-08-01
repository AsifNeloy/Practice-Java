//package BigDickPussySlayer;

import java.awt.*;
import javax.swing.*;

public class Board extends JPanel{

	private ImageIcon dick1;
	private ImageIcon dick2;
	private ImageIcon pussy;

	Board(){
		setBackground(Color.BLACK);
		setPreferredSize(new Dimension(500,500));

		loadImage();
	}
	public void loadImage(){
		 dick1 = new ImageIcon(ClassLoader.getSystemResource("icons/penis1.png"));
		
		 dick2 = new ImageIcon(ClassLoader.getSystemResource("icons/penis2.png"));
		
		 pussy = new ImageIcon(ClassLoader.getSystemResource("icons/pussy1.png"));
		
	}
}