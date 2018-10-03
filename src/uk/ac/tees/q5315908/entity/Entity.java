package uk.ac.tees.q5315908.entity;

import uk.ac.tees.q5315908.Faction;
import uk.ac.tees.q5315908.Killable;

public abstract class Entity implements Killable {

	protected final Faction faction;
	
	public Entity(Faction faction) {
		this.faction = faction;
	}
	
	public abstract int getPoints();
	
	public Faction getFaction() {
		return faction;
	}
	
}