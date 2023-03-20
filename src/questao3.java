import java.util.Scanner;

public class questao3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] vetor1 = new int[5], vetor2 = new int[5], vetorDiferenca = new int[5], vetorSoma = new int[5],
				vetorVezes = new int[5];
		
		for (int indice = 0; indice < vetor1.length; indice++) {
			System.out.println((indice + 1) + "° número do primeiro vetor:");
			vetor1[indice] = sc.nextInt();
			
			System.out.println((indice + 1) + "° número do segundo vetor:");
			vetor2[indice] = sc.nextInt();
			
			vetorDiferenca[indice] = vetor1[indice] - vetor2[indice];
			vetorSoma[indice] = vetor1[indice] + vetor2[indice];
			vetorVezes[indice] = vetor1[indice] * vetor2[indice];
			
		}
		
		for (int numero : vetorDiferenca) {
			System.out.print(numero + " | ");
		}
		
		System.out.println("");
		
		for (int numero : vetorSoma) {
			System.out.print(numero + " | ");
		}
		
		System.out.println("");
		
		for (int numero : vetorVezes) {
			System.out.print(numero + " | ");
		}
		
		sc.close();

	}

}
