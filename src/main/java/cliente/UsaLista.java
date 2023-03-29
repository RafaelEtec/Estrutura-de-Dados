package cliente;
import lista.*;
/**
 *
 * @author rafael.fgoulart1
 */
public class UsaLista {
    
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.inserir(new Contato("Rafael","11 977406137"));
        lista.inserir(new Contato("Raffael","12 977406137"));
        lista.inserir(new Contato("Raphael","13 977406137"));
        
        Object[] obj = lista.buscar(1);
        if (obj != null) {
            System.out.println(obj[2]);
        } else {
            System.out.println("Não encontrado!");
        }
        
        lista.remover(1);
        lista.mostrar();
    }
}