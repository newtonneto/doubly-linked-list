package com.newton.resources;

import com.newton.interfaces.INode;

public class Node implements INode {
    private Node previous_node;
    private Node next_node;
    private Object storaged_element;

    public Node(Object element) {
        this.previous_node = null;
        this.next_node = null;
        this.storaged_element = element;
    }

    @Override
    public void setPrevious(Node node) {
        this.previous_node = node;
    }

    @Override
    public Node getPrevious() {
        return this.previous_node;
    }

    @Override
    public void setNext(Node node) {
        this.next_node = node;
    }

    @Override
    public Node getNext() {
        return this.next_node;
    }

    @Override
    public void setElement(Object element) {
        this.storaged_element = element;
    }

    @Override
    public Object getElement() {
        return this.storaged_element;
    }

    @Override
    public String toString() {
        return this.storaged_element.toString();
    }
}
