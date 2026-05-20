import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) {
        ArrayList<Integer> inteiros = new ArrayList<>();
        inteiros.add(10);
        inteiros.add(50);
        inteiros.add(41);
        inteiros.add(0);
        inteiros.add(-1);

        System.out.println("Inteiros antes: " + inteiros);
        Collections.sort(inteiros);
        System.out.println("Inteiros depois: " + inteiros);
        System.out.println("Collections.binarySearch(10) : " + Collections.binarySearch(inteiros, 10));
        System.out.println("Collections.binarySearch(20) : " + Collections.binarySearch(inteiros, 20));

        // 30 52 20 -10 100
        ArrayList<Integer> inteiros2 = new ArrayList<>();
        inteiros2.add(30);
        inteiros2.add(52);
        inteiros2.add(20);
        inteiros2.add(-10);
        inteiros2.add(100);

        System.out.println("disjoint: " + ((Collections.disjoint(inteiros, inteiros2)) ? "tem elementos em comum"
                : "não tem elementos em comum"));

        inteiros2.add(100);

        System.out.println(
                "Exibindo frequência do valor 100 no segundo arraylist: " + Collections.frequency(inteiros2, 100)); // frequência
                                                                                                                    // na
        // qual o número
        // 100 aparece
        // no arraylist

        

    }
}