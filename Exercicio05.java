/* Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados. */

package generation.exercicios.repeticao;

//importando biblioteca
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		// informando que o comando leia deverá ser escaneado
		Scanner leia = new Scanner(System.in);

		// declarando variáveis
		int n = 0, soma = 0;

		// laço de repetição
		do {
			System.out.println("Digite um número: ");
			n = leia.nextInt();
			soma += n;
		}

		while (n != 0);

		// saída de dados
		System.out.println("A soma dos números é: " + soma);

		// encerrando a função leia
		leia.close();

	}

}
