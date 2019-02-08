package modul2.lesson15;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(2,9);//записывает и сдвигает элементы
        numbers.set(0,9);//замещает элемент коллекции
        for (int i = 0; i < numbers.size(); i++){//первый способ прохождения по коллекции
            System.out.println(numbers.get(i));
        }
        System.out.println("___________________");
        for (Integer num : numbers) {//второй способ прохождения по коллекции
            System.out.println(num);
        }
        System.out.println("___________________");
        //третий способ с помощью итератора
        for (Iterator<Integer> integerIterator = numbers.iterator(); integerIterator.hasNext();){
            System.out.println(integerIterator.next());
        }
    }
    //Collection:
    //*List - можно хранить дубликаты, ести индексы
    //*Set - нет дубликатов, нет индексов

    //List:
    //*ArreyList
    //*LinkedList

    //Set:
    //*HashSet -> LinkedHashSet


}
