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

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + ", centro=" + centro + "]";
	}
	public void mover(double enX , double enY) {
		centro.mover(enX, enY);
	}
	
	public static void main(String[] args) {
		Circulo c1 = new Circulo(4, 2,2);
		System.out.println(c1);
		c1.mover(-4,-4);
		System.out.println(c1);
	}

}
