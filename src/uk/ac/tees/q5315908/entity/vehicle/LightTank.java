package uk.ac.tees.q5315908.entity.vehicle;

import uk.ac.tees.q5315908.Faction;

public class LightTank extends Vehicle {

	public LightTank(Faction faction) {
		super(faction);
	}

	@Override
	public String kill() {
		Vehicle.totalPoints += getPoints();
		return "A " + faction + " light tank is destroyed: +" + getPoints() + "pts.\n";
	}

	@Override
	public int getPoints() {
		return faction.getLightTankPoints();
	}

}
