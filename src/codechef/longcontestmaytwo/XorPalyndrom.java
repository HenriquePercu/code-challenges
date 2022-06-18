package codechef.longcontestmaytwo;

import java.util.Scanner;

public class XorPalyndrom {

    public static void main(String[] args) {
        int testCases;
        Scanner sc = new Scanner(System.in);
        testCases = sc.nextInt();

        for (int i = 0; i < testCases; i++) {
            int quantidadeNumeros = sc.nextInt();
            String numero = sc.next();

            System.out.println(qtdOperationsPalyndrome(numero));
        }
        // percorrer do lado esquerdo comparando com a outra metade, quando for diferente tentar mudar

        //sobrescrever sempre o que está com zero
    }

    public static int qtdOperationsPalyndrome(String number) {
        char[] numberArray = number.toCharArray();
        int qtdTrocas = 0;
        for (int i = 0; i < numberArray.length / 2; i++) {
            if (numberArray[i] != numberArray[numberArray.length - i - 1]) {
                qtdTrocas++;
            }
        }
        return qtdTrocas + 1 / 2;
    }

}
