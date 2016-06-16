 // Copyright Wintriss Technical Schools 2013
	import java.awt.Component;
	import java.awt.Frame;
	import java.net.MalformedURLException;
	import java.net.URL;

	import javax.swing.Icon;
	import javax.swing.ImageIcon;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JOptionPane;

	public class Photo_Quiz {

		public static void main(String[] args) throws Exception {
			Frame quizWindow = new Frame();
			quizWindow.setVisible(true);
			int score = 0; 
			// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image URL”)
			String images = "file:///Users/league/Desktop/Screen%20Shot%202016-06-15%20at%206.36.56%20PM.png";
			// 2. create a variable of type "Component" that will hold your image
			Component component;
			// 3. use the "createImage()" method below to initialize your Component
			component = createImage(images);
			// 4. add the image to the quiz window
			quizWindow.add(component);
			// 5. call the pack() method on the quiz window
			quizWindow.pack();
			// 6. ask a question that relates to the image
			String answer = JOptionPane.showInputDialog("Who's ear is this?");
			// 7. print "CORRECT" if the user gave the right answer
			if(answer.equalsIgnoreCase("Obama")){
				JOptionPane.showMessageDialog(null, "CORRECT!");
				score++;
			}
			// 8. print "INCORRECT" if the answer is wrong
			else{
				JOptionPane.showMessageDialog(null, "INCORRECT");
				score--;
			}
			// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
			quizWindow.remove(component);
			// 10. find another image and create it (might take more than one line of code)
			String images2 = "file:///Users/league/Desktop/Screen%20Shot%202016-06-15%20at%206.38.24%20PM.png";
			// 11. add the second image to the quiz window
			Component component2;
			component2 = createImage(images2);
			quizWindow.add(component2);
			// 12. pack the quiz window
			quizWindow.pack();
			// 13. ask another question
			String answer2 = JOptionPane.showInputDialog("Who's ear is this?");
			// 14+ check answer, say if correct or incorrect, etc.
			if(answer2.equalsIgnoreCase("Zac Efron")){
				JOptionPane.showMessageDialog(null, "CORRECT!");
				score++;
			}
			else
			{ 
				JOptionPane.showMessageDialog(null, "INCORRECT!");
				score--;
			}
		}

		private static Component createImage(String imageUrl) throws MalformedURLException {
			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			JLabel imageLabel = new JLabel(icon);
			return imageLabel;
		}

		/* OPTIONAL */
		// *14. add scoring to your quiz
	
		
		// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	




