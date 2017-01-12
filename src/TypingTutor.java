import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {
	char currentLetter = generateRandomLetter();
	JLabel label = new JLabel();
	JFrame frame = new JFrame(); 
	JPanel panel = new JPanel();
	int score = 0;
	public static void main(String[] args) {
		TypingTutor t = new TypingTutor();
		t.setup();
		
		
	}
	
	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
		
		
	}
	public void setup(){
		
		frame.addKeyListener(this);
		
		
		frame.add(panel);
		
		panel.add(label);
		frame.setVisible(true);
		label.setText(currentLetter + "");
		label.setFont(label.getFont().deriveFont(400.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		
		frame.pack();
		
		//System.out.println(currentLetter + "");
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getKeyChar());
		
		if(currentLetter == e.getKeyChar()){
			System.out.println("Correct");
			panel.setBackground(Color.green);
			score++;
			
		} else {
			System.out.println("Incorrect");
			panel.setBackground(Color.red);
			score--;
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		currentLetter = generateRandomLetter();
		label.setText(currentLetter + "");

		
		
	}
	
	
	
}
