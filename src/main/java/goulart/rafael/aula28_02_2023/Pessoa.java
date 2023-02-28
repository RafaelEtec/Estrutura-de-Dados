package goulart.rafael.aula28_02_2023;

public class Pessoa {
    private String nome;
    private int idade;
    private int id;

    public Pessoa() {
    }
    
    public Pessoa(String nome, int idade, int id) {
        this.nome = nome;
        this.idade = idade;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getId() {
        return id;
    }
}