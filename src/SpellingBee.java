import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SpellingBee implements ActionListener {
	int lines;
	ArrayList<String> words = new ArrayList<>();
	String word;
	JTextField t = new JTextField();

	/*
	 * Get a random using the randowordmWord() method and ask the user how to
	 * spell it using the speak() method. If the user spells it right move on to
	 * a new word, but if they do not spell it right ask again. The only place
	 * that you need to write code in is the stuffForYouToDo() Method
	 */
	public void stuffForYouToDo() {
		// You write code in here
		JFrame f = new JFrame();
		JPanel p = new JPanel();
		JButton b = new JButton();
		word = randomWord();
		f.setVisible(true);
		f.add(p);
		p.add(t);
		p.add(b);
		Dimension dim = new Dimension(150, 25);
		t.setPreferredSize(dim);

		System.out.println(word);

		Speak("Spell the word: " + word);
		b.addActionListener(this);
		b.setText("Enter");

		f.pack();

	}

	public String randomWord() {
		return words.get(new Random().nextInt(lines));
	}

	public SpellingBee() {
		System.out.println(" /--------------------------------------------\\ ");
		System.out.println(" | Warning: Some of the words are super hard! | ");
		System.out.println(" \\--------------------------------------------/ ");
		try {
			// Get the amount of lines
			LineNumberReader lnr = new LineNumberReader(new FileReader(new File("/usr/share/dict/words")));
			lnr.skip(Long.MAX_VALUE);// Skip to the end
			lines = lnr.getLineNumber();// Get last line number
			speakNoWait(lines + " words loaded");
			System.out.println("Number of words: " + lines);
			lnr.close();
			BufferedReader br = new BufferedReader(new FileReader(new File("/usr/share/dict/words")));
			for (int i = 0; i < lines; i++) {
				words.add(br.readLine()); // adds every line to the array
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		stuffForYouToDo();
	}

	public static void main(String[] args) {
		new SpellingBee();
	}

	public void Speak(String text) {
		try {
			Runtime.getRuntime().exec("say " + text).waitFor();
		} catch (InterruptedException | IOException e) {
			e.printStackTrace();
		}
	}

	public void speakNoWait(String text) {
		try {
			Runtime.getRuntime().exec("say " + text);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (word.equalsIgnoreCase(t.getText())) {
			JOptionPane.showMessageDialog(null, "Correct!");
		} else {

		}
	}

}
