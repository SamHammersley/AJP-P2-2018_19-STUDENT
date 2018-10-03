package uk.ac.tees.q5315908;

import uk.ac.tees.q5315908.view.View;

public final class EntryPoint {

	private final Game game;
	
	private final View view = new View();
	
	public EntryPoint(int participantCount) {
		this.game = new Game(participantCount);
	}
	
	public static void main(String...args) {
		EntryPoint ep = new EntryPoint(2 + (int) (Math.random() * 4));
		
		ep.game.setup();
		ep.view.setup(ep.game);
	}
	
}