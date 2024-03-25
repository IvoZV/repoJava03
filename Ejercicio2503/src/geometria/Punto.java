package geometria;


public class Punto {
	private double x;
	private double y;
	
	public Punto(double x,double y) {
		this.x = x;
		this.y = y;
	}
	

	
	
	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}
	
	public boolean siEstaSobreX() {
		return x==0;
	}
	
	public boolean siEstaSobreY () {
		return y==0;
	}
	
	public boolean esElOrigen () {
		
		return siEstaSobreX() && siEstaSobreY ();
	}
	
	public double distanciaAlOrigen() {
		return Math.hypot(x, y);
	}

	public void mover(double nx,double ny) {
		this.x += nx;
		this.y +=ny;
	}



	//1declaracion Punto a
	//Construccion New Punto
	//inicializacion ()3,4
	//Asignacion =
	public static void main(String[] args) {
		Punto a = new Punto(3,4);
		System.out.println(a.distanciaAlOrigen());
		System.out.println(a.siEstaSobreX());
		System.out.println(a.siEstaSobreY());
		System.out.println(a.esElOrigen());
	}
}
