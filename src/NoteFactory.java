
public class NoteFactory {
    private Note e;
    private Card a;
    private static NoteFactory instance;
    
    public static synchronized NoteFactory getInstance(){
    	if(instance == null){
    	    instance = new NoteFactory();
    	}
    	return instance;
    }
    public Note getNote(int x, int y,int sizeX,int sizeY){
    	e = new Note(x,y,sizeX,sizeY);
    	return e;
    }
    public Card getCard(int x, int y,int sizeX,int sizeY, String string){
    	a = new Card(x,y,sizeX,sizeY, string);
    	return a;
    }
}
