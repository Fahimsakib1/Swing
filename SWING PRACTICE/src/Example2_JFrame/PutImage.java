package Example2_JFrame;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class PutImage extends JFrame

{   
	 
		 
		 
		 private ImageIcon icon;
		 
		 
			
	     PutImage()
	     {
	    	 
	    	initComponents();
	    	
	     }
	     
	     public void initComponents()
	     {
	    	 //icon = new ImageIcon (getClass().getResource("image.jpg"));
	    	 //this.setIconImage(icon.getImage());
	     }
	 
	     
	 
	
	
	public static void main(String[] args)
	
	
	{   
		
      
		PutImage frame = new PutImage();
		
		frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 		frame.setBounds(300, 400, 700, 500);
 		frame.setTitle(" This is a window");
		
		

	}

}