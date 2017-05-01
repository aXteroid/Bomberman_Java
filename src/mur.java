
public class mur {
	boolean isbreakable;
	boolean ispath;
	float x_position;
	float y_position;
	public mur (boolean isbreakable1,boolean ispath1,float x_position1,float y_position1){
		this.isbreakable = isbreakable1;
		this.ispath = ispath1;
		this.x_position = x_position1;
		this.y_position = y_position1;
	}
	public boolean isIsbreakable() {
		return isbreakable;
	}
	public void setIsbreakable(boolean isbreakable) {
		this.isbreakable = isbreakable;
	}
	public boolean isIspath() {
		return ispath;
	}
	public void setIspath(boolean ispath) {
		this.ispath = ispath;
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
