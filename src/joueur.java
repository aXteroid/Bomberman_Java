
public class joueur {
	public static void main(String[] args){
		initialisation_fenetre();
	}
	public static void initialisation_fenetre(){
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
					String type_objet = "border";
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
	}



