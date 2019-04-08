package rocks.zipcode.io.quiz4.generics;

/**
 * @author leon on 18/12/2018.
 */
public interface GroupInterface<SomeType> extends Iterable<SomeType> {
    Integer count();

    Boolean has(SomeType valueToInsert);

    SomeType fetch(int indexOfValue);

    void insert(SomeType string);

    void delete(SomeType valueToInsert);

    void clear();
}
