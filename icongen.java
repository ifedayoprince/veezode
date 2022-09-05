package com.tegribyte.resize;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Main {

	public static void main(String[] args) {
		String data = "";
		File file = new File(args[0]);
		BufferedImage img, output;
		Graphics drawable;
		try {
			img = ImageIO.read(file);
			
			output = new BufferedImage(16, 16, img.getType());
			drawable = output.getGraphics();
			drawable.drawImage(img, 0, 0, 16, 16, null);
			ImageIO.write(((RenderedImage)output), "png", new File("public/assets/icon/appicon16.png"));
			
			output = new BufferedImage(24, 24, img.getType());
			drawable = output.getGraphics();
			drawable.drawImage(img, 0, 0, 24, 24, null);
			ImageIO.write(((RenderedImage)output), "png", new File("public/assets/icon/appicon24.png"));
			
			output = new BufferedImage(32, 32, img.getType());
			drawable = output.getGraphics();
			drawable.drawImage(img, 0, 0, 32, 32, null);
			ImageIO.write(((RenderedImage)output), "png", new File("public/assets/icon/appicon32.png"));
			
			output = new BufferedImage(64, 64, img.getType());
			drawable = output.getGraphics();
			drawable.drawImage(img, 0, 0, 64, 64, null);
			ImageIO.write(((RenderedImage)output), "png", new File("public/assets/icon/appicon64.png"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}

}
