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

        
    }
}