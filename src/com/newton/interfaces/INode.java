package com.newton.interfaces;

import com.newton.resources.Node;

public interface INode {
    void setPrevious(Node node);
    Node getPrevious();
    void setNext(Node node);
    Node getNext();
    void setElement(Object element);
    Object getElement();
    String toString();
}
