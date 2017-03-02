import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.sun.javafx.css.CalculatedValue;

public class Simple_Calculator implements ActionListener {

	JLabel label;
	JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;
	JTextField textf1;
	JTextField textf2;

	public static void main(String[] args) {
		Simple_Calculator cal = new Simple_Calculator();
		cal.setup();

	}

	void setup() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.add(panel);
		frame.setVisible(true);

		textf1 = new JTextField();
		panel.add(textf1);
		textf1.setColumns(10);

		textf2 = new JTextField();
		panel.add(textf2);
		textf2.setColumns(10);

		b1 = new JButton();
		b1.setText("ADD");
		panel.add(b1);
		b1.addActionListener(this);

		b2 = new JButton();
		b2.setText("SUB");
		panel.add(b2);
		b2.addActionListener(this);

		b3 = new JButton();
		b3.setText("MUL");
		panel.add(b3);
		b3.addActionListener(this);

		b4 = new JButton();
		b4.setText("DIV");
		panel.add(b4);
		b4.addActionListener(this);
		
		label = new JLabel();
		panel.add(label);
		label.setFont(label.getFont().deriveFont(50.0f));

		frame.pack();

	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int num1 = Integer.parseInt(textf1.getText());
		int num2 = Integer.parseInt(textf2.getText());
		
		if (e.getSource() == b1) {
			System.out.println("Add");
			int answerAdd = num1 + num2;
			label.setText("" + answerAdd);
			
		}
		
		if(e.getSource() == b2){
			System.out.println("Sub");
			int answerSub = num1 + num2;
			label.setText("" +- answerSub);
		}

	}
}
