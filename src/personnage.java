
public class personnage {
	public String name;
	private int lifepoint;
	private float x_position;
	private float y_position;
	private int capacity; //nb bombe posable en meme temps
	private float speed;
	private int inprogress_bombs;
	
	public personnage (int lifepoint1, float position_x, float position_y, int capacite, float vitesse, int bombe_en_cours){
		this.lifepoint = lifepoint1;
		this.x_position = position_x;
		this.y_position = position_y;
		this.capacity = capacite;
		this.speed = vitesse;
		this.inprogress_bombs = bombe_en_cours;
	}

	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLifepoint() {
		return lifepoint;
	}

	public void setLifepoint(int lifepoint) {
		this.lifepoint = lifepoint;
	}

	public float getX_position() {
		return x_position;
	}

	public void setX_position(float x_position) {
		this.x_position = x_position;
	}

	public float getY_position() {
		return y_position;
	}

	public void setY_position(float y_position) {
		this.y_position = y_position;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	
	
}
