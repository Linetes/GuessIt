public class StateFactory {
	private GameState s;
	private static StateFactory instance;
	
	public static synchronized StateFactory getInstance(){
		if(instance == null){
			instance = new StateFactory();
		}
		return instance;
	}
	public GameState getState(int option){
		switch(option){
			case 1://player1
				s = new GameStatePlayer1();
				break;
			case 2://player2
				s = new GameStatePlayer2();
				break;
			case 3://Menu
				s = new GameStateMenu();
				break;
			case 4://game over
				s = new GameStateGameOver();
			default:
				break;
		}
		return s;
	}
}