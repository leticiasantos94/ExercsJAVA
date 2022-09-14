package setembro;

public class ArrayVetor1 {

	public static void main(String[] args) {
		
		
			/*letra a*/
		    int A[] = {1,0,5,-2,-5,7};
		    int soma, l;
			
			/*letra b*/
		    
		    soma = A[0] + A[1] + A[5];
		    System.out.printf("Soma: %d\n\n",soma);
			
			/*letra c*/
		    A[4] = 100;
			
			/*letra d*/
		    for(l = 0; l < 6; l++)
		    	System.out.printf("%d\n",A[l]);
		    
		}
		
	}

