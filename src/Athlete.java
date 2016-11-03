import javax.swing.JOptionPane;

public class Athlete {

	String name = "Runner"; 
	int speed; 
	int bibNumber; 
	static String raceLocation = "San Francisco";
	static String startTime = "4:30 AM";
	static int numRunners = 1000; 
	
	Athlete(String name, int speed){
		this.name = name; 
		this.speed = speed;
		numRunners++; 
		bibNumber = numRunners;
	};
	public String toString(){
		String a = "Athlete: " + name + " Speed: " + speed + " Number: " + bibNumber; 
			
		return a; 
	};
	
	public static void main(String[] args) {
		 Athlete Bob = new Athlete("Bob", 20);
		 Athlete Susan = new Athlete("Susan", 10);
		 Athlete Jen = new Athlete("Jen", 10);
		 
		System.out.println(Bob);
		System.out.println(Susan);
		System.out.println(Jen);
				
	}		
}
