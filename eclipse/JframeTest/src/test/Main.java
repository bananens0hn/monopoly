package test;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main extends JFrame{

	public Main(int width, int height) {
		setBounds(0, 0, width, height);
		setVisible(true);
		
	}
	public static void main(String args[]) {
		Main main=new Main(1000, 1000);
		main.repaint();
	}
	private static final long serialVersionUID = 1L;
	@Override
	public void paint(Graphics g) {
		int width=getWidth();
		int height=getHeight();
		g.setColor(Color.black);
		g.fillRect(0,0,width, height);
		g.drawImage(loadImage("H:\\Documents\\pngs\\lulw.png"), 10,200, 200,100, null);
		
		g.drawImage(loadImage("H:\\Documents\\pngs\\owncase.png"),0, 0, 200, 100, null);
		
	}
public BufferedImage loadImage(String path) {
	try {
		File file=new File(path);
		return ImageIO.read(file);
	} catch (Exception e) {
		System.err.println("err");
	}
	return null;
}
}
