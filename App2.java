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

                ArrayList<Integer> nomes2 = new ArrayList<>();
                nomes.add("Mariana");
                nomes.add("Andréia");
                nomes.add("Carlos");
                nomes.add("Miguel");
                nomes.add("Paulo");

                // System.out.println("disjoint: " + (Collections.disjoint(nomes, inteiros2) ?
                // "tem elementos em comum"
                // : "não tem elementos em comum"));

                // inteiros2.add(100);

                // System.out.println(
                // "Exibindo frequência do valor 100 no segundo arraylist: "
                // + Collections.frequency(inteiros2, 100));

                // System.out.println("O maior valor em 'inteiros2' é: " +
                // Collections.max(inteiros2)
                // + "\nE o menor valor é: "
                // + Collections.min(inteiros2));

                // System.out.println("Inteiros2 ao contrário: " + inteiros2);
                // Collections.reverse(inteiros2);
                // System.out.println("Inteiros2 ao contrário: " + inteiros2);

        }
}