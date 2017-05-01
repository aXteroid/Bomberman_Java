
public class bonus {
	int exploding_area;
	int destructivity;
	float speed;
	int lifepoint;
	int capacity;
	
	public bonus (int a, int b, int c, int d, int e){
		this.exploding_area = a;
		this.destructivity = b;
		this.speed = c;
		this.lifepoint = d;
		this.capacity = e;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getExploding_area() {
		return exploding_area;
	}

	public void setExploding_area(int exploding_area) {
		this.exploding_area = exploding_area;
	}

	public int getDestructivity() {
		return destructivity;
	}

	public void setDestructivity(int destructivity) {
		this.destructivity = destructivity;
	}

	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}

	public int getLifepoint() {
		return lifepoint;
	}

	public void setLifepoint(int lifepoint) {
		this.lifepoint = lifepoint;
	}
}
