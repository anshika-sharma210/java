package Swingprogram; 
import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingProgram1 {

	public static void main(String[] args) {
			JFrame f=new JFrame();  
	        
			JButton b=new JButton("click"); 
			b.setBounds(130,100,100, 40); 
			          
			f.add(b);  
			          
			f.setSize(400,500);
			f.setLayout(null);  
			f.setVisible(true);
			
	}

}
