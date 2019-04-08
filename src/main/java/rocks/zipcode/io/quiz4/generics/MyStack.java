package rocks.zipcode.io.quiz4.generics;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class MyStack<SomeType> implements Iterable {
    List<SomeType> stack;

    public MyStack() {
        stack = new LinkedList<>();
    }

    public Boolean isEmpty() {
        return stack.isEmpty();
    }

    public void push(SomeType i) {
        stack.add(i);
    }

    public SomeType peek() {
        if(stack.isEmpty()){
            return null;
        }
        return stack.get(stack.size()-1);
    }

    public SomeType pop() {
        if(stack.isEmpty()){
            throw new EmptyStackException();
        }
        Object temp = stack.get(stack.size()-1);
        stack.remove(stack.size()-1);
        return (SomeType)temp;
    }

    @Override
    public Iterator iterator() {
        return stack.iterator();
    }
}
