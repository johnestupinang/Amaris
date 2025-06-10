package entidades;

public class Circulo extends Figura{
	
	public double radio;
	
	public Circulo(double radio) {
		this.radio = radio;
	}
	
	public double calcularArea() {
		return Math.PI * Math.pow(this.radio, 2);
	}

}
