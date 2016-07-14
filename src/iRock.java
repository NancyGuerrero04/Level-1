import javax.swing.JOptionPane;

public class iRock {

	void iRock(String name){
		name="Nancy";
		System.out.println(name + " rocks!");
	
	}
	
	void truth(String name){
	String choice = JOptionPane.showInputDialog("JB or Pokemon?");
	if(choice.equalsIgnoreCase("JB")){
		System.out.println(name + " sucks!");
	}
	else if(choice.equalsIgnoreCase("Pokemon")){
		System.out.println(" rocks!");
	}
			
	}
}
