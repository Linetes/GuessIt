/*
 * GameStatePaused.java
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

public class GameStateMenu implements GameState {
	GameStateContext gc;
	
	public GameStateMenu(GameStateContext gc){
		this.gc = gc;
	}
	public GameStateMenu() {

		// TODO Auto-generated constructor stub
	}
	
	public GameStateContext getGc() {
		return gc;
	}
	public void setGc(GameStateContext gc) {
		this.gc = gc;
	}
	public void end(){
		gc.setCurrent(gc.getGameOver());
	}
	
	public void play(){
	}
	
	public void paint(Graphics g){
		g.drawImage(ImageLoader.getInstance().getImage("title"), 70, 100, null);
		g.drawImage(ImageLoader.getInstance().getImage("start"), 70, 400, null);

	}
	
	public void update(){
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getX()>=70 && e.getX()<=480 && e.getY()>=400 && e.getY()<=610) {
			gc.play();
		}
		
	}
	@Override
	public void menu() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 0;
	}
}

