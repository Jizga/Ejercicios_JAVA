package ejerciciosIntroductoriosCarlos;
import java.util.Scanner;

public class ConversorDeDivisas {
	
	private static Scanner reader;
	
	//tipo de cambio de divisa fijo
	private static double tipoDeCambio = 0.85;
	
	//Constructor parametrizado para hacer el tipo de cambio variable
	public ConversorDeDivisas( double tipoDeCambio) {
		super();
		
		//Con "Scanner" el tipo de cambio la da el usuario a través de la consola
		reader = new Scanner(System.in); 
		tipoDeCambio = reader.nextDouble();
		
		//"tipoDeCambio" cambia con el método "set"
		ConversorDeDivisas.setTipoDeCambio(tipoDeCambio);
	}

	public static void main(String[] args) {
		double euros = 0;
		double libras = 0;
	
		System.out.println("Introduce una cantidad en €");
		System.out.println("equivale a" + " " + eurosToibras(euros) + " " + "libras");
		
		System.out.println("Introduce una cantidad en libras");
		System.out.println("equivale a" + " " + librasToEuros(libras) + " " + "€");
		
		System.out.println("¿A cómo está el nuevo cambio de divisa?");
		System.out.println("Introducelo:");
		
		//Nuevo tipo de cambio
		new ConversorDeDivisas(tipoDeCambio);
		
		System.err.println("*** El tipo de cambio ha cambiado ***");
		System.out.println("Introduce una cantidad en €");
		System.out.println("equivale a" + " " + eurosToibras(euros) + " " + "libras");
		
		System.out.println("Introduce una cantidad en libras");
		System.out.println("equivale a" + " " + librasToEuros(libras) + " " + "€");
		
	}
	

	public static double eurosToibras(double euros) {
		//Con "Scanner" la cantidad en € la da el usuario a través de la consola
		reader = new Scanner(System.in);
		euros = reader.nextDouble();
		double result = euros * getTipoDeCambio();
		return result;
	}
	
	public static double librasToEuros(double libras) {
		//Con "Scanner" la cantidad en libras la da el usuario a través de la consola
		reader = new Scanner(System.in);
		libras = reader.nextDouble();
		double result = libras / getTipoDeCambio();
		return result;
	}


	public static double getTipoDeCambio() {
		return tipoDeCambio;
	}


	public static void setTipoDeCambio(double tipoDeCambio) {
		ConversorDeDivisas.tipoDeCambio = tipoDeCambio;
	}

}
