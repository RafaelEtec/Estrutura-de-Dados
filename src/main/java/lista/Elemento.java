package lista;
/**
 *
 * @author rafael.fgoulart1
 */
public class Elemento {
    private Object objeto;
    private Elemento prox;

    public Elemento(Object objeto, Elemento prox) {
        this.objeto = objeto;
        this.prox = prox;
    }

    public Object getObjeto() {
        return objeto;
    }

    public void setObjeto(Object objeto) {
        this.objeto = objeto;
    }

    public Elemento getProx() {
        return prox;
    }

    public void setProx(Elemento prox) {
        this.prox = prox;
    }

    @Override
    public String toString() {
        return "Elemento{" + "objeto=" + objeto + ", prox=" + prox + '}';
    }
}