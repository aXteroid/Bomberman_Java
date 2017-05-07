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
	private float walls[][] = new float[357][4];
	public static void main(String[] args){
		//DebutPartie();
		initialisation_map();
		personnage personnage = new personnage(3,8,8,0,0,0);
		
		picture(10.5, 10.5, "bomberman_256.png");
		while (true){
			deplacement(personnage);
			direction_mouvement(personnage);
		}
		
	}
	public void addwall (int type, int x_position, int y_position){
		for (int i=0;i<357;i++){
				int wall_id = i;
				if (walls[wall_id][1] != x_position && walls[wall_id][2] != y_position){
					walls[wall_id][0]=0; //breakable wall
					walls[wall_id][1]= x_position;
					walls[wall_id][2]= y_position;
				}
			}
		}
	
	public static void initialisation_map(){
		StdDraw.setXscale(0,21);
		StdDraw.setYscale(0,17);
		for (int x=0;x<21;x++){
			for(int y=0;y<17;y++){
				if (x%2 == 1 || y%2 == 1){ //On cr�� le contour
					StdDraw.setPenColor(StdDraw.ORANGE);
					String type_objet = "breakable"; //Type = 1 => Mur destructible
					
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
		breakblock(19,15); // On cr�� des chemins autour de joueurs (haut droite)
		breakblock(18,15);
		breakblock(17,15);
		breakblock(19,14);
		breakblock(19,13);
		breakblock(18,13);
		breakblock(17,14);
		//bas gauche
		breakblock(1,1); // On cr�� des chemins autour de joueurs (bas gauche)
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
	public void perte_vie(personnage perso){
		perso.setLifepoint(perso.getLifepoint()-1);
	}
    public static String direction_mouvement(personnage personnage){
    	while (true){
	    	if (personnage.getX_position() > 2 && personnage.getX_position() < 20.5 && personnage.getY_position() > 2 && personnage.getY_position() < 16){
	    		String dir = null;
		    	if (StdDraw.isKeyPressed(KeyEvent.VK_UP)){
		    		dir = "up";
		    	}
		    	if (StdDraw.isKeyPressed(KeyEvent.VK_LEFT)){
		    		dir = "left";
		    	}
		    	if (StdDraw.isKeyPressed(KeyEvent.VK_RIGHT)){
		    		dir = "right";
		    	}
		    	if (StdDraw.isKeyPressed(KeyEvent.VK_DOWN)){
		    		dir = "down";
		    	}
		    	return dir;
	    	}
	    	else{
	    		return "none";
	    	}
    	}
 }
	public bonus item_drop(){
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
	public static void deplacement (personnage personnage){
		if (direction_mouvement() == "up"){
			personnage.setX_position(personnage.getX_position()); //change position x du perso en fonction du d�placement
			personnage.setY_position((float) (personnage.getY_position()+0.1));//change position y du perso en fonction du d�placement
			StdDraw.picture(personnage.getX_position()-0.5, personnage.getY_position()-0.5, "bomberman_256.png"); //dessine le perso � la position suivante 
			StdDraw.setPenColor(StdDraw.ORANGE); 
			StdDraw.filledRectangle(personnage.getX_position()-0.5,personnage.getY_position()-1,0.53,0.07); //on r��crit un rectangle orange � la place que le perso vient de laisser vide
			StdDraw.pause(20);
		}
		if (direction_mouvement() == "down"){
			personnage.setX_position(personnage.getX_position());
			personnage.setY_position((float) (personnage.getY_position()-0.1));
			StdDraw.picture(personnage.getX_position()-0.5, personnage.getY_position()-0.5, "bomberman_256.png");
			StdDraw.setPenColor(StdDraw.ORANGE);
			StdDraw.filledRectangle(personnage.getX_position()-0.5,personnage.getY_position()+0.1,0.53,0.07);
			StdDraw.pause(20);
		}
		if (direction_mouvement() == "right"){
			personnage.setX_position((float) (personnage.getX_position()+0.1));
			personnage.setY_position(personnage.getY_position());
			StdDraw.picture(personnage.getX_position()-0.5, personnage.getY_position()-0.5, "bomberman_256.png");
			StdDraw.setPenColor(StdDraw.ORANGE);
			StdDraw.filledRectangle(personnage.getX_position()-1,personnage.getY_position()-0.5,0.07,0.5);
			StdDraw.pause(20);
		}
		if (direction_mouvement() == "left"){
			personnage.setX_position((float) (personnage.getX_position()-0.1));
			personnage.setY_position(personnage.getY_position());
			StdDraw.picture(personnage.getX_position()-0.5, personnage.getY_position()-0.5, "bomberman_256.png");
			StdDraw.setPenColor(StdDraw.ORANGE);
			StdDraw.filledRectangle(personnage.getX_position()+0.1,personnage.getY_position()-0.5,0.07,0.5);
			StdDraw.pause(20);
		}
	}
	/*public static void DebutPartie (){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Entrer le nom de votre personnage 1");
		String Nom1 = scan.nextLine();
		personnage P1= new personnage(3, 0, 0, 0, 0, 0);
		P1.setName(""+Nom1+"");
		System.out.println("Entrer le nom de votre personnage 2");
		String Nom2 = scan.nextLine();
		personnage P2= new personnage(5, 0, 0, 0, 0, 0);
		P2.setName(""+Nom2+"");
		scan.close();
		
		System.out.println(""+P1.getName()+", tu as "+P1.getLifepoint()+" points de vie !");
		System.out.println(""+P2.getName()+", tu as "+P2.getLifepoint()+" points de vie !");

	}*/
}




