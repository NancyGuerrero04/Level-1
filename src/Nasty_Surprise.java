import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Nasty_Surprise implements ActionListener{
	JButton trickButton = new JButton();
	JButton treatButton = new JButton();
	public static void main(String[] args) {
		Nasty_Surprise nasty = new Nasty_Surprise();
		nasty.makeUserInterface();
		
	}
	
	public void makeUserInterface(){
		//This is where I create my "new"'s 
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		
		// Adding components to each other
		frame.add(panel); 
		panel.add(treatButton);
		panel.add(trickButton);
		
		frame.setVisible(true);
		frame.pack();
		
		trickButton.setText("Trick");
		treatButton.setText("Treat");
		trickButton.addActionListener(this);
		treatButton.addActionListener(this);
		
		
		
		
		
	}
	private void showPictureFromTheInternet(String imageUrl) {
		try {
			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			JLabel imageLabel = new JLabel(icon);
			JFrame frameForImage = new JFrame();
			frameForImage.add(imageLabel);
			frameForImage.setVisible(true);
			frameForImage.pack();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("click"); // Test to check if listening
		if(e.getSource().equals(trickButton)){
			showPictureFromTheInternet("http://cdn4.list25.com/wp-content/uploads/2013/04/22-24_tn.jpg");
				
		}
		else if(e.getSource().equals(treatButton)){
			showPictureFromTheInternet("https://a.disquscdn.com/get?url=http%3A%2F%2Fwww.wikihow.com%2Fimages%2Fc%2Fcf%2FCheat-on-Scary-Maze-Step-5.jpg&key=Mj0GY28ros4-4bC7kZJonA");
		}

	}

}
