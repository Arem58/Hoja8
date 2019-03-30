package com.company;

//Codigo copiado literal del libro de texto de la clase
public interface PriorityQueue<E> {
    E getFirst();
    // pre: !isEmpty()
    // post: returns the minimum value in priority queue

    E remove();
    // pre: !isEmpty()
    // post: returns and removes minimum value from queue

    void add(E value);
    // pre: value is non-null comparable
    // post: value is added to priority queue

    boolean isEmpty();
    // post: returns true iff no elements are in queue

    int size();
    // post: return the size of the vector
}
