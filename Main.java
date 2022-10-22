import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  Scanner entrada = new Scanner(System.in);
		double Celsius,Kelvin,Fahrenheit,Reaumur,Rankine; 

		System.out.print("Conversor de temperatura: Graus Celsius -> kelvin, fahrenheit,réaumur e Rankine\n\n"); 
		  System.out.print("Digite a temperatura em Celsius: ");
		  Celsius = entrada.nextDouble();
      Kelvin = ( Celsius + 273 );  
    //TK = TC + 273
      Fahrenheit = ( 9 * Celsius + 160 ) / 5;
    // TC/5 = (TF – 32)/9
      Reaumur = ( Celsius * 0.8 );
    //Ré = °C × 0,8
      Rankine = ( Celsius + 273.15 ) * 9 / 5;
    //Ra = (°C+273,15) × 9/5
		System.out.print("\n A medida convertida em Kelvin é " + Kelvin + "ºK\n");
    System.out.print("\n A medida convertida em Fahrenheit é " + Fahrenheit + "ºF\n");
    System.out.print("\n A medida convertida em Réaumur é " + Reaumur + "ºRé\n");
    System.out.print("\n A medida convertida em Rankie é " + Rankine + "ºRa\n");
  }
}