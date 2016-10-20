import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;


public class Gridworld {
	
	public static void main(String[] args) {
		World world = new World();
		Color blue = new Color(0,10,255);
		world.show();
		Bug bug = new Bug();
		Location loc = new Location(0,2);
		world.add(loc, bug);
		
		Bug bug2 = new Bug(blue);
		int random = new Random().nextInt(10);
		Location randomLoc = new Location(0,6);
		world.add(randomLoc, bug2);
		bug2.turn();
		bug2.turn();
		
		Flower flower = new Flower();
		Location loc2 = new Location(0,5);
		world.add(loc2, flower);
		
		Flower flower2 = new Flower();
		Location loc3 = new Location(0,7);
		world.add(loc3, flower2);
		int x = 0;
		int y = 0; 

		
		for (int i = 0; i < 11; i++) {
			Flower flowerall = new Flower();
			Location locAll = new Location(y,x);

			world.add(locAll, flowerall);
			
			x++;
			if(x>10){
				world.add(locAll, flowerall);
				i=0;
				x=2;
				y++;
			}
			
		}
		
	}
		
		
		
		
	}
	




