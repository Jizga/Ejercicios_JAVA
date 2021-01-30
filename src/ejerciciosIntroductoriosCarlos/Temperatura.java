package ejerciciosIntroductoriosCarlos;

import java.util.Scanner;

public class Temperatura {

	private static Scanner reader;

	public static void main(String[] args) {
		
		double celciusNumber = 0;
		double farenheitNumber = 0;
		
		System.out.println( "Introduce una temperatura en ºC:" );
		System.out.println("son" + " " + celciusToFarenheit(celciusNumber) +"º"+ "" + "F"); 
		
		System.out.println("Introduce una temperatura en ºF:");
		System.out.println("son" + " " + farenheitToCelcius(farenheitNumber) + "º" + "" + "C");
		
	}

	public static double celciusToFarenheit (double celciusNumber) {
		//Para introducir los valores mediante la consola
		reader = new Scanner(System.in);
		celciusNumber = reader.nextDouble();
		double result = (1.8) * celciusNumber + 32;
		return result;
	}
	
	public static double farenheitToCelcius (double farenheitNumber) {
		reader = new Scanner(System.in);
		farenheitNumber = reader.nextDouble();
		double result = (farenheitNumber - 32)/ 1.8;
		return result;
	}
}
