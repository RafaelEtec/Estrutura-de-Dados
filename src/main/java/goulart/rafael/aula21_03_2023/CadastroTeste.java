package goulart.rafael.aula21_03_2023;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
/**
 *
 * @author rafael.fgoulart1
 */
public class CadastroTeste {
    public static void main(String[] args) throws IOException {
        diretorios();
        arquivos();
        
        ArrayTeste.inserir(new Teste("Rafael", 20));
        ArrayTeste.inserir(new Teste("William", 36));
        ArrayTeste.inserir(new Teste("José", 24));
        ArrayTeste.inserir(new Teste("Marcos", 51));
        ArrayTeste.inserir(new Teste("Júlio", 84));
        ArrayTeste.inserir(new Teste("Lucas", 31));
        ArrayTeste.inserir(new Teste("Ferdinando", 25));
        ArrayTeste.inserir(new Teste("Goes", 61));
        ArrayTeste.inserir(new Teste("Guilherme", 41));
        ArrayTeste.inserir(new Teste("Ana", 12));
        ArrayTeste.inserir(new Teste("Cassiana", 52));
        ArrayTeste.inserir(new Teste("Bruna", 93));
        ArrayTeste.inserir(new Teste("Bianca", 82));
        ArrayTeste.inserir(new Teste("Jéssica", 70));
        ArrayTeste.inserir(new Teste("Catarina", 19));
        ArrayTeste.inserir(new Teste("Wendy", 18));
        ArrayTeste.inserir(new Teste("Milena", 14));
        ArrayTeste.inserir(new Teste("Jaspion", 20));
        ArrayTeste.inserir(new Teste("Paulo", 31));
        ArrayTeste.inserir(new Teste("Renato", 38));
        
        ArrayTeste.mostrar();
        ArrayTeste.remover(4);
        ArrayTeste.remover(9);
        
        salvar();
    }
    
    public static void diretorios() throws IOException {
        boolean existe = Files.exists(Path.of("./Teste"));
        
        if (!existe) {
            Path dir = Files.createDirectory(Path.of("./Teste"));
            System.out.println(dir.toAbsolutePath());
        } else {
            System.out.println("Diretório já existe.");
        }
    }
    
    public static void arquivos() throws IOException {
        boolean existe = Files.exists(Path.of("./Teste/Teste.txt"));
        
        if (!existe) {
            Path file = Files.createFile(Path.of("./Teste").resolve("Teste.txt"));
            System.out.println(file.toAbsolutePath());
        } else {
            System.out.println("Arquivo já existe.");
        }
    }
    
    public static void salvar() throws IOException {
        Path file = Path.of("./Teste/Teste.txt");
        
        Files.writeString(file,
                ArrayTeste.mostrar() + "\n\n",
                StandardCharsets.ISO_8859_1,
                StandardOpenOption.APPEND);
        System.out.println("Salvando...");
    }
}