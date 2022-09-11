package setembro;

import java.util.Scanner;

public class Exercício2LR {

	public static void main(String[] args) {
		
int numeros,contPar=0,contImpar=0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("\nentre com um número: ");
		numeros = scanner.nextInt();
		
		while(numeros!=-99) {
			if(numeros % 2 == 0) {
				contPar++;
			}else {
				contImpar++;
			}
			System.out.println("\nentre com um número: ");
			numeros = scanner.nextInt();
		}
		
		System.out.println("\nNós temos: "+contPar+" números pares...");
		System.out.println("\nNós temos: "+contImpar+" números ímpares...");
		
	}

}
