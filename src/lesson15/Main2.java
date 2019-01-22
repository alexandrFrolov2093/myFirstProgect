package lesson15;

import java.util.HashSet;

public class Main2 {
    public static void main(String[] args) {
        HashSet<String> text = new HashSet<>();
        text.add("qwerty");
        text.add("asdfgh");
        text.add("zxcvb");
        text.add("qazwsx");
        for(String texts : text){
            System.out.println(texts);
        }
    }
}
