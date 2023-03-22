package lista;
/**
 *
 * @author rafael.fgoulart1
 */
public class Contato {
    private String nome, cel;
    private int id;
    
    public Contato() {}

    public Contato(String nome, String cel) {
        this.nome = nome;
        this.cel = cel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    @Override
    public String toString() {
        return "ID: " + id + "\n  Nome: " + nome + "\n  Celular: " + cel;
    }
}