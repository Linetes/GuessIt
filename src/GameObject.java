import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

public abstract class GameObject{
	//variables
	protected String name;
	protected volatile int x;	
	protected volatile int y;
	protected int sizeX;
	protected int sizeY;
	protected Rectangle rect;
	protected BufferedImage pic;
	protected ImageLoader img;
	
	public abstract void paint(Graphics g);
	public abstract void update();
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getSizeX() {
		return sizeX;
	}
	public int getSizeY() {
		return sizeY;
	}	
	public Rectangle getRect() {
		return rect;
	}
	public BufferedImage getPic() {
		return pic;
	}
	
	
	public boolean collision(Rectangle r){
		
		Rectangle rec = this.getRect();
		
		System.out.println(r.getX() + r.getY());
		return rec.contains(r.getX(),r.getY());
	}
}