import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference {
    public static Set symmetricDifference(Set set1, Set set2) {
        Set<?> set = new HashSet<>(set1);
        set.addAll(set2);

        Set<?> interSet = new HashSet<>(set1);
        interSet.retainAll(set2);

        set.removeAll(interSet);

        return set;
    }

}
