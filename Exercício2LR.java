package setembro;

import java.util.Scanner;

public class Exerc�cio2LR {

	public static void main(String[] args) {
		
int numeros,contPar=0,contImpar=0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("\nentre com um n�mero: ");
		numeros = scanner.nextInt();
		
		while(numeros!=-99) {
			if(numeros % 2 == 0) {
				contPar++;
			}else {
				contImpar++;
			}
			System.out.println("\nentre com um n�mero: ");
			numeros = scanner.nextInt();
		}
		
		System.out.println("\nN�s temos: "+contPar+" n�meros pares...");
		System.out.println("\nN�s temos: "+contImpar+" n�meros �mpares...");
		
	}

}
