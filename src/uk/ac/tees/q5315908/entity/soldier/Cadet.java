package uk.ac.tees.q5315908.entity.soldier;

import uk.ac.tees.q5315908.Faction;

public class Cadet extends Soldier {

	public Cadet(Faction faction) {
		super(faction);
	}

	@Override
	public String kill() {
		Soldier.totalPoints += getPoints();
		return "A " + faction + " cadet bites the dust: +" + getPoints() + "pts.\n";
	}

	@Override
	public int getPoints() {
		return faction.getCadetPoints();
	}

}