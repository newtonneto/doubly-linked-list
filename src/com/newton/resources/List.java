package com.newton.resources;

import com.newton.interfaces.IList;

public class List implements IList {
    private Node first_sentinel;
    private Node last_sentinel;

    public List() {
        this.first_sentinel = null;
        this.last_sentinel = null;
    }

    @Override
    public void addElement(Node node) {
        if (this.isEmpty()) {
            this.first_sentinel = node;
            this.last_sentinel = node;
        } else if (this.last_sentinel == null) {
            this.last_sentinel = node;
            this.first_sentinel.setNext(node);
            this.last_sentinel.setPrevious(node);
        } else {
            this.last_sentinel.setNext(node);
            node.setPrevious(this.last_sentinel);
            this.last_sentinel = node;
        }
    }

    @Override
    public Node removeElement(Object element) {
        Node removed_element = this.findElement(element);

        if (removed_element != null) {
            removed_element.getPrevious().setNext(removed_element.getNext());
            removed_element.getNext().setPrevious(removed_element.getPrevious());
            removed_element.setPrevious(null);
            removed_element.setNext(null);
        }

        return removed_element;
    }

    @Override
    public Node findElement(Object element) {
        Node current_node = this.first_sentinel;
        Node finded_node = null;

        while (current_node != null) {
            if (current_node.getElement() == element) {
                finded_node = current_node;
                break;
            }
            current_node = current_node.getNext();
        };

        return finded_node;
    }

    @Override
    public Node firstSentinel() {
        return this.first_sentinel;
    }

    @Override
    public Node lastSentinel() {
        return this.last_sentinel;
    }

    @Override
    public boolean isEmpty() {
        return (this.first_sentinel == null);
    }

    @Override
    public void print() {
        Node current_node = this.first_sentinel;

        System.out.printf("[ ");
        while (current_node != null) {
            System.out.printf(" " + current_node.toString() + " ");
            current_node = current_node.getNext();
        }
        System.out.println(" ]");
    }

    @Override
    public Node achaNoDoMeio(Node forward_node, Node backward_node) {
        Node middle_node = null;

        if (middle_node == null && (forward_node != backward_node)) {
            return achaNoDoMeio(forward_node.getNext(), backward_node.getPrevious());
        } else {
            middle_node = forward_node;
        }

        return middle_node;
    }
}