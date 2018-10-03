package uk.ac.tees.q5315908.entity.vehicle;

import uk.ac.tees.q5315908.Faction;

public class HeavyTank extends Vehicle {

	public HeavyTank(Faction faction) {
		super(faction);
	}

	@Override
	public String kill() {
		Vehicle.totalPoints += getPoints();
		return "A " + faction + " heavy tank is demolished: +" + getPoints() + "pts.\n";
	}

	@Override
	public int getPoints() {
		return faction.getHeavyTankPoints();
	}

}