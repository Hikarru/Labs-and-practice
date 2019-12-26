package com.company;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList<T> implements IWaitList<T> {
    protected ConcurrentLinkedQueue<T> content;

    WaitList()
    {
        content = new ConcurrentLinkedQueue<T>();
    }

    WaitList(Collection<T> c)
    {
        content = new ConcurrentLinkedQueue<T>();
        content.addAll(c);
    }

    @Override
    public String toString()
    {
        return "Queue: " + content;
    }

    public void add(T element) //добавдение в конец
    {
        content.add(element);
    }

    public T remove() //удаляет из начала
    {
        return content.poll();
    }

    public boolean contains(T element) //возвращает true/false существует эл в листе
    {
        return content.contains(element);
    }

    public boolean containsAll(Collection<T> c) //возвращает true/false существует эл-ты в листе
    {
        return content.containsAll(c);
    }

    public boolean isEmpty()//возвращает true/false пуст лист
    {
        return content.isEmpty();
    }
}
