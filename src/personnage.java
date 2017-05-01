
public class personnage {
	public String name;
	private static int lifepoint;
	private static float x_position;
	private static float y_position;
	private static int capacity; //nb bombe posable en meme temps
	private static float speed;
	static int inprogress_bombs;
	
	public personnage (String nom, int lifepoint1, float position_x, float position_y, int capacite, float vitesse, int bombe_en_cours){
		this.name = nom;
		this.lifepoint = lifepoint1;
		this.x_position = position_x;
		this.y_position = position_y;
		this.capacity = capacite;
		this.speed = vitesse;
		this.inprogress_bombs = bombe_en_cours;
	}

	public static float getSpeed() {
		return speed;
	}

	public static void setSpeed(float speed) {
		personnage.speed = speed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static int getLifepoint() {
		return lifepoint;
	}

	public static void setLifepoint(int lifepoint) {
		personnage.lifepoint = lifepoint;
	}

	public static float getX_position() {
		return x_position;
	}

	public static void setX_position(float x_position) {
		personnage.x_position = x_position;
	}

	public static float getY_position() {
		return y_position;
	}

	public static void setY_position(float y_position) {
		personnage.y_position = y_position;
	}

	public static int getCapacity() {
		return capacity;
	}

	public static void setCapacity(int capacity) {
		personnage.capacity = capacity;
	}

	
	
}
