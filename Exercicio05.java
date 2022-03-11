/* Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados. */

package generation.exercicios.repeticao;

//importando biblioteca
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		// informando que o comando leia dever� ser escaneado
		Scanner leia = new Scanner(System.in);

		// declarando vari�veis
		int n = 0, soma = 0;

		// la�o de repeti��o
		do {
			System.out.println("Digite um n�mero: ");
			n = leia.nextInt();
			soma += n;
		}

		while (n != 0);

		// sa�da de dados
		System.out.println("A soma dos n�meros �: " + soma);

		// encerrando a fun��o leia
		leia.close();

	}

}
