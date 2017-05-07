
public class mur {
	boolean isbreakable;
	boolean isbroken;
	float x_position;
	float y_position;
	public mur (boolean isbreakable1,boolean isbroken1,float x_position1,float y_position1){
		this.isbreakable = isbreakable1;
		this.isbroken = isbroken1;
		this.x_position = x_position1;
		this.y_position = y_position1;
	}
	public boolean isIsbreakable() {
		return isbreakable;
	}
	public void setIsbreakable(boolean isbreakable) {
		this.isbreakable = isbreakable;
	}
	public boolean isIsbroken() {
		return isbroken;
	}
	public void setIsbroken(boolean isbroken) {
		this.isbroken = isbroken;
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
}
