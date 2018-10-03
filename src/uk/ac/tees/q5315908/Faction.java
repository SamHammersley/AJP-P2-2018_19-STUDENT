package uk.ac.tees.q5315908;

public enum Faction {

	GDI(25, 55, 100, 150, 225),
	
	NOD(20, 60, 95, 175, 310),
	
	SCRIN(15, 70, 90, 150, 270);
	
	private final int cadetPoints, majorPoints, colonelPoints;
	
	private final int heavyTankPoints, lightTankPoints;
	
	Faction(int cadetPoints, int majorPoints, int colonelPoints, int lightTankPoints, int heavyTankPoints) {
		this.cadetPoints = cadetPoints;
		this.majorPoints = majorPoints;
		this.colonelPoints = colonelPoints;
		this.lightTankPoints = lightTankPoints;
		this.heavyTankPoints = heavyTankPoints;
	}

	public int getCadetPoints() {
		return cadetPoints;
	}
	
	public int getMajorPoints() {
		return majorPoints;
	}
	
	public int getColonelPoints() {
		return colonelPoints;
	}
	
	public int getLightTankPoints() {
		return lightTankPoints;
	}
	
	public int getHeavyTankPoints() {
		return heavyTankPoints;
	}
	
}