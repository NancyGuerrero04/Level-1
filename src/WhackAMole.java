import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	JButton mole;
	JFrame frame = new JFrame();
	int moleCount = 0; 
	int emptyCount = 0; 
	Date date = new Date();

	public static void main(String[] args) {
		int random = new Random().nextInt(24);
		WhackAMole whack = new WhackAMole();
		whack.drawButtons(random);
	}

	void drawButtons(int random) {
		
		JPanel panel = new JPanel();
		frame.setVisible(true);
		frame.add(panel);
		frame.setSize(300, 310);

		for (int i = 0; i < 24; i++) {
			JButton button = new JButton();
			panel.add(button);
			button.addActionListener(this);

			if (random == i) {
				button.setText("mole");
				mole = button; 
				
			} 

		}

	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (!e.getSource().equals(mole)) {
			emptyCount++; 
		}
		else {
			playSound(); 
			moleCount++;
		}
		frame.dispose();
		frame = new JFrame(); 
		int random2 = new Random().nextInt(24);
		drawButtons(random2);
		
		System.out.println("Mole:" + moleCount);
		System.out.println("Empty:" + emptyCount);
		
		if(moleCount == 10){
			endGame(date, moleCount);
		}
		if(emptyCount == 1){
			speak("dork");
		}
		else if(emptyCount == 2){
			speak("idiot");
		}
		else if(emptyCount == 3){
			speak("moron");
		}
		else if(emptyCount == 4){
			speak("complete waste of atoms");
		}
	}
	private void endGame(Date timeAtStart, int molesWhacked) {
		Date timeAtEnd = new Date();
		JOptionPane.showMessageDialog(null, "Your whack rate is "
		+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) + " moles per second.");
		}
	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}


}
