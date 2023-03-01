package goulart.rafael.aula28_02_2023;

public class Array {
    private static Pessoa[] lista = new Pessoa[5];
    private static int indice = 0;
    
    
    /**
     * Realiza inserçào de objetos do tipo Pessoa
     * no Array lista.
     * @param p 
     */
    public static void inserir(Pessoa p) {
        p.setId(indice + 1);
        lista[indice++] = p;
    }
    
    public static void mostrar() {
        for(int i = 0; i < indice; i++) {
            System.out.println(lista[i]);
            System.out.println("");
        }
    }
}