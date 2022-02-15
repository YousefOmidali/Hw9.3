import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Comparator comparator = new Comparator();
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random(20);
        for (int i = 0; i < 20; i++) {
            numbers.add(random.nextInt(20 + 1));
        }
        System.out.println(numbers);
        System.out.println("--------------------------------");
        comparator.Comparator(numbers);
    }
}
