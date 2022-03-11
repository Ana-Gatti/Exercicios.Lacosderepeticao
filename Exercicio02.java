/* Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. */

package generation.exercicios.repeticao;

//importando biblioteca
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		// informando que o comando leia dever� ser escaneado
		Scanner leia = new Scanner(System.in);

		// declarando vari�veis
		int n, par = 0, impar = 0;

		for (n = 1; n <= 10; n++) {
			System.out.println("Digite um n�mero: ");
			n = leia.nextInt();
			if (n % 2 == 0) {
				par++;
				impar = n - par;
			}

			// encerrando a fun��o leia
			leia.close();
		}

		System.out.println("A quantidade de n�meros pares �: " + par);
		System.out.println("A quantidade de n�meros �mpares �: " + impar);

	}
}
