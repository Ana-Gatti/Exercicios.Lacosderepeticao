/* Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
0(zero).*/

package generation.exercicios.repeticao;

//importando biblioteca
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		// informando que o comando leia dever� ser escaneado
		Scanner leia = new Scanner(System.in);

		// declarando vari�veis
		int n = 0, soma = 0, cont = 0;
		double media = 0;

		// la�o de repeti��o
		do {
			System.out.println("Digite um n�mero: ");
			n = leia.nextInt();
			if (n % 3 == 0) {
				soma += n;
				cont++;
				media = soma / cont;
			}
		}

		while (n != 0);

		// sa�da de dados
		System.out.println("A m�dia dos n�meros digitados �: " + media);
		System.out.println("E a soma �: " + soma);

		// encerrando a fun��o leia
		leia.close();

	}

}
