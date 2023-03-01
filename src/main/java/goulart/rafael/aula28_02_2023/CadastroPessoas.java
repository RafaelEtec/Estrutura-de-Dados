package goulart.rafael.aula28_02_2023;

public class CadastroPessoas {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Rafael", 20);
        Pessoa p2 = new Pessoa("William", 36);
        Pessoa p3 = new Pessoa("Marlon", 21);
        Pessoa p4 = new Pessoa("Jéssica", 19);
        Pessoa p5 = new Pessoa("Lara", 22);
        
        Array.inserir(p1);
        Array.inserir(p2);
        Array.inserir(p3);
        Array.inserir(p4);
        Array.inserir(p5);
        
        Array.mostrar();
    }
}