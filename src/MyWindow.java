import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JFrame;

public class MyWindow extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	private MyCanvas canvas;
	
	public MyWindow(){
		super();
		canvas=new MyCanvas();
		setLayout(new BorderLayout());
		ExecutorService threadExecutor = Executors.newCachedThreadPool();
		this.add(canvas,BorderLayout.CENTER);
		threadExecutor.execute(canvas);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
	public synchronized void playSound() 
    {
            new Thread(new Runnable() 
            {
                public void run() 
                {
                    try
                    {
                        Clip clip = AudioSystem.getClip();
                        AudioInputStream inputStream = AudioSystem.getAudioInputStream(getClass().getResource("rsrc/mao.wav"));
                        clip = AudioSystem.getClip();
                        clip.open(inputStream);
                        clip.start(); 
                        clip.loop(Clip.LOOP_CONTINUOUSLY);
                    } 
                    catch (Exception e) 
                    {
                        System.err.println(e.getMessage());
                    }
                }
            }).start();
        }
}