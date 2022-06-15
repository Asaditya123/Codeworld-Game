
public class Map {
	
	 String Des;
	 int x;
	 int y;
	 int currentx;
	 int currenty;
	
	Map(String Des, int x, int y, int currentx, int currenty){
		this.Des = Des;
		this.x = x;
		this.y = y;
		this.currentx = currentx;
		this.currenty = currenty;
		
	
}

	public String getDes() {
		return Des;
	}

	public void setDes(String des) {
		Des = des;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getCurrentx() {
		return currentx;
	}

	public void setCurrentx(int currentx) {
		this.currentx = currentx;
	}

	public int getCurrenty() {
		return currenty;
	}

	public void setCurrenty(int currenty) {
		this.currenty = currenty;
	}
}