/**
 * Rubén Bernal Ramos, CSI1
 */

package controladores;

import java.util.Scanner;

/**
 * Clase controladora de la aplicación
 * rbr - 281024
 */
public class Inicio {

	/**
	 * Método de entrada de la aplicación
	 * rbr - 281024
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Variables
		int numero;
		long resultado = 1;
		Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresa un número para calcular su factorial: ");
        int number = sc.nextInt();

        if (number < 0) {
            System.out.println("El factorial no puede ser negativo.");
        } else {
            int factorial = calcularFactorial(number);
            System.out.println("El factorial de " + number + " es: " + factorial);
        }
        
        sc.close();
	}
	
	public static int calcularFactorial(int numero) {
        int result = 1;
        for (int i = 1; i <= numero; i++) {
            result *= i;
        }
        return result;
    }

}
