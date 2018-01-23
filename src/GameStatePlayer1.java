/*
 * GameStateRunning.java
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
public class GameStatePlayer1 implements GameState {
	
	GameStateContext gc;
	EntityManager entity;
	private int count;
	boolean play;
	
	public GameStatePlayer1(GameStateContext gc){
		this.gc = gc;
		entity=new EntityManager();
		count=0;
		play = false;
	}
	public int getCount() {
		return count;
	}
	
	public GameStateContext getGc() {
		return gc;
	}


	public void setGc(GameStateContext gc) {
		this.gc = gc;
	}


	public GameStatePlayer1() {
		// TODO Auto-generated constructor stub
		entity=new EntityManager();
	}

	public void end(){
		gc.setCurrent(gc.getGameOver());
	}
	
	public void menu(){
		gc.setCurrent(gc.getMenu());
	}
	
	public void paint(Graphics g){
		entity.paint(g);
		g.setColor(Color.black);
		g.setFont(new Font("Helvetica", Font.PLAIN, 30));
		g.drawString("Player's 1 Turn",300,40);
		g.drawString("Points: "+count, 330,180);
		
	}
	
	public void update(){
		entity.update();
	}


	/*No Colsiona bien
	@Override
	public void mouseClicked(MouseEvent e) {
		entity.getNote();
		String aux = entity.nombreNota();
		switch(aux) {
			case "do4":
				Card extraDo = entity.getCard(0);
				System.out.println(extraDo.name);
				if(extraDo.collision(e.getX(),e.getY())) {
					count++;	
				}
				else {
					gc.changePlay();
				}
				break;
			case "re4":
				Card extraRe = entity.getCard(1);
				System.out.println(extraRe.name);
				if(extraRe.collision(e.getX(),e.getY())) {
					count++;	
				}
				else {
					gc.changePlay();
				}
				break;
			case "mi4":
				Card extraMi = entity.getCard(2);
				System.out.println(extraMi.name);
				if(extraMi.collision(e.getX(),e.getY())) {
					count++;	
				}
				else {
					gc.changePlay();
				}
				break;
			case "fa4":
				Card extraFa = entity.getCard(3);
				System.out.println(extraFa.name);
				if(extraFa.collision(e.getX(),e.getY())) {
					count++;	
				}
				else {
					gc.changePlay();
				}
				break;
			case "sol4":
				Card extraSol = entity.getCard(4);
				System.out.println(extraSol.name);
				if(extraSol.collision(e.getX(),e.getY())) {
					count++;	
				}
				else {
					gc.changePlay();
				}
				break;
			case "la4":
				Card extraLa = entity.getCard(5);
				System.out.println(extraLa.name);
				if(extraLa.collision(e.getX(),e.getY())) {
					count++;	
				}
				else {
					gc.changePlay();
				}
				break;
			case "si4":
				Card extraSi = entity.getCard(6);
				System.out.println(extraSi.name);
				if(extraSi.collision(e.getX(),e.getY())) {
					count++;	
				}
				else {
					gc.changePlay();
				}
				break;
			case "do5":
				Card extraDo2 = entity.getCard(0);
				System.out.println(extraDo2.name);
				if(extraDo2.collision(e.getX(),e.getY())) {
					count++;	
				}
				else {
					gc.changePlay();
				}
				break;
			default:
				break;
		}
		entity.newNote();
	}*/
	@Override
	public void mouseClicked(MouseEvent e) {
		entity.getNote();
		String aux = entity.nombreNota();
		switch(aux) {
			case "do4":
				if(e.getX()>=50&&e.getX()<=154&&e.getY()>=500&&e.getY()<=604) {
					count++;	
				}
				else {
					gc.changePlay();
				}
				break;
			case "re4":
				if(e.getX()>=160&&e.getX()<=264&&e.getY()>=500&&e.getY()<=604) {
					count++;	
				}
				else {
					gc.changePlay();
				}
				break;
			case "mi4":
				if(e.getX()>=270&&e.getX()<=374&&e.getY()>=500&&e.getY()<=604) {
					count++;	
				}
				else {
					gc.changePlay();
				}
				break;
			case "fa4":
				if(e.getX()>=380&&e.getX()<=484&&e.getY()>=500&&e.getY()<=604) {
					count++;	
				}
				else {
					gc.changePlay();
				}
				break;
			case "sol4":
				if(e.getX()>=100&&e.getX()<=204&&e.getY()>=620&&e.getY()<=724) {
					count++;	
				}
				else {
					gc.changePlay();
				}
				break;
			case "la4":
				if(e.getX()>=210&&e.getX()<=314&&e.getY()>=620&&e.getY()<=724) {
					count++;	
				}
				else {
					gc.changePlay();
				}
				break;
			case "si4":
				if(e.getX()>=320&&e.getX()<=424&&e.getY()>=620&&e.getY()<=724) {
					count++;	
				}
				else {
					gc.changePlay();
				}
				break;
			case "do5":
				if(e.getX()>=50&&e.getX()<=154&&e.getY()>=500&&e.getY()<=604) {
					count++;	
				}
				else {
					gc.changePlay();
				}
				break;
			default:
				break;
		}
		entity.newNote();
	}


	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}

}