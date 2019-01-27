package impls;

import interfaces2.ListUtils;

import java.util.*;

public class ListUtilsImpls implements ListUtils{
    @Override
    public List<String> asList(String... strings) throws IllegalArgumentException {
        ArrayList<String> result = new ArrayList();
        for (String a: strings) {
            if (a == null){
                throw new IllegalArgumentException("String == null");
            }
            result.add(a);
        }

        return result;
    }

    @Override
    public List<Double> sortedList(List<Double> data) throws IllegalArgumentException {
        if(data == null)
            throw new IllegalArgumentException("data == null");
        LinkedList result = new LinkedList();
        result.addAll(data);
        Collections.sort(result, Collections.reverseOrder());
        return result;
    }
}
