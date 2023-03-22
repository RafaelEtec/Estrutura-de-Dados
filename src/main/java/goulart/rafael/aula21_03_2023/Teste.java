package goulart.rafael.aula21_03_2023;
/**
 * 
 * @author rafael.fgoulart1
 */
public class Teste {
    private int id;
    private String nome;
    private int idade;
    
    public Teste() {}
    
    public Teste(String n, int i) {
        this.nome = n;
        this.idade = i;
    }
    
    public int getId() {
        return id;
    }
    
    public String getNome() {
        return nome;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    @Override
    public String toString() {
        return "Id: " + id + "\n  Nome: " + nome + "\n  Idade: " + idade;
    }
}