package uk.ac.tees.q5315908.view;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.imageio.ImageIO;

public final class ImageCache {

	private static final Map<String, BufferedImage> cache = new HashMap<>();
	
	private static final String PNG_EXTENSION = ".png";
	
	private static final String IMAGE_DIRECTORY = "./images/";
	
	public static BufferedImage getImage(String name) {
		return cache.computeIfAbsent(name, s -> {
			try {
				return ImageIO.read(new File(IMAGE_DIRECTORY + s + PNG_EXTENSION));
			} catch (IOException e) {
				e.printStackTrace();
				return null;
			}
		});
	}
	
}