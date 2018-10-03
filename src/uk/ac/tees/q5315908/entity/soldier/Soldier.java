package uk.ac.tees.q5315908.entity.soldier;

import uk.ac.tees.q5315908.Faction;
import uk.ac.tees.q5315908.entity.Entity;

public abstract class Soldier extends Entity {

	public static int totalPoints = 0;
	
	public Soldier(Faction faction) {
		super(faction);
	}
	
}