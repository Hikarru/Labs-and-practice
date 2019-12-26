package com.company;

import java.util.Collection;

public interface IWaitList<T> {
    public void add (T element);
    public T remove();
    public boolean contains(T element);
    public boolean containsAll(Collection<T> c);
    public boolean isEmpty();
}
