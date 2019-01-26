package lesson16;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Moneta moneta1 = new Moneta(1999,"bronza",5,9);
        Moneta moneta2 = new Moneta(1998,"silver",10,9);
        Moneta moneta3 = new Moneta(1998,"bronza",5,8);
        Moneta moneta4 = new Moneta(1999,"gold",5,7);
        Moneta moneta5 = new Moneta(1999,"platina",15,9);
        Moneta moneta6 = new Moneta(1999,"bronza",5,9);

        TreeSet<Moneta> monetaHashSet = new TreeSet<>();
        monetaHashSet.add(moneta1);
        monetaHashSet.add(moneta2);
        monetaHashSet.add(moneta3);
        monetaHashSet.add(moneta4);
        monetaHashSet.add(moneta5);
        monetaHashSet.add(moneta6);

        for (Iterator<Moneta> monetaIterator = monetaHashSet.iterator();monetaIterator.hasNext();) {
            System.out.println(monetaIterator.next());
        }
        System.out.println("---------------------------------");
        TreeSet<Moneta> monetaHashSet2 = new TreeSet<>(new Comparator<Moneta>() {
            @Override
            public int compare(Moneta o1, Moneta o2) {
                int year1 = o1.getGodVipuska();
                int year2 = o2.getGodVipuska();
                if (year1 != year2)
                    return year2 - year1;
                int nomenal1 = o1.getNomenal();
                int nomenal2 = o2.getNomenal();
                if (nomenal1!=nomenal2)
                    return nomenal2 - nomenal1;
                if(o1.getColvoZvizd() != o2.getColvoZvizd())
                    return o2.getColvoZvizd() - o1.getColvoZvizd();
                return o2.getMetall().compareTo(o1.getMetall());
            }
        });
        monetaHashSet2.add(moneta1);
        monetaHashSet2.add(moneta2);
        monetaHashSet2.add(moneta3);
        monetaHashSet2.add(moneta4);
        monetaHashSet2.add(moneta5);
        monetaHashSet2.add(moneta6);

        for (Iterator<Moneta> monetaIterator = monetaHashSet2.iterator();monetaIterator.hasNext();) {
            System.out.println(monetaIterator.next());
        }
    }
}
