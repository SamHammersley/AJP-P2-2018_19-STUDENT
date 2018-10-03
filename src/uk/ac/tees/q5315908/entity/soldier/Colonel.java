package uk.ac.tees.q5315908.entity.soldier;

import uk.ac.tees.q5315908.Faction;

public class Colonel extends Soldier {

	public Colonel(Faction faction) {
		super(faction);
	}

	@Override
	public String kill() {
		Soldier.totalPoints += getPoints();
		return "A " + faction + " colonel retires, permanently: +" + getPoints() + "pts.\n";
	}

	@Override
	public int getPoints() {
		return faction.getColonelPoints();
	}

}
