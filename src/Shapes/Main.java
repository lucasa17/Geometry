package Shapes;

import java.util.*;

public class Main {
	
	static Scanner scanner = new Scanner(System.in);

	static void menu(){
		System.out.println("Menu:");
		System.out.println("1 - Quadrado\n2 - Retângulo\n3 - Triângulo\n4 - Círculo\n");
		System.out.print("Escolha uma opção: ");
		int option = scanner.nextInt(); 
		
		switch(option) {
			case 1:
				Square square1 = new Square();
			       
				System.out.print("Digite o tamanho do lado do quadrado: ");
				float sideSize = scanner.nextFloat();
		        square1.setSideSize(sideSize);
		        square1.setArea(sideSize);
		        System.out.println("Área do quadrado: " + square1.getArea());

		        System.out.println("\nDesenho do quadrado:");
		        square1.Draw();
		    break;
			case 2:
				Rectangle rectangle1 = new Rectangle();
				
				System.out.print("Digite o tamanho da base do Retângulo: ");
				float baseSizeRectangle = scanner.nextFloat();
				System.out.print("Digite o tamanho da altura do Retângulo: ");
				float heightSizeRectangle = scanner.nextFloat();
				rectangle1.setBaseSize(baseSizeRectangle);
				rectangle1.setHeightSize(heightSizeRectangle);
				rectangle1.setArea(baseSizeRectangle, heightSizeRectangle);
		        System.out.println("Área do Retângulo: " + rectangle1.getArea());

		        System.out.println("\nDesenho do Retângulo:");
		        rectangle1.Draw();
			break;
			case 3:
				Triangle triangle1 = new Triangle();
				
				System.out.print("Digite o tamanho da base do triângulo: ");
				float baseSizeTriangle = scanner.nextFloat();
				System.out.print("Digite o tamanho da altura do triângulo: ");
				float heightSizeTriangle = scanner.nextFloat();
		        triangle1.setBaseSize(baseSizeTriangle);
		        triangle1.setHeightSize(heightSizeTriangle);
		        triangle1.setArea(baseSizeTriangle, heightSizeTriangle);
		        System.out.println("Área do triângulo: " + triangle1.getArea());

		        System.out.println("\nDesenho do Triângulo:");
		        triangle1.Draw();
			break;
			case 4:
				Circle circle1 = new Circle();
				
				System.out.print("Digite o tamanho do raio do círculo: ");
				float radiusSize = scanner.nextFloat();
				circle1.setRadiusSize(radiusSize);
				circle1.setArea(radiusSize);
		        System.out.println("Área do círculo: " + circle1.getArea());
		        
		        System.out.println("\nDesenho do Círculo:");
		        circle1.Draw();
			break;
			default:
		        System.out.println("Valor inválido");
			break;
		}
	}
	
	public static void main(String[] args) {
		
		menu();
		
	}
}
