import javax.swing.JOptionPane;

public class Spongebob {
public static void main(String[] args) {
	int fav = JOptionPane.showOptionDialog(null,
		
		Object[] options = {"Yes, please",
                "No, thanks",
                "No eggs, no ham!"};
int n = JOptionPane.showOptionDialog(frame,
"Would you like some green eggs to go "
+ "with that ham?",
"A Silly Question",
JOptionPane.YES_NO_CANCEL_OPTION,
JOptionPane.QUESTION_MESSAGE,
null,
options,
options[2]);
		
	SeaCreature spongebob = new SeaCreature("Spongebob");
	System.out.println("Spongebob");
	spongebob.eat();
	spongebob.laugh();
	
	} 
	
	else if(fav.equalsIgnoreCase("Patrick")){
		
	SeaCreature patrick = new SeaCreature("Patrick");
	System.out.println("Patrick");
	patrick.eat();
	patrick.laugh();
	
	}
	
	else if(fav.equalsIgnoreCase("Squidward")){
		
	SeaCreature squidward = new SeaCreature("Squidward");
	System.out.println("Squidward");
	squidward.eat();
	squidward.laugh();
	
	}
	
	
}
}
