/* Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).*/

package generation.exercicios.repeticao;

//importando biblioteca
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		// informando que o comando leia deverá ser escaneado
		Scanner leia = new Scanner(System.in);

		// declarando variáveis
		int n = 0, soma = 0, cont = 0;
		double media = 0;

		// laço de repetição
		do {
			System.out.println("Digite um número: ");
			n = leia.nextInt();
			if (n % 3 == 0) {
				soma += n;
				cont++;
				media = soma / cont;
			}
		}

		while (n != 0);

		// saída de dados
		System.out.println("A média dos números digitados é: " + media);
		System.out.println("E a soma é: " + soma);

		// encerrando a função leia
		leia.close();

	}

}
