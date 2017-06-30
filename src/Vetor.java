
public class Vetor {
//	private double xi;
//	private double yi;
//	private double zi;
	private double x;
	private double y;
	private double z;
	
//	public Vetor(double xi, double yi, double zi, double x, double y, double z){
////		this.xi = xi;
////		this.yi = yi;
////		this.zi = zi;
//		this.x = x;
//		this.y = y;
//		this.z = z;
//	}
	
	public Vetor(double x, double y, double z){
//		this.xi = 0;
//		this.yi = 0;
//		this.zi = 0;
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public Vetor(double x, double y){
		this.x = x;
		this.y = y;
	}

//	public double getXi() {
//		return xi;
//	}
//
//	public void setXi(double xi) {
//		this.xi = xi;
//	}
//
//	public double getYi() {
//		return yi;
//	}
//
//	public void setYi(double yi) {
//		this.yi = yi;
//	}
//
//	public double getZi() {
//		return zi;
//	}
//
//	public void setZi(double zi) {
//		this.zi = zi;
//	}

	public double getx() {
		return x;
	}

	public void setx(double x) {
		this.x = x;
	}

	public double gety() {
		return y;
	}

	public void sety(double y) {
		this.y = y;
	}

	public double getz() {
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
