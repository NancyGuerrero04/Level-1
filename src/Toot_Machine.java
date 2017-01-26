
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.sun.media.jfxmedia.AudioClip;



public class Toot_Machine implements ActionListener {
public static void main(String[] args) {
	Toot_Machine toot = new Toot_Machine();
	toot.showFart();

	

}
 void showFart (){
		JFrame frame = new JFrame(); 
		JPanel panel = new JPanel();
		JButton commonFart = new JButton();
		JButton wetFart = new JButton();
		JButton quickFart= new JButton();
		
		frame.setVisible(true);
		frame.add(panel);
		panel.add(commonFart);
		panel.add(wetFart);
		panel.add(quickFart);
		commonFart.addActionListener(this);
		wetFart.addActionListener(this);
		quickFart.addActionListener(this);
		
		commonFart.setText("Common Fart");
		wetFart.setText("Wet Fart");
		quickFart.setText("Quick Fart");
		frame.pack();
 }

private void playSound(String fileName) {
	AudioClip sound = (AudioClip) JApplet.newAudioClip(getClass().getResource(fileName));
	sound.play();
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}

}
