package com.newton.interfaces;

import com.newton.resources.Node;

public interface IList {
    void addElement(Integer value);
    void addElement(Node node);
    void addElement(Node node, Integer index);
    void addElement(Integer value, Integer index);
    Node removeElement(Integer index);
    //Node removeElement(Object element);
    Node findElement(Object element);
    Node findElementByIndex(Node current_node, Integer index);
    Node firstSentinel();
    Node lastSentinel();
    boolean isEmpty();
    void print();
    Integer listLength();
    Node findMiddleNode(Node foward_node, Node backward_node);
}
