package uk.ac.tees.q5315908.entity.vehicle;

import uk.ac.tees.q5315908.Faction;
import uk.ac.tees.q5315908.entity.Entity;

public abstract class Vehicle extends Entity {

	public static int totalPoints = 0;
	
	public Vehicle(Faction faction) {
		super(faction);
	}

}