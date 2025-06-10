package main;

import entidades.Circulo;
import entidades.Figura;
import entidades.Triangulo;

public class CalculoAreas {

	public static void main(String[] args) {
		
		Figura triangulo = new Triangulo(10, 6);
		System.out.println("�rea del triangulo: "+ triangulo.calcularArea());
		
		Figura circulo = new Circulo(5.0);
		System.out.println("�rea del criculo: "+ circulo.calcularArea());

	}

}
