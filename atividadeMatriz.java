package atividadeVetoresMatriz;

import java.util.Scanner;

public class atividadeMatriz {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int matriz[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println("Elementos da Diagonal Principal:");
        for (int i = 0; i < 3; i++) {
            System.out.print(matriz[i][i]);
        }

        System.out.println("\nElementos da Diagonal Secundária:");
        for (int i = 0; i < 3; i++) {
            System.out.print(matriz[i][2 - i]);
        }

        int somaDiagonalPrincipal = 0;
        int somaDiagonalSecundaria = 0;

        for (int i = 0; i < 3; i++) {
        	somaDiagonalPrincipal = somaDiagonalPrincipal + matriz[i][i];
            somaDiagonalSecundaria = somaDiagonalSecundaria + matriz[i][2 - i];
        }

        System.out.println("\nSoma da Diagonal Principal: " + somaDiagonalPrincipal);
        System.out.println("Soma da Diagonal Secundária: " + somaDiagonalSecundaria);
    }
}
