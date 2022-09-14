package setembro;

import java.util.Scanner;

public class ArrayVetor {

	public static void main(String[] args) {
		
		int[] num = new int [6];
		int[] paresDigitados = new int [6];
		int somaPares = 0, qtdeImpares = 0;
		
		Scanner leia = new Scanner (System.in);
		
		for (int i = 0; i < 6; i++) {
		System.out.println("Digite um número: ");
		num[i] = leia.nextInt();
		}
		
		if (num[i] % 2 == 0) {
		paresDigitados[i] = num[i];
		somaPares += num[i];
		}
		else {
			qtdeImpares++;
		}
		
		for (int i = 0; i < 6; i++) {
			System.out.println("Par Digitado: "+" num ["+ (i + 1) + "] "+" = "+paresDigitados[i]);
		}
		
		System.out.println("\nA soma dos números digitados: " + somaPares);
		System.out.println("A quantidade de números ímpares digitados:" + qtdeImpares);
	}
	
}
