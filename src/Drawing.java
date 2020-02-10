
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JFrame;


public class Drawing extends Canvas implements KeyListener{

    
	public boolean drawing = true;
	
	public void keyPressed(KeyEvent e) {

	    int key = e.getKeyCode();

	    if(key == KeyEvent.KEY_PRESSED){

	        drawing = false;
	        System.out.println("CUTTTTT");
	    }
	}

	
	
	public void paint(Graphics g) {
		
		ArrayList<Rectangle> rectangles = new ArrayList<>();
		
		double sideLength = 5;
    	for (int i = 0; i < 30; i++) {
    		rectangles.add(centerRect(200,200,(int)sideLength));
    		sideLength += 10;
    	}
		
		//while (drawing) {
			
			for (Rectangle rect: rectangles) {
				drawOvalFrom(g, rect);
				
			}
			
			
			
			
			
			
			
			
			
		//}
		
    }
    
	public void drawOvalFrom(Graphics g, Rectangle rect) {
		g.drawOval(rect.x, rect.y, rect.width, rect.height);
	}
	
    public Rectangle centerRect(int centerX, int centerY, int sideLength) {
    	return new Rectangle(centerX - (sideLength/2), centerY - (sideLength/2), sideLength, sideLength);
    }
	
	
	public static void main(String[] args) {
        JFrame frame = new JFrame("My Drawing");
        Canvas canvas = new Drawing();
        canvas.setSize(400, 400);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
        
        
    }



	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}


