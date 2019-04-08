package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

/**
 * @author leon on 18/12/2018.
 */
public class SortedGroup<SomeType extends Comparable> extends Group<SomeType> {

    public SortedGroup(){
        super(new ArrayList<>());
    }

    @Override
    public void insert(Object value) {
        this.list.add((SomeType)value);
        list.sort(Comparator.naturalOrder());
    }

    @Override
    public void delete(Object value) {
        this.list.remove(value);
    }

    public Integer indexOf(SomeType value) {
        return list.indexOf(value);
    }
}
