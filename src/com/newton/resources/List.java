package com.newton.resources;

import com.newton.interfaces.IList;

public class List implements IList {
    private Node first_sentinel;
    private Node last_sentinel;
    private Integer length;

    public List() {
        this.first_sentinel = null;
        this.last_sentinel = null;
        this.length = 0;
    }

    @Override
    public void addElement(Integer value) {
        Node node = new Node(value);

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

        this.length++;
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

        this.length++;
    }

    @Override
    public void addElement(Node node, Integer index) {
        if (index < this.length) {
            Node current_node_in_index = findElementByIndex(this.first_sentinel, index);

            if (current_node_in_index != null) {
                Node previous_node = current_node_in_index.getPrevious();
                previous_node.setNext(node);
                current_node_in_index.setPrevious(node);
                node.setPrevious(previous_node);
                node.setNext(current_node_in_index);
            } else {
                System.out.println();
            }
        } else if (index == this.length) {
            this.last_sentinel.setNext(node);
            node.setPrevious(this.last_sentinel);
            this.last_sentinel = node;
        } else {
            System.out.println();
        }

        this.length++;
    }

    @Override
    public void addElement(Integer value, Integer index) {
        Node node = new Node(value);

        if (index < this.length) {
            Node current_node_in_index = findElementByIndex(this.first_sentinel, index);

            if (current_node_in_index != null) {
                Node previous_node = current_node_in_index.getPrevious();
                previous_node.setNext(node);
                current_node_in_index.setPrevious(node);
                node.setPrevious(previous_node);
                node.setNext(current_node_in_index);
            } else {
                System.out.println();
            }
        } else if (index == this.length) {
            this.last_sentinel.setNext(node);
            node.setPrevious(this.last_sentinel);
            this.last_sentinel = node;
        } else {
            System.out.println();
        }

        this.length++;
    }

    @Override
    public Node removeElement(Integer index) {
        Node removed_element = this.findElementByIndex(this.first_sentinel, index);

        if (removed_element != null) {
            this.remove(removed_element);
        }

        this.length--;

        return removed_element;
    }

//    @Override
//    public Node removeElement(Object element) {
//        Node removed_element = this.findElement(element);
//
//        if (removed_element != null) {
//            this.remove(removed_element);
//        }
//
//        this.length--;
//
//        return removed_element;
//    }

    private void remove(Node removed_element) {
        removed_element.getPrevious().setNext(removed_element.getNext());
        removed_element.getNext().setPrevious(removed_element.getPrevious());
        removed_element.setPrevious(null);
        removed_element.setNext(null);
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
    public Node findElementByIndex(Node current_node, Integer index) {
        if (index != 0) {
            return findElementByIndex(current_node.getNext(), --index);
        }

        return current_node;
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
    public Integer listLength() {
        return this.length;
    }

    @Override
    public Node findMiddleNode(Node forward_node, Node backward_node) {
        Node middle_node = null;

        if (middle_node == null && (forward_node != backward_node)) {
            return findMiddleNode(forward_node.getNext(), backward_node.getPrevious());
        } else {
            middle_node = forward_node;
        }

        return middle_node;
    }
}