
public class bonus {
	int exploding_area;
	int destructivity;
	float speed;
	int lifepoint;
	
	public bonus (int a, int b, int c, int d){
		this.exploding_area = a;
		this.destructivity = b;
		this.speed = c;
		this.lifepoint = d;
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
