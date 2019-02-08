package lesson19;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        MultiMapImpls<Buyer, Produkt> cheki = new MultiMapImpls<>();
        Buyer buyer = new Buyer("Ivanov","+12345");
        Buyer buyer1 = new Buyer("Petrov", "+67890");
        Buyer buyer2 = new Buyer("Sidorov", "+13579");

        Produkt produkt = new Produkt("produkt", 999, 123);
        Produkt produkt1 = new Produkt("produkt1", 1250, 456);
        Produkt produkt2 = new Produkt("produkt2", 567, 789);
        Produkt produkt3 = new Produkt("produkt3", 980, 321);
        Produkt produkt4 = new Produkt("produkt4", 768, 654);
        Produkt produkt5 = new Produkt("produkt5", 354, 987);
        Produkt produkt6 = new Produkt("produkt6", 649, 998);
        Produkt produkt7 = new Produkt("produkt7", 244, 765);
        Produkt produkt8 = new Produkt("produkt8", 237, 432);

        cheki.put(buyer, produkt3);
        cheki.put(buyer, produkt1);
        cheki.put(buyer, produkt2);

        cheki.put(buyer1, produkt3);
        cheki.put(buyer1, produkt4);
        cheki.put(buyer1,produkt5);
        cheki.put(buyer1, produkt7);
        cheki.put(buyer1, produkt6);

        cheki.put(buyer2, produkt6);
        cheki.put(buyer2, produkt2);
        cheki.put(buyer2,produkt8);
        cheki.put(buyer2, produkt7);

        System.out.println(cheki.size());
        System.out.println(cheki.countValues(buyer2));

        for(Iterator<Produkt> iter = cheki.valuesIterator(buyer1);iter.hasNext();)
            System.out.println(iter.next());

        System.out.println("---------------------------------------");
        Collection<Produkt> produkts = cheki.values();
        for(Produkt p: produkts)
        System.out.println(p);

        MultiMapImpls<Buyer, Produkt> cheki2 = new MultiMapImpls<>();
        cheki2.put(buyer1,produkt5);
        cheki2.put(buyer1, produkt7);
        cheki2.put(buyer1, produkt6);
        cheki2.put(buyer2, produkt6);
        cheki2.put(buyer2, produkt2);
        cheki2.put(buyer2,produkt8);

        cheki.putAll(cheki2);
        System.out.println("---------------------------------------");
        Collection<Produkt> produktss = cheki.values();
        for(Produkt p: produktss)
            System.out.println(p);

        System.out.println(cheki.containsValue(produkt2));
        System.out.println(cheki.get(buyer));
    }
}
