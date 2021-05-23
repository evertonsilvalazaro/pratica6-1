import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int i, soma=0;
		int [] vet= new int[10];
		
		for (i=0;i<10;i++) {
			System.out.println("Digite um numero");
			vet[i]=sc.nextInt();
			sc.close();
		
		}
		System.out.println("Vetor informado");
		for(i=0;i<vet.length;i++)
		System.out.printf("vet[%d] = %2d\n",i,vet[i]);
		
		
		
	for (int numero : vet) 
		if (numero % 2== 0)
			soma+=numero;
	System.out.println("soma dos vetores pares são " +soma);
	
	

	}	

}
