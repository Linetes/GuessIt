import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.util.Random;

public class Note extends GameObject {
	
	private String[] names = new String[] {"do4","re4","mi4","fa4","sol4","la4","si4","do5"};
	
	public Note(int x, int y, int sizeX, int sizeY) {
		super();
		this.x = x;
		this.y = y;
		this.sizeX = sizeX;
		this.sizeY = sizeY;
		this.rect = new Rectangle(x,y-5,sizeX,sizeY);
		this.pic = null;
		img=ImageLoader.getInstance();
		random();
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
	public void setName(String name) {
		this.name = name;
	}
	
	public void random() {
		Random rand = new Random();
		int number = rand.nextInt(8);
		name = names[number];
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.fillRect(x, y, sizeX, sizeY);
	    g.drawImage(img.getImage(name), x, y, null);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}
	public String getName() {
		return name;
	}

}