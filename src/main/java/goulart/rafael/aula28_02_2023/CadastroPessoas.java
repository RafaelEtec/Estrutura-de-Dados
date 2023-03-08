package goulart.rafael.aula28_02_2023;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class CadastroPessoas {
    public static void main(String[] args) throws IOException {
        diretorios();
        arquivos();
        
        Array.inserir(new Pessoa("Rafael", 20));
        Array.inserir(new Pessoa("William", 36));
        Array.inserir(new Pessoa("José", 24));
        Array.inserir(new Pessoa("Marcos", 51));
        Array.inserir(new Pessoa("Júlio", 84));
        Array.inserir(new Pessoa("Lucas", 31));
        Array.inserir(new Pessoa("Ferdinando", 25));
        Array.inserir(new Pessoa("Goes", 61));
        Array.inserir(new Pessoa("Guilherme", 41));
        Array.inserir(new Pessoa("Ana", 12));
        Array.inserir(new Pessoa("Cassiana", 52));
        Array.inserir(new Pessoa("Bruna", 93));
        Array.inserir(new Pessoa("Bianca", 82));
        Array.inserir(new Pessoa("Jéssica", 70));
        Array.inserir(new Pessoa("Catarina", 19));
        Array.inserir(new Pessoa("Wendy", 18));
        Array.inserir(new Pessoa("Milena", 14));
        Array.inserir(new Pessoa("Jaspion", 20));
        Array.inserir(new Pessoa("Paulo", 31));
        Array.inserir(new Pessoa("Renato", 38));
        
        Array.mostrar();
        
        Array.remover(1);
        
        salvar();
    }
    
    public static void diretorios() throws IOException {
        boolean existe = Files.exists(Path.of("./Data"));
        
        if (!existe) {
            Path dir = Files.createDirectory(Path.of("./Data"));
            System.out.println(dir.toAbsolutePath());
        } else {
            System.out.println("Diretório já existe.");
        }
    }
    
    public static void arquivos() throws IOException {
        boolean existe = Files.exists(Path.of("./Data/Pessoa.txt"));
        
        if (!existe) {
            Path file = Files.createFile(Path.of("./Data").resolve("Pessoa.txt"));
            System.out.println(file.toAbsolutePath());
        } else {
            System.out.println("Arquivo já existe.");
        }
    }
    
    public static void salvar() throws IOException {
        Path file = Path.of("./Data/Pessoa.txt");
        
        Files.writeString(file,
                Array.mostrar() + "\n\n",
                StandardCharsets.ISO_8859_1,
                StandardOpenOption.APPEND);
        System.out.println("Salvando...");
    }
}