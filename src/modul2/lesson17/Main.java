package modul2.lesson17;

import org.apache.log4j.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class);
    public static void main(String[] args) {
        //HashMap<String, Integer> reiting = new HashMap<>();
       // reiting.put("Arsenal", 5);
       // reiting.put("Dinamo", 6);
       // reiting.put("Spartak", 4);

       // System.out.println(reiting.get("Dinamo"));

        Reiting reiting = new Reiting();
        reiting.addPoint("Arsenal", 5);
        reiting.addPoint("Dinamo", 6);
        reiting.addPoint("Spartak", 4);
        reiting.addPoint("Arsenal", 2);
        reiting.addPoint("CSK", 10);

        reiting.printReiting();
        reiting.printPobeditel();

        logger.error("qwerty");
    }
}
