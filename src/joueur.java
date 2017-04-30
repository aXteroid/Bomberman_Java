/*import java.math.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener; */

import java.util.Scanner;
public class joueur {
	public static void main(String[] args){
		initialisation_map();
		personnage P1 = new personnage("joueur_1", 3,0,0,0,0,0);
		System.out.println(mouvement());
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
		perso.lifepoint = personnage.lifepoint - 1;
	}
	

    public static void mouvement(){
    	if(StdDraw.isKeyPressed('z')){
    		personnage.y_position += 0.1;
    	}
    	else if(StdDraw.isKeyPressed('q')){
    		personnage.x_position -= 0.1;
    	}
    	else if(StdDraw.isKeyPressed('d')){
    		personnage.x_position += 0.1;
    	}
    	else if(StdDraw.isKeyPressed('s')){
    		personnage.y_position -= 0.1;
    	}

 }
	/*
	public static void item_drop(){
		double d = Math.random();
		int n = (int)d;
		n = (int)(Math.random() * 8);
		if (n == 0){
			bonus = blue_flame;
		}
		if (n == 1){
			bonus = yellow_flame;
		}
		if (n == 2){
			bonus = red_flame;
		}
		if (n == 3){
			bonus = red_bomb;
		}
		if (n == 4){
			bonus = life;
		}
		if (n == 5){
			bonus = speed_up;
		}
		if (n == 6){
			bonus = speed_down;
		}
		if (n == 7){
			bonus = bomb_plus;
		}
		if (n == 8){
			bonus = bomb_minus;
		}
	}
	public static void explosion(int area, b){
		
	}
}
*/
}


