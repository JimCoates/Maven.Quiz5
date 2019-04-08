package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author leon on 18/12/2018.
 */
public class Group<SomeType> implements Iterable, GroupInterface {
    List<SomeType> list;

    public Group() {
        this.list = new ArrayList<>();
    }

    public Group(List list){
        this.list = list;
    }

    public Integer count() {
        return list.size();
    }

    public SomeType fetch(int indexOfValue) {
        return list.get(indexOfValue);
    }

    public void clear() {
        list.clear();
    }

    public Iterator<SomeType> iterator() {
        return list.iterator();
    }

    @Override
    public void insert(Object string) {
        list.add((SomeType)string);
    }

    @Override
    public void delete(Object valueToInsert) {
        list.remove(valueToInsert);
    }

    @Override
    public Boolean has(Object valueToInsert) {
        return list.contains(valueToInsert);
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (Object thing:list) {
            builder.append(thing + ", ");
        }
        builder.replace(builder.length() -2, builder.length(), "]");
        return builder.toString();
    }
}
