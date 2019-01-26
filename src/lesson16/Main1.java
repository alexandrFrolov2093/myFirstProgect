package lesson16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main1 {
    public static void main(String[] args) {
        ArrayList<String> texts = new ArrayList<>();
        texts.add("qwe");
        texts.add("asd");
        texts.add("zxc");
        texts.add("rty");
        texts.add("fgh");
        texts.add("vbn");
        Collections.sort(texts, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        for(String text:texts){
            System.out.println(text);
        }
    }
}
