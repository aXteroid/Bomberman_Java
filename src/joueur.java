
public class joueur {
	public static void main(String[] args){
		initialisation_fenetre();
	}
	public static void initialisation_fenetre(){
		StdDraw.setXscale(0,21);
		StdDraw.setYscale(0,17);
		for (int x=0;x<21;x++){
			for(int y=0;y<17;y++){
				if (x==0 || y==0 || x==20 || y==16){ //On créé le contour
					StdDraw.setPenColor(StdDraw.BLACK);
					int type_objet = 1; //Type = 1 => Mur Indestructible
				}
				else if (x==1 || y==1 || x==19 || y==15){//On créé le chemin de ronde
					StdDraw.setPenColor(StdDraw.YELLOW);
					int type_objet = 2; // Type = 2 => Chemin
				}
				else if(x<20 && y<16){ //On rentre dans le carré de jeu
					if (x%2 == 0 || y%2==0){
						StdDraw.setPenColor(StdDraw.BLACK);
						int type_objet = 1; 
					}
				}
				StdDraw.filledSquare(x+0.5,y+0.5,0.5);
				/*while (x>2 && y>2 && x<20 && y<10){
					if (x%2==1 && y%2 == 1){
						StdDraw.setPenColor(StdDraw.BLACK);
						int type_objet = 1;
					}*/

	
				
				
				
				
			}
		}
	}

}
