import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;

public class MyCanvas extends Canvas implements Runnable {

	private static final long serialVersionUID = 1L;
	private GameStateContext context;
	private volatile boolean play = false;
	BufferedImage image;
	private Graphics dbg;
	private Image dbImage = null;
	private int WIDTH,HEIGHT;

	public MyCanvas() {
		super();
		setFocusable(true);
		context=new GameStateContext();
		addMouseListener(context);
		WIDTH = 540;
		HEIGHT = 960;
	}


	public void update(Graphics g){
		paint(g);
	}
	public void stopGame(){
		play = false;
	}//stopGame()

	@Override
	public void run() {
		play = true;
		while (play) {
			gameupdate();
			gameRender();
			printScreen();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	private void gameRender()
	  {
	    if (dbImage == null){
	      dbImage = createImage(WIDTH, HEIGHT);
	      if (dbImage == null) {
	return; }
	      else
	        dbg = dbImage.getGraphics();
	}
	   context.paint(dbg);
	  }
	
    
    private void printScreen() {
    		Graphics g = getGraphics();
            if ((g != null) && (dbImage != null)) {
                g.drawImage(dbImage, 0, 0, null);
            }
        Toolkit.getDefaultToolkit().sync();
            if (g != null) {
                g.dispose();
            }
    }

	public void gameupdate(){ //Example of animation running in the back
		context.update();
	}
}