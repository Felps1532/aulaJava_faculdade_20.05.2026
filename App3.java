import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class App3 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        FileReader fr = new FileReader("cadastro_pessoas.csv");
        BufferedReader br = new BufferedReader(fr);

        String line = null;

        br.readLine(); // lendo a primeira linha, que nesse caso é o cabeçalho

        while ((line = br.readLine()) != null) {
            System.out.println("--> " + line);
        }

        br.close();
    }
}
