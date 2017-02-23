import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Slot_Machine implements ActionListener {
	JLabel l1; 
	JLabel l2;
	JLabel l3;
	public static void main(String[] args) {
		
		Slot_Machine slot = new Slot_Machine();
		slot.slotmachine();

	}
	
	int randomNum(){
		return new Random().nextInt(5)+1;
	}

	void slotmachine() {
		JPanel p = new JPanel();
		JFrame f = new JFrame();
		f.setVisible(true);
		f.add(p);
		
		l1 = new JLabel();
		l1.setText(randomNum() + "");
		p.add(l1);
		l1.setFont(l1.getFont().deriveFont(400.0f));
		
		l2 = new JLabel();
		l2.setText(randomNum() + "");
		p.add(l2);
		l2.setFont(l2.getFont().deriveFont(400.0f));
		
		l3 = new JLabel();
		l3.setText(randomNum() + "");
		l3.setFont(l3.getFont().deriveFont(400.0f));
		
		p.add(l3);
		
		JButton b = new JButton("Spin");
		b.setFont(b.getFont().deriveFont(100.0f));
		
		p.add(b);
		
		b.addActionListener(this);
		
		f.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		l1.setText(randomNum() +"");
		
		l2.setText(randomNum() + "");
		l3.setText(randomNum() + "");
		
		if(l1.getText().equals(l2.getText()) && l1.getText().equals(l3.getText())){
			JOptionPane.showMessageDialog(null, "You won!");
		}
	}

}
