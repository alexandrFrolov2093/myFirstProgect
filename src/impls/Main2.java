package impls;

import java.util.HashSet;
import java.util.LinkedList;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("collectionUtils");
        LinkedList<Integer> a = new LinkedList<>();
        a.add(1);
        a.add(7);
        a.add(2);
        a.add(13);
        a.add(5);

        HashSet<Integer> b = new HashSet();
        b.add(1);
        b.add(7);
        b.add(8);
        b.add(3);
        b.add(5);

        CollectionUtilsImpls util = new CollectionUtilsImpls();
        System.out.println(util.union(a, b));
        System.out.println(util.intersection(a, b));
        System.out.println(util.unionWithoutDuplicate(a, b));
        System.out.println(util.intersectionWithoutDuplicate(a, b));
        System.out.println(util.difference(a, b));

        System.out.println("---------------");
        System.out.println("listUtils");
        ListUtilsImpls listUtilsImpls = new ListUtilsImpls();
        System.out.println(listUtilsImpls.asList("qwerty", "asdfgh", "zxcvbn"));
        LinkedList<Double> data = new LinkedList();
        data.add(1.2);
        data.add(5.4);
        data.add(0.4);
        System.out.println(listUtilsImpls.sortedList(data));

        System.out.println("--------------");
        System.out.println("setUtils");
        SetUtilsImpls setUtilsImpls = new SetUtilsImpls();
        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        integerLinkedList.add(23);
        integerLinkedList.add(54);
        integerLinkedList.add(66);
        HashSet<String> set2 = new HashSet<>();
        set2.add("qwerty");
        set2.add("asdfgh");
        set2.add("zxcvbn");
        System.out.println(setUtilsImpls.orderedSet(integerLinkedList, set2));
        System.out.println(setUtilsImpls.customOrderSet(1, 2, 3, 4, 5));
    }
}
