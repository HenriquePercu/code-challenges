package superreducestring;

import java.util.*;

public class SuperReduceString {

    public static void main(String[] args) {
        System.out.println(superReducedString("aab"));
    }

    public static String superReducedString(String s) {
        // percorre o array, remove no indice de s, e chama novamente...se terminar o array e nao encontrar mais nada, retorna

        char[] caracteres = s.toCharArray();
        List<String> palavra = new LinkedList<>(Arrays.asList(s.split("")));

        for (int i = 0; i < caracteres.length - 1; i++) {

            if (caracteres[i] == caracteres[i + 1]) {
                palavra.remove(i);
                palavra.remove(i);
                //System.out.println(palavra);
                return superReducedString(palavra.toString().replace("[", "").replace("]", "").replace(", ", ""));
            }

        }
        String palavraModificada = palavra.toString().replace("[", "").replace("]", "").replace(", ", "");
        return palavraModificada.equals("") ? "Empty String" : palavraModificada;
    }

}
