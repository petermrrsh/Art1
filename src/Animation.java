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

	ArrayList<Rectangle> rectangles;
	int degree;

	private void updateRectangles() {
		degree += 1;
	}
	
	private void createRectangles() {
		rectangles = new ArrayList<>();
		
		double sideLength = 5;
    	for (int i = 0; i < 30; i++) {
    		rectangles.add(centerRect(200,200, (int)sideLength, (int)sideLength));
    		sideLength += 10;
    	}
    	degree = 0;
	}
	
	///////STATIC METHODS
	
	public static Rectangle centerRect(int centerX, int centerY, int width, int height) {
    	return new Rectangle(centerX - (width/2), centerY - (height/2), width, height);
    }
	
	public static Rectangle rectangleAtDegree(Rectangle r, int degree) {
		int centerX = r.x + r.width/2;
		double width = r.width * Math.abs(Math.cos((degree/360.0)*2*Math.PI));
		return centerRect(centerX, 200, (int)width, r.height);
	}
	
	public static void drawOvalFrom(Graphics graphics, Rectangle rect) {
		graphics.drawOval(rect.x, rect.y, rect.width, rect.height);
	}
	
	///////STATIC METHODS

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		//refresh background
		g2d.setColor(Color.white);
		g2d.fillRect(0, 0, 500, 500);
		//draw circles
		g2d.setColor(Color.black);
		for (Rectangle rect: rectangles) {
				drawOvalFrom(g2d, rectangleAtDegree(rect, degree));
		}
	}

	public static void main(String[] args) throws InterruptedException {
		JFrame frame = new JFrame("Mini Tennis");
		Animation a = new Animation();
		frame.add(a);
		frame.setSize(400, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		a.createRectangles();
		
		while (true) {
			a.updateRectangles();
			a.repaint();
			Thread.sleep(10);
		}
	}
}