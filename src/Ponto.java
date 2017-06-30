import java.util.LinkedList;

public class Ponto {
	private double x;
	private double y;
	private double z;
		
	public Ponto(double x, double y, double z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public Ponto(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}

	@Override
	public String toString() {
		return "Ponto [x=" + x + ", y=" + y + ", z=" + z + "]";
	}
	
	public void prdouble(){
		System.out.println(x+" "+y+" "+z);
	}
	
	public void printPixel(){		//Tenho que testar ¬¬'
		LinkedList <Double> nio = new LinkedList<Double>();
		nio.add(5.0);
		nio.add(6.0);
		nio.add(7.0);
		System.out.println(nio);
	}
	
	
}
