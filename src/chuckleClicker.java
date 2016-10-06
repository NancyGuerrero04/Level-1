import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class chuckleClicker {
	
	public static void main(String[] args) {
		chuckleClicker c = new chuckleClicker();
		c.makeButton();
	}

	public void makeButton(){
		JFrame frame = new JFrame(); 
		JPanel panel = new JPanel();
		frame.add(panel);
		JButton button = new JButton();
		JButton button2 = new JButton();
		button.setText("joke");
		button2.setText("punchline");
		panel.add(button);
		panel.add(button2);
		frame.setVisible(true);
		frame.pack();
		
		
	}
}

