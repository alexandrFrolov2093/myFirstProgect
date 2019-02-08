package modul2.lesson16;

import java.util.Collection;
import java.util.HashSet;

public class Main2 {
    public static void main(String[] args) {
        Moneta moneta1 = new Moneta(1999,"bronza",5,9);
        Moneta moneta2 = new Moneta(1998,"silver",10,9);
        Moneta moneta3 = new Moneta(1998,"bronza",5,8);
        Moneta moneta4 = new Moneta(1999,"gold",5,7);
        Moneta moneta5 = new Moneta(1999,"platina",15,9);
        Moneta moneta6 = new Moneta(1999,"bronza",5,9);

        HashSet<Moneta>  monetasHash = new HashSet<>();
        monetasHash.add(moneta1);
        monetasHash.add(moneta2);
        monetasHash.add(moneta3);
        monetasHash.add(moneta4);
        monetasHash.add(moneta5);
        monetasHash.add(moneta6);

        Collection<Moneta> result = SortMonet.sortByGod((monetasHash));
        for(Moneta moneta : result){
            System.out.println(moneta);
        }

    }

}
