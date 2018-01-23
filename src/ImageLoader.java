import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Hashtable;

import javax.imageio.ImageIO;

public class ImageLoader {
	private Hashtable <String, BufferedImage> images = new Hashtable<String, BufferedImage>();
	private static ImageLoader instance;
	
	 public static synchronized ImageLoader getInstance(){
			if(instance == null){
			    instance = new ImageLoader();
			}
			return instance;
	    }
	
	private ImageLoader(){
		try {
			images.put("do4", ImageIO.read(ImageLoader.class.getResourceAsStream("rsrc/do4.png")));
			images.put("re4", ImageIO.read(ImageLoader.class.getResourceAsStream("rsrc/re4.png")));
			images.put("mi4", ImageIO.read(ImageLoader.class.getResourceAsStream("rsrc/mi4.png")));
			images.put("fa4", ImageIO.read(ImageLoader.class.getResourceAsStream("rsrc/fa4.png")));
			images.put("sol4", ImageIO.read(ImageLoader.class.getResourceAsStream("rsrc/sol4.png")));
			images.put("la4", ImageIO.read(ImageLoader.class.getResourceAsStream("rsrc/la4.png")));
			images.put("si4", ImageIO.read(ImageLoader.class.getResourceAsStream("rsrc/si4.png")));
			images.put("do5", ImageIO.read(ImageLoader.class.getResourceAsStream("rsrc/do5.png")));
			images.put("do", ImageIO.read(ImageLoader.class.getResourceAsStream("rsrc/do.png")));
			images.put("re", ImageIO.read(ImageLoader.class.getResourceAsStream("rsrc/re.png")));
			images.put("mi", ImageIO.read(ImageLoader.class.getResourceAsStream("rsrc/mi.png")));
			images.put("fa", ImageIO.read(ImageLoader.class.getResourceAsStream("rsrc/fa.png")));
			images.put("sol", ImageIO.read(ImageLoader.class.getResourceAsStream("rsrc/sol.png")));
			images.put("la", ImageIO.read(ImageLoader.class.getResourceAsStream("rsrc/la.png")));
			images.put("si", ImageIO.read(ImageLoader.class.getResourceAsStream("rsrc/si.png")));
			images.put("back1", ImageIO.read(ImageLoader.class.getResourceAsStream("rsrc/back1.png")));
			images.put("back2", ImageIO.read(ImageLoader.class.getResourceAsStream("rsrc/back2.png")));
			images.put("title", ImageIO.read(ImageLoader.class.getResourceAsStream("rsrc/Title.png")));
			images.put("start", ImageIO.read(ImageLoader.class.getResourceAsStream("rsrc/start.png")));
			images.put("end", ImageIO.read(ImageLoader.class.getResourceAsStream("rsrc/end.png")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public BufferedImage getImage(String k){
		return images.get(k);
	}
}
