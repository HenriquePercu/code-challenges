package codechef.longcontestmayone;

import java.util.Scanner;

public class AttackOfQueen {

    public static void main(String[] args) {
        int testCases;
        Scanner sc = new Scanner(System.in);
        testCases = sc.nextInt();

        for (int i = 0; i < testCases; i++) {
            int N = sc.nextInt();
            int placeX = sc.nextInt();
            int placeY = sc.nextInt();

            System.out.println(countingQueenMovies(N, placeX, placeY));
        }

    }

    private static int countingQueenMovies(int N, int placeX, int placeY) {
        int posicoesCima = placeX != 1 ? placeX - 1 : 0;
        int posicoesBaixo = placeX != N ? N - placeX : 0;
        int posicoesDireita = placeY != N ? N - placeY : 0;
        int posicoesEsquerda = placeY != 1 ? placeY - 1 : 0;

        int diagonalBaixoDireito = Math.min(posicoesBaixo, posicoesDireita);
        int diagonalCimaDireito = Math.min(posicoesCima, posicoesDireita);
        int diagonalBaixoEsquerda = Math.min(posicoesBaixo, posicoesEsquerda);
        int diagonalCimaEsquerda = Math.min(posicoesCima, posicoesEsquerda);

        return posicoesCima + posicoesBaixo + posicoesDireita + posicoesEsquerda + diagonalBaixoDireito + diagonalBaixoEsquerda + diagonalCimaEsquerda + diagonalCimaDireito;
    }

}
