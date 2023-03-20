import java.util.Scanner;

public class questao2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numeros, pares, impares;
		int quantidadePares = 0, quantidadeImpares = 0, posicaoVetorPares = 0, posicaoVetorImpares = 0, coringa;

		System.out.println("Quantidade de números:");
		numeros = new int[sc.nextInt()];

		for (int indice = 0; indice < numeros.length; indice++) {
			System.out.println("Número:");
			numeros[indice] = sc.nextInt();

			if (numeros[indice] % 2 == 0) {
				quantidadePares++;
			} else {
				quantidadeImpares++;
			}

		}

		pares = new int[quantidadePares];
		impares = new int[quantidadeImpares];

		for (int indice = 0; indice < numeros.length; indice++) {
			if (numeros[indice] % 2 == 0) {
				pares[posicaoVetorPares] = numeros[indice];
				posicaoVetorPares++;
			} else {
				impares[posicaoVetorImpares] = numeros[indice];
				posicaoVetorImpares++;
			}
		}

		for (int i = 0; i < pares.length; i++) {
			for (int j = i + 1; j < pares.length; j++) {
				if (pares[i] > pares[j]) {
					coringa = pares[i];
					pares[i] = pares[j];
					pares[j] = coringa;
				}
			}
		}

		for (int i = 0; i < impares.length; i++) {
			for (int j = i + 1; j < impares.length; j++) {
				if (impares[i] < impares[j]) {
					coringa = impares[i];
					impares[i] = impares[j];
					impares[j] = coringa;
				}
			}
		}

		System.out.println("Números ordenados corretamente:");

		for (int par : pares) {
			System.out.print(par + " | ");
		}

		for (int impar : impares) {
			System.out.print(impar + " | ");
		}

		sc.close();

	}

}
