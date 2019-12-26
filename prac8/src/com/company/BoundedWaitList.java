package com.company;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class BoundedWaitList<T> extends WaitList<T> {
    private int capacity;

    BoundedWaitList(int capacity)
    {
        content = new ConcurrentLinkedQueue<T>();
        this.capacity = capacity;
    }

    public int getCapacity()
    {
        return capacity;
    }

    @Override
    public void add(T element) //добавление эл-ов в конец листа
    {
        if (capacity > content.size())
        {
            content.add(element);
        }
        else System.out.println("Can't add more elements");
    }
}
