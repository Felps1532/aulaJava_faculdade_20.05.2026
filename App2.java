import java.util.ArrayList;
import java.util.Collections;

public class App2 {
        public static void main(String[] args) {
                ArrayList<String> nomes = new ArrayList<>();
                nomes.add("Mariana");
                nomes.add("André");
                nomes.add("Paulo");
                nomes.add("Carla");
                nomes.add("Matheus");

                System.out.println("Nomes antes: " + nomes);
                Collections.sort(nomes);
                System.out.println("Nomes depois: " + nomes);

                System.out.println("Nomes: " + nomes);
                System.out.println("Collections.binarySearch(Mariana) : " +
                                Collections.binarySearch(nomes, "Mariana"));
                System.out.println("Collections.binarySearch(Carla) : " +
                                Collections.binarySearch(nomes, "Carla"));

                ArrayList<String> nomes2 = new ArrayList<>();
                nomes2.add("Mariana");
                nomes2.add("Andréia");
                nomes2.add("Carlos");
                nomes2.add("Miguel");
                nomes2.add("Paulo");

                nomes2.add("Mariana");
                System.out.println("Frequência 'Mariana': " + Collections.frequency(nomes2, "Mariana"));

                System.out.println("Maior valor de 'nomes2': " + Collections.max(nomes2));
                System.out.println("Menor valor de 'nomes2': " + Collections.min(nomes2));

                Collections.reverse(nomes2);
                System.out.println("'nomes2' invertido: " + nomes2);

        }
}