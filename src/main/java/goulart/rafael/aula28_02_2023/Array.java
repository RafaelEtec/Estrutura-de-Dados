package goulart.rafael.aula28_02_2023;

public class Array {
    private static Pessoa[] lista = new Pessoa[3];
    private static int indice = 0;
    
    public static void inserir(Pessoa p) {
        lista[indice++] = p;
    }
    
    public static void mostrar() {
        for(int i = 0; i < indice; i++) {
            System.out.println(lista[i]);
        }
    }
}