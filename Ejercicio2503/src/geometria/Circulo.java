package geometria;

public class Circulo {
	private double radio;
	private Punto centro;
	
	public Circulo(double radio,double xc,double yc) {
		if (radio <=0) {
			throw new Error("radio invalido");
		}
		this.radio = radio;
		this.centro = new Punto(xc, yc);
	}
	

}
