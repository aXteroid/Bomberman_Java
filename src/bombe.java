
public class bombe {
	int exploding_time;
	int exploding_area;
	
	public bombe (int temp_explo, int zone_explo){
		this.exploding_time = temp_explo;
		this.exploding_area = zone_explo;
	}

	public int getExploding_time() {
		return exploding_time;
	}

	public void setExploding_time(int exploding_time) {
		this.exploding_time = exploding_time;
	}

	public int getExploding_area() {
		return exploding_area;
	}

	public void setExploding_area(int exploding_area) {
		this.exploding_area = exploding_area;
	}
}
