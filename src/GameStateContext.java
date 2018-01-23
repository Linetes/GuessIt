/*
 * GameStateContext.java
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
 * Actualizado el 12/octubre/2017 20:00 hrs
 * 
 */

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
public class GameStateContext implements MouseListener {
	
	private ArrayList <GameState> estados = new ArrayList <GameState>();
	private GameState current;
	public static int timer;
	public static int timerback;
	public int results1;
	public int results2;
	
	public GameStateContext(){
		estados.add(StateFactory.getInstance().getState(1));
		estados.add(StateFactory.getInstance().getState(2));
		estados.add(StateFactory.getInstance().getState(3));
		estados.add(StateFactory.getInstance().getState(4));
		timerback = 1000;
		timer = 500;
		for(int i = 0;i<4;i++){
			estados.get(i).setGc(this);
		}
		current = estados.get(2);
		results1 = 0;
		results2 = 0;
	}
	public GameState getCurrent() {
		return current;
	}
	public int getResults1() {
		return results1;
	}
	public int getResults2() {
		return results2;
	}
	
	public GameState getPlayer1(){
		return estados.get(0);
	}
	
	public GameState getPlayer2(){
		return estados.get(1);
	}
	
	public GameState getMenu(){
		return estados.get(2);
	}
	
	public GameState getGameOver(){
		return estados.get(3);
	}
	
	public void setCurrent(GameState gs){
		current = gs;
	}
	
	public void end(){
		current.end();
	}
	
	public void play(){
		Random rand = new Random();
		int number = rand.nextInt(2);
		if(number%2==0) {
			current = estados.get(0);
		}
		else {
			current = estados.get(1);
		}
	}
	public void changePlay() {
		if(current==estados.get(0)) {
			current = estados.get(1);
		}
		else {
			current = estados.get(0);
		}
	}
	
	public void update(){
		current.update();
		timerback--;
		if(current == estados.get(0)||current == estados.get(1)) {
			if(timer>=0) {
				timer--;
			}
		}
		if(timer==0) {
			current = estados.get(3);
			results1 = estados.get(0).getCount();
			results2 = estados.get(1).getCount();
		}
		if(timer==0) {
			timer=-1;
		}
	}
	
	public void paint(Graphics g){
		if(timerback%2==0) {
			g.drawImage(ImageLoader.getInstance().getImage("back2"), 0, 0, null);
		}
		else{
			g.drawImage(ImageLoader.getInstance().getImage("back1"), 0, 0, null);
		}
		
		current.paint(g);
		if(current == estados.get(0)||current == estados.get(1)) {
			g.setFont(new Font("Helvetica", Font.PLAIN, 30));
			g.drawString("Time left: "+timer/10, 40, 40);
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(current == estados.get(2)) {
			current.mouseClicked(e);
		}
		else if(current == estados.get(0)) {
			current.mouseClicked(e);
		}
		else if(current == estados.get(1)) {
			current.mouseClicked(e);
		}
		else if(current == estados.get(3)) {

		}
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}