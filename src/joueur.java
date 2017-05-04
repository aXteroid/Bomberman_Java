/*import java.math.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener; */
import java.awt.KeyEventDispatcher;
import java.awt.event.KeyEvent;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class joueur {
	public static void main(String[] args){
		initialisation_map();
		personnage P1 = new personnage("joueur_1", 3,8,8,0,0,0);
		picture(10.5, 10.5, "bomberman_256.png");
		try {
			deplacement();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void initialisation_map(){
		StdDraw.setXscale(0,21);
		StdDraw.setYscale(0,17);
		for (int x=0;x<21;x++){
			for(int y=0;y<17;y++){
				if (x%2 == 1 || y%2 == 1){ //On créé le contour
					StdDraw.setPenColor(StdDraw.ORANGE);
					String type_objet = "breakable"; //Type = 1 => Mur Indestructible
				}
				
				else{
					StdDraw.setPenColor(StdDraw.GRAY);
					String type_objet = "unbreakable";
				}
				if (x==0 || y==0 || x == 20 || y == 16){
					StdDraw.setPenColor(StdDraw.GRAY);
					String type_objet = "unbreakable";
				}	 
					
				StdDraw.filledSquare(x+0.5,y+0.5,0.5);
				
		}
			
	}
		breakblock(19,15); // On créé des chemins autour de joueurs (haut droite)
		breakblock(18,15);
		breakblock(17,15);
		breakblock(19,14);
		breakblock(19,13);
		breakblock(18,13);
		breakblock(17,14);
		//bas gauche
		breakblock(1,1); // On créé des chemins autour de joueurs (bas gauche)
		breakblock(2,1);
		breakblock(3,1);
		breakblock(1,2);
		breakblock(1,3);
		breakblock(3,2);
		breakblock(2,3);
		
		
}
	public static void breakblock (int x,int y){
			StdDraw.setPenColor(StdDraw.GREEN);
			StdDraw.filledSquare(x+0.5,y+0.5,0.5);
			String type_objet = "path";
			
		}
	public static void perte_vie(personnage perso){
		perso.setLifepoint(perso.getLifepoint()-1);
	}
    public static String direction_mouvement(){
    	String dir = "up";
	    	if (personnage.getX_position() > 2 && personnage.getX_position() < 20.5 && personnage.getY_position() > 2 && personnage.getY_position() < 16){
		    	while (StdDraw.isKeyPressed(KeyEvent.VK_UP)){
		    		dir = "up";
		    	}
		    	while (StdDraw.isKeyPressed(KeyEvent.VK_LEFT)){
		    		dir = "left";
		    	}
		    	while (StdDraw.isKeyPressed(KeyEvent.VK_RIGHT)){
		    		dir = "right";
		    	}
		    	while (StdDraw.isKeyPressed(KeyEvent.VK_DOWN)){
		    		dir = "down";
		    	}
		    	return dir;
	    	}
	    	else{
	    		return dir;
	    	}
 }
	public static bonus item_drop(){
		double d = Math.random();
		bonus x = new bonus(0,0,0,0,0);
		int n = (int)d;
		n = (int)(Math.random() * 8);
		if (n == 0){
			x = new bonus(-1,0,0,0,0); //blue flame
			return x;
		}
		else if (n == 1){
			x = new bonus(1,0,0,0,0); //yellow flame
			return x;
		}
		else if (n == 2){
			x = new bonus(10,0,0,0,0); //red flame
			return x;
		}
		else if (n == 3){
			x = new bonus(0,1,0,0,0); //red bomb
			return x;
		}
		else if (n == 4){
			x = new bonus(0,0,0,1,0); // health point
			return x;
		}
		else if (n == 5){
			x = new bonus(0,0,1,0,0); //speed_up
			return x;
		}
		else if (n == 6){
			x = new bonus(0,0,-1,0,0); //speed_up
			return x;
		}
		else if (n == 7){
			x = new bonus(0,0,-2,0,0); //-2 bombs available
			return x;
		}
		else if (n == 8){
			x = new bonus(0,0,2,0,0); //+2 bombs available
			return x;
		}
		return x;	
	}
	public static void picture(double x,double y,java.lang.String s){
		StdDraw.picture(x, y, s);
}
	public static void deplacement () throws InterruptedException {
		while (direction_mouvement() == "up"){
			personnage.setX_position(personnage.getX_position()); //change position x du perso en fonction du déplacement
			personnage.setY_position((float) (personnage.getY_position()+0.1));//change position y du perso en fonction du déplacement
			StdDraw.picture(personnage.getX_position()-0.5, personnage.getY_position()-0.5, "bomberman_256.png"); //dessine le perso à la position suivante 
			StdDraw.setPenColor(StdDraw.ORANGE); 
			StdDraw.filledRectangle(personnage.getX_position()-0.5,personnage.getY_position()-1,0.53,0.07); //on réécrit un rectangle orange à la place que le perso vient de laisser vide
			Thread.sleep(30);
		}
		while (direction_mouvement() == "down"){
			personnage.setX_position(personnage.getX_position());
			personnage.setY_position((float) (personnage.getY_position()-0.1));
			StdDraw.picture(personnage.getX_position()-0.5, personnage.getY_position()-0.4, "bomberman_256.png");
			StdDraw.setPenColor(StdDraw.ORANGE);
			StdDraw.filledRectangle(personnage.getX_position()-0.5,personnage.getY_position()+0.1,0.53,0.07);
			Thread.sleep(30);
		}
		while (direction_mouvement() == "right"){
			personnage.setX_position((float) (personnage.getX_position()+0.1));
			personnage.setY_position(personnage.getY_position());
			StdDraw.picture(personnage.getX_position()-1, personnage.getY_position()-0.5, "bomberman_256.png");
			StdDraw.setPenColor(StdDraw.ORANGE);
			StdDraw.filledRectangle(personnage.getX_position()-1.5,personnage.getY_position()-0.5,0.07,0.5);
			Thread.sleep(30);
		}
		while (direction_mouvement() == "left"){
			personnage.setX_position((float) (personnage.getX_position()-0.1));
			personnage.setY_position(personnage.getY_position());
			StdDraw.picture(personnage.getX_position()-0.5, personnage.getY_position()-0.5, "bomberman_256.png");
			StdDraw.setPenColor(StdDraw.ORANGE);
			StdDraw.filledRectangle(personnage.getX_position()+0.1,personnage.getY_position()-0.5,0.07,0.5);
			Thread.sleep(30);
		}
	}
}




