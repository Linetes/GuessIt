import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

public class Card extends GameObject {
	
	public Card(int x, int y, int sizeX, int sizeY, String name) {
		super();
		this.x = x;
		this.y = y;
		this.sizeX = sizeX;
		this.sizeY = sizeY;
		this.rect = new Rectangle(x,y,sizeX,sizeY);
		this.pic = null;
		this.name = name;
		this.img=ImageLoader.getInstance();
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void setSizeX(int sizeX) {
		this.sizeX = sizeX;
	}
	public void setSizeY(int sizeY) {
		this.sizeY = sizeY;
	}
	public void setRect(Rectangle rect) {
		this.rect = rect;
	}
	public void setPic(BufferedImage pic) {
		this.pic = pic;
	}
	public String getName() {
		return name;
	}
	public boolean collision(int X,int Y) {
		if(X>=this.x&&X<=(this.x+sizeX)&&Y>=this.y&&Y<=(this.y+sizeY)) {
			return true;
		}
		else{
			return false;
		}
	}

	public void paint(Graphics g){//Paint the buffered image instead for next iteration
		g.fillRect(x, y, sizeX, sizeY);
		g.drawImage(img.getImage(name), x, y, null);
	}
	
	@Override
	public void update() {
		rect.setLocation(x,y);	
	}
}
