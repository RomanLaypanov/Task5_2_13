import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(5);
        set1.add(0);
        set1.add(1);

        Set<Integer> set2 = new HashSet<>();
        set2.add(7);
        set2.add(1);
        set2.add(5);

        System.out.println(SymmetricDifference.symmetricDifference(set1, set2));
        System.out.println(set1);
        System.out.println(set2);
    }
}