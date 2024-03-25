package prom;

public class Nota 
{
	private int valorNota;

	
	public Nota(int valor){
		if (valor <1 || valor>10) {
			//throw new Error("valor incorrecto");
		}
		else
		valorNota = valor;
	}
	
	private void setValorNota(int valor){
		if (!esValida(valor)){
			throw new Error("valor incorrecto");
		}
			valorNota = valor;
		
	}
	
	private boolean esValida(int valor) {
		return (valor>1&&valor<=10);
	}
	
//	public boolean estaAprobado() {
//		if (valorNota>=4)
//		return true;
//		else
//			return false;
//	}
	public boolean estaAprobado() {
		return valorNota>=4;
	}
	
	
//	public boolean estaDesaprobado(){
//		if (valorNota<4)
//			return true;
//			else
//				return false;
//	}
	public boolean estaDesaprobado(){
		return !estaAprobado();
	}
	
	public void recupero(int nuevoValor) {
		if (nuevoValor > valorNota) {
			valorNota = nuevoValor;
		}
	}
	
	
	public int obtenerValor(){
		return valorNota;
		
	}
	
	public static void main(String[] args) {
		Nota mynota = new  Nota(-2);
		System.out.println(mynota.estaAprobado());
		System.out.println(mynota.estaDesaprobado());
		System.out.println(mynota.obtenerValor());
		mynota.recupero(9);
		System.out.println(mynota.obtenerValor());
	}
}