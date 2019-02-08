package modul2.lesson16;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class SortMonet {
    public static Collection<Moneta> sortByGod(Collection<Moneta> monetas){
        ArrayList<Moneta> newMonetas  = new ArrayList<>();
        newMonetas.addAll(monetas);
        Collections.sort(newMonetas, new Comparator<Moneta>() {
            @Override
            public int compare(Moneta o1, Moneta o2) {
                int year1 = o1.getGodVipuska();
                int year2 = o2.getGodVipuska();
                if (year1 != year2)
                    return year1 - year2;
                int nomenal1 = o1.getNomenal();
                int nomenal2 = o2.getNomenal();
                if (nomenal1!=nomenal2)
                    return nomenal1 - nomenal2;
                if(o1.getColvoZvizd() != o2.getColvoZvizd())
                    return o1.getColvoZvizd() - o2.getColvoZvizd();
                return o2.getMetall().compareTo(o2.getMetall());
            }
        });
        monetas = newMonetas;
        return newMonetas;
    }
}
