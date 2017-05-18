import java.util.ArrayList;
import java.util.List;

public class Highland_Games {
	public static void main(String[] args) {
		Competitor.event = "Hammer Throw";
		Competitor competitor = new Competitor("Keilly", 10, 10); //

		List<Competitor> competitors = new ArrayList();
		competitors.add(competitor);
		competitor = new Competitor("Jenny", 10, 5);
		competitors.add(competitor);
		competitor = new Competitor("Amy", 2, 0);
		competitors.add(competitor);
		competitor = new Competitor("Jen", 8, 5);
		competitors.add(competitor);
		competitor = new Competitor("Jasmine", 3, 2);
		competitors.add(competitor);

		Competitor winner = competitors.get(0);
		for (Competitor c : competitors) {
			//c.setEvent("Hammer Throw");
			if (c.strength > winner.strength) {
				winner = c;
			}

		}
		System.out.println("First place for the Hammer Throw event goes to " + winner.name + "! Congrats, " + winner.name + "!");

	}
}
