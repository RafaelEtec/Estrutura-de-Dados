package goulart.rafael.aula28_02_2023;

public class CadastroPessoas {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Rafael", 20, 1);
        Pessoa p2 = new Pessoa("William", 36, 2);
        Array.inserir(p1);
        Array.inserir(p2);
    }
}