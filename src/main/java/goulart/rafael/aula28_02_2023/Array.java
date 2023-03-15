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
        if (indice == lista.length) {
            lista = alocarNovoArray();
        }
        p.setId(indice + 1);
        lista[indice++] = p;
    }
    
    public static String mostrar() {
        String txt = "";
        for (int i = 0; i < indice; i++) {
            System.out.println(lista[i]);
            System.out.println("");
            txt = txt + lista[i].toString() + "\n";
        }
        
        return txt;
    }
    
    private static Pessoa[] alocarNovoArray() {
        Pessoa[] novo = new Pessoa[lista.length + 3];
        
        System.arraycopy(lista, 0, novo, 0, lista.length);
        
        return novo;
    }
    
    public static int buscar(int id) {
        int inicio = 0, fim = indice - 1, meio;
        
        while (inicio <= fim) {
            meio = (fim + inicio) / 2;
            if (id == lista[meio].getId()) {
                return meio;
            } else if (id > lista[meio].getId()) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return -1;
    }
    
    public static boolean remover(int id) {
        int rem = buscar(id);
        if (rem != -1) {
            for (int i = rem; i < indice - 1; i++) {
                lista[i] = lista[i + 1];
            }
            indice--;
            return true;
        }
        return false;
    }
    
    public static void ordenar() {
        for (int i = 1; i < indice; i++) {
            Pessoa temp = lista[i];
            int j = i;
            while (j > 0 && lista[j - 1].getNome().compareTo(temp.getNome()) {
                    ) {
                lista[j] = lista[j - 1];
                j--;
            }
            lista[j] = temp;
        }
    }
}