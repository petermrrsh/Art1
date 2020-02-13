import java.awt.Rectangle;

public class Rect {

	private int centerX;
	private int centerY;
	private int width;
	private int height;
	private int vertDegree;
	private int horizDegree;
	private boolean rotating;
	
	public Rect(int centerX, int centerY, int width, int height) {
		this.centerX = centerX;
		this.centerY = centerY;
		this.width = width;
		this.height = height;
		vertDegree = 0;
		horizDegree = 0;
		rotating = false;
	}
	
	public Rectangle getRectangle() {
		int rotatedWidth = (int)(width * Math.abs(Math.cos((horizDegree/360.0)*2*Math.PI)));
		int rotatedHeight = (int)(height * Math.abs(Math.cos((vertDegree/360.0)*2*Math.PI)));
		return new Rectangle(centerX - (rotatedWidth/2), centerY - (rotatedHeight/2), rotatedWidth, rotatedHeight);
	}
	
	public void setVertDegree(int degree) {
		this.vertDegree = degree;
	}
	
	public int getVertDegree() {
		return vertDegree;
	}
	
	public void setHorizDegree(int degree) {
		this.horizDegree = degree;
	}
	
	public int getHotizDegree() {
		return horizDegree;
	}
	
	public boolean isRotating() {
		return rotating;
	}
	
	public void setRotating(boolean rotating) {
		this.rotating = rotating;
	}
	
	
	
	
	
	
	
}
