package uk.ac.tees.q5315908;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import uk.ac.tees.q5315908.entity.Entity;
import uk.ac.tees.q5315908.entity.soldier.Cadet;
import uk.ac.tees.q5315908.entity.soldier.Colonel;
import uk.ac.tees.q5315908.entity.soldier.Major;
import uk.ac.tees.q5315908.entity.vehicle.HeavyTank;
import uk.ac.tees.q5315908.entity.vehicle.LightTank;

public final class Game {

	private final List<Entity> participants = new ArrayList<>(5);
	
	private final int participantCount;
	
	public Game(int participantCount) {
		this.participantCount = participantCount;
	}
	
	public void setup() {
		generateRandomParticipants();
	}

	private void generateRandomParticipants() {
		for (int i = 0; i < participantCount; i++) {
			participants.add(createRandomEntity());
		}
	}
	
	private Entity createRandomEntity() {
		Random random = new Random();

		Faction faction = Faction.values()[random.nextInt(3)];
		int randomIndex = random.nextInt(participantCount);
		
		switch(randomIndex) {
		case 0:
			return new Cadet(faction);
		case 1:
			return new Major(faction);
		case 2:
			return new Colonel(faction);
		case 3:
			return new LightTank(faction);
		case 4:
			return new HeavyTank(faction);
		default:
			return null;
		}
	}
	
	public List<Entity> getParticipants() {
		return participants;
	}

	public int getParticipantCount() {
		return participantCount;
	}
	
}