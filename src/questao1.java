import java.util.Scanner;

public class questao1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] notas = new double[10];
		double maiorNota = 0, somaNotas = 0;
		int[] posicoesMaiorNota;
		int quantidadeMaiorNota = 0, quantidadeAcimaMedia = 0, posicaoVetorMaiorNota = 0;

		for (int indice = 0; indice < 10; indice++) {
			System.out.println("Nota do(a) " + (indice + 1) + "° aluno(a):");
			notas[indice] = sc.nextDouble();
			somaNotas += notas[indice];

			if (notas[indice] > maiorNota) {
				maiorNota = notas[indice];
			}

		}

		somaNotas /= 10;

		for (double nota : notas) {
			if (nota > somaNotas) {
				quantidadeAcimaMedia++;
			}
		}

		for (int indice = 0; indice < 10; indice++) {
			if (notas[indice] == maiorNota) {
				quantidadeMaiorNota++;
			}
		}

		posicoesMaiorNota = new int[quantidadeMaiorNota];

		for (int indice = 0; indice < 10; indice++) {
			if (notas[indice] == maiorNota) {
				posicoesMaiorNota[posicaoVetorMaiorNota] = indice;
				posicaoVetorMaiorNota++;
			}
		}

		System.out.println("Média da turma: " + somaNotas);
		System.out.println("Quantidade de alunos acima da média da turma: " + quantidadeAcimaMedia);
		System.out.println("Maior nota digitada: " + maiorNota);
		System.out.print("Posições com a maior nota: ");

		for (int posicao : posicoesMaiorNota) {
			System.out.print(posicao + " | ");
		}

		sc.close();

	}
}
