
public class Vetor {
	private double x;
	private double y;
	private double z;
	
	public Vetor(double x, double y, double z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public Vetor(double x, double y){
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setx(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void sety(double y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setz(double z) {
		this.z = z;
	}

	@Override
	public String toString() {
		return "Vetor [x=" + x + ", y=" + y + ", z=" + z + "]";
	}
	
	
}
