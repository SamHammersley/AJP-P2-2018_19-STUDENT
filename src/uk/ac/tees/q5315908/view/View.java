package uk.ac.tees.q5315908.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;

import uk.ac.tees.q5315908.Game;
import uk.ac.tees.q5315908.entity.Entity;

public final class View {

	public static final String TITLE = "Killable - the game!";
	
	private final JFrame frame = new JFrame(TITLE);
	
	public View() {
		
	}
	
	public void setup(Game game) {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridBagLayout());
		
		createLayout(frame, game);
		
		frame.setVisible(true);
		frame.pack();
	}
	
	private void createLayout(JFrame container, Game game) {

		GridBagConstraints constraints = new GridBagConstraints();
		constraints.gridx = 2;
		constraints.gridy = 0;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		container.add(new JImage(ImageCache.getImage("button")), constraints);
		
		constraints.gridy = 1;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		
		for (int i = 0; i < game.getParticipantCount(); i++) {
			Entity e = game.getParticipants().get(i);
			
			constraints.gridx = i;
			
			JImage image = new JImage(ImageCache.getImage(entityToImageName(e)));
			
			container.add(image, constraints);
		}
		
		for (int i = 0; i < 5 - game.getParticipantCount(); i++) {
			constraints.gridx++;
			container.add(new JImage(ImageCache.getImage("blank")), constraints);
		}
		
		container.setResizable(false);
	}
	
	public String entityToImageName(Entity entity) {
		return entity.getFaction().toString().toLowerCase() + "-" + entity.getClass().getSimpleName().toLowerCase();
	}
	
}