package atividadeVetoresMatriz;

import java.util.Arrays;
import java.util.Scanner;

public class atividadeVetor {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
        int posicao = -1;
		int vetorInteiros[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };

		System.out.println("Digite o numero que você deseja encontrar: ");
		
		int numeroDigitado = leia.nextInt();
		for (int i = 0; i < vetorInteiros.length; i++) {
			if (vetorInteiros[i] == numeroDigitado) {
				posicao = i;
				
			}
		}
		if (posicao != -1) {
			System.out.println("O número " + numeroDigitado + " está localizado na posição: " + posicao);
		} else {
				System.out.println("O número " + numeroDigitado + " não foi encontrado! " );
		}
		}

}


