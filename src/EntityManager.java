
import java.awt.Graphics;
import java.util.ArrayList;

public class EntityManager {
	
	GameStateContext gc;
	private ArrayList<Note> notas = new ArrayList<Note>();
	private ArrayList<Card> cards = new ArrayList<Card>();
	private Note a;
	private Card b;
	private Note tmp;
	
	public EntityManager() {
		tmp = NoteFactory.getInstance().getNote(170,200,0,0);
		notas.add(tmp);
		Card cardDo = NoteFactory.getInstance().getCard(50,500,50,100,"do");
		Card cardRe = NoteFactory.getInstance().getCard(160,500,50,100,"re");
		Card cardMi = NoteFactory.getInstance().getCard(270,500,50,100,"mi");
		Card cardFa = NoteFactory.getInstance().getCard(380,500,50,100,"fa");
		Card cardSol = NoteFactory.getInstance().getCard(100,620,50,100,"sol");
		Card cardLa = NoteFactory.getInstance().getCard(210,620,50,100,"la");
		Card cardSi = NoteFactory.getInstance().getCard(320,620,50,100,"si");
		cards.add(cardDo);
		cards.add(cardRe);
		cards.add(cardMi);
		cards.add(cardFa);
		cards.add(cardSol);
		cards.add(cardLa);
		cards.add(cardSi);
		for(int i = 0; i<notas.size();i++){
			a = notas.get(i);
		}
	}
	public void newNote() {
		tmp = NoteFactory.getInstance().getNote(170,200,0,0);
		notas.add(tmp);
	}
	public Note getNote() {
		return tmp;
	}
	public String nombreNota() {
		String aux =tmp.getName();
		return aux;
	}
	public Card getCard(int i) {
		return cards.get(i);
	}
	
	public void paint(Graphics g){
		a.paint(g);
		for(int i = 0; i<cards.size();i++){
			b = cards.get(i);
			b.paint(g);
		}
	}
	
	public void update(){
		for(int i = 0; i<notas.size();i++){
			a = notas.get(i);
			a.update();
		}	
	}
}