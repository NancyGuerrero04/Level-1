
public class smurfRunner {
	public static void main(String[] args) {
		
		Smurf Handy = new Smurf("Handy", "white", "male");
		
		String name = Handy.getName();
		System.out.println(name);
		Handy.eat();
		System.out.println("\n");
		
		
		
		
		
		Smurf PAPA = new Smurf("PAPA", "red", "male");
		String name2 = PAPA.getName();
		System.out.println(name2);
		
		String hat2 = PAPA.getHatColor();
		System.out.println("My hat is " + hat2);
		
		String gender2 = PAPA.isGirlOrBoy();
		System.out.println("I am a " + gender2);
		System.out.println("\n");
		
		
		
		Smurf Smurfett = new Smurf("Smurfett", "white", "female");
		
		String name3 = Smurfett.getName();
		System.out.println(name3);
		
		String hat3 = Smurfett.getHatColor();
		System.out.println("My hat is " + hat3);

		String gender3 = Smurfett.isGirlOrBoy();
		System.out.println("I am a " + gender3);
	}
}
