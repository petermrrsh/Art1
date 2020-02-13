import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Animation extends JPanel {

	ArrayList<Rect> rectangles;
	public static int NUM_CIRCLES = 30;

	private void updateRectangles() {
		boolean startNext = true;
		for (Rect rect : rectangles) {
			if (rect.isRotating()) {
				rect.setVertDegree(rect.getVertDegree() + 2);
			} else if (startNext) {
				rect.setRotating(true);
				startNext = false;
			}
		}
	}
	
	private void createRectangles() {
		rectangles = new ArrayList<>();
		
		double sideLength = 5;
    	for (int i = 0; i < NUM_CIRCLES; i++) {
    		rectangles.add(new Rect(300,300, (int)sideLength, (int)sideLength));
    		sideLength += 20;
    	}
	}
	

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		
		//refresh background
		g2d.setColor(Color.white);
		g2d.fillRect(0, 0, 800, 800);
		
		//draw circles
		g2d.setColor(Color.black);
		g2d.setStroke(g2d.getStroke());
		for (Rect rect: rectangles) {
				Rectangle r = rect.getRectangle();
				g2d.drawOval(r.x, r.y, r.width, r.height);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		JFrame frame = new JFrame("Mini Tennis");
		Animation a = new Animation();
		frame.add(a);
		frame.setSize(630, 650);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		a.createRectangles();
		int counter = 0;
		
		while (true) {
			if (counter % 10 == 0) {
				
			}
			a.updateRectangles();
			a.repaint();
			Thread.sleep(20);
		}
	}
}