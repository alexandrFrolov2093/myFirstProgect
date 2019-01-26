package lesson16;

import java.util.Comparator;

public class ReverseMonetComparator implements Comparator<Moneta> {
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
}
