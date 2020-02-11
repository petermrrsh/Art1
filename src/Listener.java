import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Listener implements KeyListener {


	public void keyTyped(KeyEvent e) {

		
	}


	public void keyPressed(KeyEvent e) {
		System.out.println("Stop Drawing");
		Drawing.stopDrawing();
		
	}


	public void keyReleased(KeyEvent e) {

		
	}
	
	
	
}
