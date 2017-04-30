
public class personnage {
	public String name;
	static int lifepoint;
	
	public personnage (String nom, int lifepoint1){
		this.name = nom;
		this.lifepoint = lifepoint1;
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

	
	
}
