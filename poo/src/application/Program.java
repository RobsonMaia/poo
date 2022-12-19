package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		/*PROGRAMA CRIADA PRA DA EX DE CLASSES.
		 * Programa com duas classes pra ler os lados de dois triangulos
		 * dessa forma não é preciso criar um monte de variaveis*/
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*Aqui a variavel criada na segunda classe
		 * classe essa criada especificamente pra ler triangulos
		 * nesse caso dois X e Y
		 * depois de declarar da forma abaixo as variaveis
		 * basta precionar Ctrl + Shift + o
		 * assim vc importa a 2 classe pro projeto principal*/
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();

		System.out.println("informe as medidas do triangulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("informe as medidas do triangulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		/*a, b, c, foram as variaves criadas pra ler os triangulos na outra classe
		 *pra diferenciar basta colocar x.a y.a e o eclips ja da a opção de importar */
		
		/*na sub classe tambem coloquei a formula do calculo da area*/
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("AREA TRIANGULO X: " + "%.4f%n", areaX);
		System.out.printf("AREA TRIANGULO Y: " + "%.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("O Triangulo com maior area é o X");
		}
		else if (areaX < areaY) {
			System.out.println("O Triangulo com maior area é o Y");
		}
		else if (areaX == areaY) {
			System.out.println("Os Triangulos tem a mesma area");
		}
		
		sc.close();
	}

}
