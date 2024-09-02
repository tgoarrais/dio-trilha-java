import java.util.ArrayList;

/* Tipos de Referência

Os tipos de referência em Java referem-se a objetos e arrays. Diferente dos tipos primitivos, os tipos de referência armazenam referências (ou endereços de memória) aos objetos, e não os próprios valores. */

public class TiposReferencia {
    public static void main(String[] args) {
        // Tipo de referência: String
        String nome = "João";

        // Tipo de referência: Array (matriz) de inteiros
        int[] numeros = { 1, 2, 3, 4, 5 };

        // Tipo de referência: ArrayList (classe da biblioteca padrão do Java)
        ArrayList<String> listaNomes = new ArrayList<>();
        listaNomes.add("Maria");
        listaNomes.add("José");

        // Imprimindo os valores
        System.out.println("Nome: " + nome);
        System.out.println("Primeiro número no array: " + numeros[0]);
        System.out.println("Primeiro nome na lista: " + listaNomes.get(0));
    }
}
