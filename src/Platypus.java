public class Platypus {
	private String name;

	public Platypus(String string) {
		// TODO Auto-generated constructor stub
		name=string; 
	}
	
	void sayHi(){
		System.out.println("The platypus, " + name + ", is smarter than your average platypus.");
	}
	
	public static void main(String[] args) {
		//1. Make an instance of your new pet platypus
		Platypus platy = new Platypus("Platy");
		
		//2. Call the sayHi method
		platy.sayHi();
		
		//3. Create a constructor in the platypus class so that you can give your platypus a name.
		
		
	}
}
