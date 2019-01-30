package lesson17;

import java.util.*;

public class Reiting {
    private HashMap<String, Integer> reiting = new HashMap<>();

    public Reiting() {
    }

    public void addPoint(String comand, Integer point) {
        if (reiting.containsKey(comand)) {
            int currentPoint = reiting.get(comand);
            reiting.put(comand, point + currentPoint);
        } else {
            reiting.put(comand, point);
        }
    }

    public void printReiting() {
        Set<String> comands = reiting.keySet();
        for (String comand : comands) {
            System.out.println(comand + "----" + reiting.get(comand));
        }
    }

    public void printPobeditel() {
        Set<String> comands = reiting.keySet();
        Integer max = 0;
        String pobed = "";
        for (String comand : comands) {
            if (reiting.get(comand) > max) {
                pobed = comand;
                max = reiting.get(comand);
            }
        }
        System.out.println("podeditel - " + pobed + "--" + reiting.get(pobed));
    }
}
