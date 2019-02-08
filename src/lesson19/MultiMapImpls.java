package lesson19;

import modul2.interfaces2.MultiMap;

import java.util.*;

public class MultiMapImpls<K, V> implements MultiMap<K, V> {
    private HashMap<K, List<V>> multiMap = new HashMap<>();


    @Override
    public int countValues(K key) {
        if (multiMap.containsKey(key)) {
            List<V> values = multiMap.get(key);
            return values.size();
        } else
            return 0;
    }

    @Override
    public int size() {
        return multiMap.size();
    }

    @Override
    public boolean isEmpty() {
        return multiMap.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return multiMap.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        Set<K> kSet = multiMap.keySet();
        for (K key : kSet) {
            List<V> vList = multiMap.get(key);
            for (V values : vList) {
                if (values.equals(value)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public V get(Object key) {
        if (multiMap.containsKey(key)) {
            List<V> list = multiMap.get(key);

            return list.get(list.size() - 1);
        } else {
            return null;
        }
    }

    @Override
    public V put(K key, V value) {
        if (multiMap.containsKey(key)) {
            List<V> values = multiMap.get(key);
            values.add(value);
            multiMap.put(key, values);
        } else {
            ArrayList<V> values = new ArrayList<>();
            values.add(value);
            multiMap.put(key, values);
        }
        return value;
    }

    @Override
    public Iterator<V> valuesIterator(K key) {
        if (multiMap.containsKey(key)) {
            List<V> values = multiMap.get(key);
            return values.iterator();
        } else {
            ArrayList list = new ArrayList();
            return list.iterator();
        }
    }

    @Override
    public V remove(Object key) {
        List<V> list = multiMap.get(key);
        list.clear();
        return list.get(0);
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {
        for (K key : m.keySet()) {
            if (multiMap.containsKey(key)) {
                List<V> values = multiMap.get(key);
                values.add(m.get(key));
                multiMap.put(key, values);
            } else {
                ArrayList list = new ArrayList();
                list.add(m.get(key));
                multiMap.put(key, list);
            }
        }
    }

    @Override
    public void clear() {
        multiMap.clear();
    }

    @Override
    public Set<K> keySet() {
        return multiMap.keySet();
    }

    @Override
    public Collection<V> values() {
        ArrayList<V> allValues = new ArrayList<>();
        Set<K> keys = multiMap.keySet();
        for (K key : keys) {
            List<V> listValues = multiMap.get(key);
            allValues.addAll(listValues);
        }
        return allValues;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {

        return null;
    }
}
