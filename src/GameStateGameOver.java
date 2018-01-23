/*
 * GameStateGameOver.java
 * 
 * Copyright 2017 Edgar Daniel Fernández Rodríguez <edgar.fernandez@me.com>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */
import java.awt.*;
import java.awt.event.MouseEvent;

public class GameStateGameOver implements GameState {
	GameStateContext gc;
	private int player1;
	private int player2;
	private String prev;
	private String ganador;
	
	
	public GameStateContext getGc() {
		return gc;
	}
	public void setGc(GameStateContext gc) {
		this.gc = gc;
	}
	public GameStateGameOver(GameStateContext gc){
		this.gc = gc;
	}
	public GameStateGameOver() {
		// TODO Auto-generated constructor stub

	}
	public void end(){
	}
	public void results(){
		player1=gc.getResults1();
		player2=gc.getResults2();
		if(player1>player2) {
			prev = "El ganador es";
			ganador = "Player 1 con: " + player1 + " puntos.";
		}
		else if(player1<player2) {
			prev = "El ganador es";
			ganador = "Player 2 con: " + player2 + " puntos.";
		}
		else {
			prev = "Es un empate";
			ganador = "de Players con: " + player1 + " puntos.";
		}
	}
	
	public void paint(Graphics g){
		results();
		g.setColor(Color.white);
		g.drawImage(ImageLoader.getInstance().getImage("end"), 70, 250, null);
		g.setFont(new Font("Helvetica", Font.PLAIN, 30));
		g.drawString(prev,170,300);
		g.drawString(ganador,120,400);
	}
	
	public void update(){
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
	}
	@Override
	public void menu() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 0;
	}
}

