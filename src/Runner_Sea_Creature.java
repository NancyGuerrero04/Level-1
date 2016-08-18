
public class Runner_Sea_Creature {
public static void main(String[] args) {
	
	SeaCreature Spongebob = new SeaCreature("Spongebob");
	Spongebob.eat();
	Spongebob.laugh();
	System.out.println(Spongebob.getName());
	
	SeaCreature Patrick = new SeaCreature("Patrick");
	Patrick.eat();
	Patrick.laugh();
	System.out.println(Patrick.getName());
	
	SeaCreature Squidward = new SeaCreature("Squidward");
	Squidward.eat();
	Squidward.laugh();
	System.out.println(Squidward.getName());
}

}
