package impls;

import interfaces2.SetUtils;

import java.util.*;

public class SetUtilsImpls implements SetUtils {
    @Override
    public SortedSet<String> orderedSet(Collection<Integer> collection1, Set<String> set2) throws NullPointerException {
        if (collection1 == null || set2 == null)
            throw new NullPointerException("collection1 == null || set2 == null");
        TreeSet<String> stringTreeSet = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        for (Integer a: collection1) {
            stringTreeSet.add(a.toString());
        }
        stringTreeSet.addAll(set2);

        return stringTreeSet;
    }

    @Override
    public Set<Integer> customOrderSet(int val1, int val2, int val3, int val4, int val5) {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(val1);
        linkedHashSet.add(val2);
        linkedHashSet.add(val3);
        linkedHashSet.add(val4);
        linkedHashSet.add(val5);
        return linkedHashSet;
    }
}
