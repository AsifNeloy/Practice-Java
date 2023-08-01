//package BigDickPussySlayer;


import javax.swing.*;

public class BigDickPussySlayer extends JFrame{

	BigDickPussySlayer(){
		Board b = new Board();
		add(b);
		pack();//for using another class/panel
		
		setLocationRelativeTo(null);//to set in the middle
		setTitle("Big Dick Pussy Slayer");
		setResizable(false);//no resizability
	}

	public static void main(String[]args){
		new BigDickPussySlayer().setVisible(true);
	}
}