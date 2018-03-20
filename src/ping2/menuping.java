package ping2;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import ping2.gameping.STATE;


public class menuping extends MouseAdapter{
	
	
	private gameping game;
	private handlerping handler;
	private Random r=new Random();
	//private HUD hud;
	
	public menuping(gameping game) {
		this.game=game;
		//this.hud=hud;
		//this.handler=handler;
	}
	
	public void mousePressed(MouseEvent e) {
		int mx=e.getX();
		int my=e.getY();
		
		if(gameping.gamestate==STATE.Menu) {
		
		//play button
		//if(mouseOver(mx, my, 210, 150, 200, 64)) {
			//game.gameState=STATE.Game;
			//handler.addObject(new Player(Game.WIDTH/2-32, Game.HEIGHT/2-32, ID.Player, handler));
			//handler.clearEnemys();
			//handler.addObject(new basicEnemy(r.nextInt(Game.WIDTH),r.nextInt(Game.HEIGHT), ID.basicEnemy, handler));
			//game.gamestate=STATE.Select;
			//AudioPlayer.getSound("menu_sound").play();
			//return;
		//}
		
		//quit button
		if(mouseOver(mx, my, 210, 350, 200, 64)) {
			System.exit(1);
		}
		
		
		//help button
		if(mouseOver(mx, my, 210, 250, 200, 64)) {
			game.gamestate=STATE.Help;
			//AudioPlayer.getSound("menu_sound").play();
		}
		}
		
		
		
		/*
		if(game.gamestate==STATE.Select) {
			
			//normal button
			if(mouseOver(mx, my, 210, 150, 200, 64)) {
				game.gameState=STATE.Game;
				handler.addObject(new Player(Game.WIDTH/2-32, Game.HEIGHT/2-32, ID.Player, handler));
				handler.clearEnemys();
				handler.addObject(new basicEnemy(r.nextInt(Game.WIDTH),r.nextInt(Game.HEIGHT), ID.basicEnemy, handler));
				game.diff=0;
				//AudioPlayer.getSound("menu_sound").play();
				
			}
			
			
			//hard button
			if(mouseOver(mx, my, 210, 250, 200, 64)) {
				game.gameState=STATE.Game;
				handler.addObject(new Player(Game.WIDTH/2-32, Game.HEIGHT/2-32, ID.Player, handler));
				handler.clearEnemys();
				handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH),r.nextInt(Game.HEIGHT), ID.basicEnemy, handler));
				game.diff=1;
				//AudioPlayer.getSound("menu_sound").play();
			}*/
			
			//back button
			if(mouseOver(mx, my, 210, 350, 200, 64)) {
				game.gamestate=STATE.Menu;
				//AudioPlayer.getSound("menu_sound").play();
				return;
			}
			
			
			//}
		
		
		
		
		
		
		
		
		
		//back button for help
		if(gameping.gamestate==STATE.Help) {
			if(mouseOver(mx, my, 210, 350, 200, 64)) {
				game.gamestate=STATE.Menu;
				//AudioPlayer.getSound("menu_sound").play();
				return;
			}
		}
		
		if(gameping.gamestate==STATE.End) {
				if(mouseOver(mx, my, 210, 350, 200, 64)) {
						game.gamestate=STATE.Menu;
						//hud.setLevel(1);
						//hud.setscore(0);
						//handler.addObject(new Player(Game.WIDTH/2-32, Game.HEIGHT/2-32, ID.Player, handler));
						//handler.clearEnemys();
						//handler.addObject(new basicEnemy(r.nextInt(Game.WIDTH),r.nextInt(Game.HEIGHT), ID.basicEnemy, handler));
						//AudioPlayer.getSound("menu_sound").play();
					}
			}
		
	}
	
	
	public void mouseReleased(MouseEvent e) {
		
	}
	
	private boolean mouseOver(int mx, int my, int x, int y, int width, int height) {
		if(mx>x && mx<x+width) {
			if(my>y && my<y+height) {
			return true;
			}else return false;
		}else return false;
	}
	
	public void tick() {
		
	}

	public void render(Graphics g) {
		
		if(gameping.gamestate==STATE.Menu) {
		
		Font fnt=new Font("arial",1, 50);
		Font fnt2=new Font("arial", 1,30);
		
		g.setFont(fnt);
		g.setColor(Color.white);
		g.drawString("WAVE", 240, 90);
		
		g.setFont(fnt);
		g.setColor(Color.white);
		g.drawString("Play", 255, 200);
		
		g.setFont(fnt);
		g.setColor(Color.white);
		g.drawString("Help", 255, 300);
		
		g.setFont(fnt);
		g.setColor(Color.white);
		g.drawString("Quit", 255, 400);
		
		
		g.setColor(Color.white);
		g.drawRect(210, 150,200, 64);
	
		g.setColor(Color.white);
		g.drawRect(210, 250,200, 64);
		
		g.setColor(Color.white);
		g.drawRect(210, 350,200, 64);
		
		}else if(gameping.gamestate==STATE.Help) {
			
			Font fnt=new Font("arial",1, 50);
			Font fnt2=new Font("arial", 1,30);
			Font fnt3=new Font("arial", 1,20);
			
			g.setFont(fnt);
			g.setColor(Color.white);
			g.drawString("HElp", 240, 70);
			
			g.setFont(fnt3);
			g.drawString("use up, down, right and left keys to move and dodge enemies", 20,100);
			
			g.setFont(fnt2);
			g.drawRect(210, 350, 200, 64);
			g.drawString("Back", 270, 390);
			
			
		}else if(gameping.gamestate==STATE.End) {
			
			Font fnt=new Font("arial",1, 50);
			Font fnt2=new Font("arial", 1,30);
			Font fnt3=new Font("arial", 1,20);
			
			g.setFont(fnt);
			g.setColor(Color.white);
			g.drawString("game over!", 240, 70);
			
			g.setFont(fnt3);
			//g.drawString("your score: " + hud.getScore(), 20,100);
			
			g.setFont(fnt2);
			g.drawRect(210, 350, 200, 64);
			g.drawString("Try again", 270, 390);
			
			
		}	/*else if(gameping.gamestate==STATE.Select) {
			
			Font fnt=new Font("arial",1, 50);
			Font fnt2=new Font("arial", 1,30);
			
			g.setFont(fnt);
			g.setColor(Color.white);
			g.drawString("select difficulty", 240, 90);
			
			g.setFont(fnt2);
			
			g.drawRect(210, 150,200, 64);
			g.drawString("normal", 255, 200);
			
			
			g.drawString("hard", 255, 300);
			g.drawRect(210, 250,200, 64);
			
			
			g.drawString("back", 255, 400);
			g.drawRect(210, 350,200, 64);
		}*/
	
	}

}
