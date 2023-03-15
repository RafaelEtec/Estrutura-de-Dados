package Aula_24_04_2023;

/**
 * por Rafael Ferreira Goulart
 */

public class BuscaBinaria {

    static int[] v = {3, 4, 6, 9, 11};

    public static void main(String[] args) {
        int indice = binaria(9);

        if (indice == -1) {
            System.out.println(" - Não achou!");
        } else {
            System.out.println(" - O índice é: " + indice);
        }
    }

    public static int binaria(int b) {
        int inicio = 0, fim = v.length - 1, meio;

        while (inicio <= fim) {
            meio = (fim + inicio) / 2;
            if (b == v[meio]) {
                return meio;
            } else if (b > v[meio]) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        return -1;
    }
}