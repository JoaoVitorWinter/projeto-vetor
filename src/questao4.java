import java.util.Scanner;

public class questao4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int quantidadeAlunos, quantidadeProvas;
		double[] pesoProva, mediaPonderadaAlunos, mediaAritmeticaProva;
		double somaPeso = 0, nota;
		
		System.out.println("Quantidade de alunos:");
		quantidadeAlunos = sc.nextInt();
		
		System.out.println("Quantidade de provas:");
		quantidadeProvas = sc.nextInt();
		
		pesoProva = new double[quantidadeProvas];
		mediaAritmeticaProva = new double[quantidadeProvas];
		mediaPonderadaAlunos = new double[quantidadeAlunos];
		
		for (int indice = 0; indice < quantidadeProvas; indice++) {
			System.out.println("Peso da " + (indice + 1) + "° prova:");
			pesoProva[indice] = sc.nextDouble();
			somaPeso += pesoProva[indice];
		}
		
		for (int i = 0; i < quantidadeProvas; i++) {
			for (int j = 0; j < quantidadeAlunos; j++) {
				System.out.println("Nota da " + (i + 1) + "° prova do " + (j + 1) + "° aluno:");
				nota = sc.nextDouble();
				mediaPonderadaAlunos[j] += nota * pesoProva[i];
				mediaAritmeticaProva[i] += nota;
			}
		}
		
		for (int indice = 0; indice < quantidadeProvas; indice++) {
			mediaAritmeticaProva[indice] /= quantidadeAlunos;
		}
		
		for (int indice = 0; indice < quantidadeAlunos; indice++) {
			mediaPonderadaAlunos[indice] /= somaPeso;
		}
		
		System.out.println("Média ponderada dos alunos:");
		
		for (int indice = 0; indice < quantidadeAlunos; indice++) {
			System.out.println("Média pondarada do " + (indice + 1) + " aluno: " + mediaPonderadaAlunos[indice]);
		}
		
		System.out.println("\nMédia aritmética das provas:");
		
		for (int indice = 0; indice < quantidadeProvas; indice++) {
			System.out.println("Média aritmética da " + (indice + 1) + "° prova: " + mediaAritmeticaProva[indice]);
		}
		
		sc.close();

	}

}
