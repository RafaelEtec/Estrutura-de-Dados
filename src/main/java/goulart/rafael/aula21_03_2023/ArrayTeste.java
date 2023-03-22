package goulart.rafael.aula21_03_2023;
/**
 *
 * @author rafael.fgoulart1
 */
public class ArrayTeste {
    private static Teste[] lista = new Teste[5];
    private static int ind = 0;
    
    public static void inserir(Teste t) {
        if (ind == lista.length) {
            lista = alocarNovoArray();
        }
        t.setId(ind + 1);
        lista[ind++] = t;
    }
    
    private static Teste[] alocarNovoArray() {
        Teste[] novo = new Teste[lista.length + 3];
        System.arraycopy(lista, 0, novo, 0, lista.length);
    
        return novo;
    }
    
    public static String mostrar() {
        String txt = "";
        for (int i = 0; i < ind; i++) {
            System.out.println(lista[i]);
            System.out.println("");
            txt = txt + lista[i].toString() + "\n";
        }
        
        return txt;
    }
    
    public static int buscar(int id) {
        int inicio = 0, fim = ind - 1, meio;
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
            for (int i = rem; i < ind - 1; i++) {
                lista[i] = lista[i + 1];
            }
            ind--;
            return true;
        }
        return false;
    }
}