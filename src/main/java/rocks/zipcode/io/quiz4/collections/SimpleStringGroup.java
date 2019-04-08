package rocks.zipcode.io.quiz4.collections;

import java.util.*;
import java.util.function.Consumer;

/**
 * @author leon on 11/12/2018.
 */
public class SimpleStringGroup implements Iterable{
    List<String> strings;


    public SimpleStringGroup() {
        strings = new ArrayList<>();
    }

    public Integer count() {
        Integer count = 0;
        for (String string:strings) {
            count++;
        }
        return count;
    }

    public void insert(String string) {
        strings.add(string);
    }

    public Boolean has(String string) {
        return strings.contains(string);
    }

    public String fetch(int indexOfValue) {
        return strings.get(indexOfValue);
    }

    public void delete(String string) {
        strings.remove(string);
    }

    public void clear() {
        strings.clear();
    }

    @Override
    public Iterator iterator() {
        return strings.iterator();
    }

}
