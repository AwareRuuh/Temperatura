import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  Scanner entrada = new Scanner(System.in);
		double Celsius,Kelvin,Fahrenheit,Réaumur,Rankine; 

		System.out.print("Conversor de temperatura: Graus Celsius -> kelvin, fahrenheit,réaumur e Rankine\n\n"); 
		  System.out.print("Digite a temperatura em Celsius: ");
		  Celsius = entrada.nextDouble();
      Kelvin = ( Celsius + 273 );  
    //TK = TC + 273
		System.out.print("\n A medida convertida em Kelvin é " + Kelvin + "ºK\n");
  }
}