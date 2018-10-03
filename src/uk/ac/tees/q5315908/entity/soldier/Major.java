package uk.ac.tees.q5315908.entity.soldier;

import uk.ac.tees.q5315908.Faction;

public class Major extends Soldier {

	public Major(Faction faction) {
		super(faction);
	}

	@Override
	public String kill() {
		System.out.println(Soldier.totalPoints + " + " + getPoints());
		Soldier.totalPoints += getPoints();
		System.out.println(Soldier.totalPoints);
		return "A " + faction + " major explodes into pieces: +" + getPoints() + "pts.\n";
	}

	@Override
	public int getPoints() {
		return faction.getMajorPoints();
	}

}
