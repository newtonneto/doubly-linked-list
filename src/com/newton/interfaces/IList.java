package com.newton.interfaces;

import com.newton.resources.Node;

public interface IList {
    void addElement(Node node);
    Node removeElement(Object element);
    Node findElement(Object element);
    Node firstSentinel();
    Node lastSentinel();
    boolean isEmpty();
    void print();
    Node achaNoDoMeio(Node foward_node, Node backward_node);
}
