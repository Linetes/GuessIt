import javax.swing.JFrame;

public class GuessIt {

	public static void main(String[] args) {
		MyWindow mw=new MyWindow();
		mw.setSize(540,960);
		mw.setVisible(true);
		mw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mw.setAlwaysOnTop(true);
		mw.playSound();
	}
}