import java.applet.AudioClip;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LaughTrack implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton giggleButton = new JButton();
	JButton snortButton = new JButton();
	JButton evilButton = new JButton();
	JButton weirdoButton = new JButton();

	public static void main(String[] args) {
		LaughTrack laugh = new LaughTrack();
		laugh.Laughs();

	}

	void Laughs() {
		frame.add(panel);
		panel.add(giggleButton);
		panel.add(snortButton);
		panel.add(evilButton);
		panel.add(weirdoButton);
	
		giggleButton.addActionListener(this);
		snortButton.addActionListener(this);
		evilButton.addActionListener(this);
		weirdoButton.addActionListener(this);
		

		giggleButton.setText("Giggle");
		giggleButton.setForeground(Color.PINK);
		snortButton.setText("Snort");
		snortButton.setForeground(Color.GREEN);
		evilButton.setText("Evil");
		weirdoButton.setText("Weirdo");
		frame.setVisible(true);
		frame.pack();
	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(giggleButton)){
			playSound("giggle.wav");
		}
		else if(e.getSource().equals(snortButton)){
			playSound("snort.wav");
		}
		else if(e.getSource().equals(evilButton)){
			playSound("evillaugh.wav");
		}
		else if(e.getSource().equals(weirdoButton)){
			playSound("weirdo.wav");
		}
		// TODO Auto-generated method stub
		
	}

}
