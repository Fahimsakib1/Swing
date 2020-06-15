package Example2_JFrame;

import javax.swing.JFrame;

public class FrameLocation 
{

	public static void main(String[] args) 
	{
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setBounds(300, 400, 700, 500);
		frame.setTitle(" This is a window");
		

	}

}
