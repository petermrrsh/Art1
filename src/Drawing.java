
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Timer;

import javax.swing.JFrame;


public class Drawing extends Canvas {

    
	/*public static boolean drawing = true;
	public static ArrayList<Rectangle> rectangles;
	public static Timer t;
	public static int degree;

	
	
	public void paint(Graphics g) {
		
		rectangles = new ArrayList<>();
		
		double sideLength = 5;
    	for (int i = 0; i < 30; i++) {
    		rectangles.add(centerRect(200,200, (int)sideLength, (int)sideLength));
    		sideLength += 10;
    	}
    	
		animationLoop(g);
		
    }
	
	public static void update() {
		degree += 5;
		System.out.println("degree: " + degree);
	}
	
	public static void render(Graphics g) {
		//refresh background
		g.setColor(Color.white);
		g.fillRect(0, 0, 500, 500);
		//draw circles
		g.setColor(Color.black);
		for (Rectangle rect: rectangles) {
				drawOvalFrom(g, rectangleAtDegree(rect, degree));
		}	
		
	}
	
	public static Rectangle rectangleAtDegree(Rectangle r, int degree) {
		int centerX = r.x + r.width/2;
		double width = r.width * Math.abs(Math.cos((degree/360.0)*2*Math.PI));
		return centerRect(centerX, 200, (int)width, r.height);
	}
	
	
	
	public static void animationLoop(Graphics g) 
    	{
    	    
    	}
    
	public static void drawOvalFrom(Graphics g, Rectangle rect) {
		g.drawOval(rect.x, rect.y, rect.width, rect.height);
	}
	
    
	
	
	public static void main(String[] args) {
        JFrame frame = new JFrame("My Drawing");
        Canvas canvas = new Drawing();
        canvas.setSize(400, 400);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
        Listener listener = new Listener();
        frame.addKeyListener(listener);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        while(drawing) //the loop
    	    {
    	        update();
    	        render(g);
    	        try {
    	            Thread.sleep(30);                 
    	        } catch(InterruptedException ex) {
    	            Thread.currentThread().interrupt();
    	        }
    	    }
        
    }



	public static void stopDrawing() {
		drawing = false;
		
	}*/

}


