package com.company;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class UnfairWaitList<T> extends WaitList<T> {
    UnfairWaitList()
    {
        content = new ConcurrentLinkedQueue<T>();
    }

    public void removeElement(T element) //удалить конкретный элемент
    {
        content.remove(element);
    }

    public void moveToBack() //перенести элемент из начала в конец
    {
        content.add(content.poll());
    }
}
