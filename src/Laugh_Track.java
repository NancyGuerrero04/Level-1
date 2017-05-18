import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Laugh_Track {
	JFrame frame = new JFrame(); 
	JPanel panel = new JPanel(); 
	JButton giggleButton = new JButton();
	JButton snortButton = new JButton();
	JButton evilButton = new JButton();
	JButton weirdoButton = new JButton();
	
	void Laughs() {
		frame.add(panel);
		panel.add(giggleButton);
		panel.add(snortButton);
		panel.add(evilButton);
		panel.add(weirdoButton);
		
		giggleButton.setText("Giggle");
		snortButton.setText("Snort");
		evilButton.setText("Evil");
		weirdoButton.setText("Weirdo");
		frame.setVisible(true);
		frame.pack();
	}
	
	
	public static void main(String[] args) {
		
	}
	
	
}
