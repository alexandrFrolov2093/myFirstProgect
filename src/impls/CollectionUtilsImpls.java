package impls;

import interfaces2.CollectionUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

public class CollectionUtilsImpls implements CollectionUtils {
    @Override
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        return null;
    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        return null;
    }

    @Override
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        return null;
    }

    @Override
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        return null;
    }

    @Override
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        if(a == null || b == null){
            throw new NullPointerException("a == null || b == null");
        }
        ArrayList<Integer> difference = new ArrayList<>();
        for(Integer num: a){
            if(!b.contains(num))
                difference.add(num);
        }
        for(Integer num: b){
            if(!a.contains(num))
                difference.add(num);
        }
        return difference;
    }
}
