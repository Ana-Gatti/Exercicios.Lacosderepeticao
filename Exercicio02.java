/* Ler 10 números e imprimir quantos são pares e quantos são ímpares. */

package generation.exercicios.repeticao;

//importando biblioteca
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		// informando que o comando leia deverá ser escaneado
		Scanner leia = new Scanner(System.in);

		// declarando variáveis
		int n, par = 0, impar = 0;

		for (n = 1; n <= 10; n++) {
			System.out.println("Digite um número: ");
			n = leia.nextInt();
			if (n % 2 == 0) {
				par++;
				impar = n - par;
			}

			// encerrando a função leia
			leia.close();
		}

		System.out.println("A quantidade de números pares é: " + par);
		System.out.println("A quantidade de números ímpares é: " + impar);

	}
}
