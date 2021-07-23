package com.newton;

import com.newton.resources.List;
import com.newton.resources.Node;

public class Main {

    public static void main(String[] args) {
        List list = new List();
        Node node_1 = new Node(1);
        Node node_2 = new Node(2);
        Node node_3 = new Node(3);
        Node node_4 = new Node(4);
        Node node_5 = new Node(5);

        list.addElement(node_1);
        list.addElement(node_2);
        list.addElement(node_3);
        list.addElement(node_4);
        list.addElement(node_5);

        //Imprime a lista
        list.print();

        //Imprime as sentinelas
        System.out.println("First Element: " + list.firstSentinel().toString());
        System.out.println("Last Element: " + list.lastSentinel().toString());
        //Recebe o nó do meio
        long time_start = System.nanoTime();
        Node middle = list.achaNoDoMeio(list.firstSentinel(), list.lastSentinel());
        long time_end = System.nanoTime();
        System.out.println("Middle Node: " + middle + " - Execution Time: " + (time_end - time_start) + " nano seconds");

        Node node_6 = new Node(6);
        Node node_7 = new Node(7);
        Node node_8 = new Node(8);
        Node node_9 = new Node(9);

        list.addElement(node_6);
        list.addElement(node_7);
        list.addElement(node_8);
        list.addElement(node_9);

        //Imprime a lista
        list.print();

        //Imprime as sentinelas
        System.out.println("First Element: " + list.firstSentinel().toString());
        System.out.println("Last Element: " + list.lastSentinel().toString());
        //Recebe o nó do meio
        time_start = System.nanoTime();
        middle = list.achaNoDoMeio(list.firstSentinel(), list.lastSentinel());
        time_end = System.nanoTime();
        System.out.println("Middle Node: " + middle + " - Execution Time: " + (time_end - time_start) + " nano seconds");

        Node node_10 = new Node(10);
        Node node_11 = new Node(11);
        Node node_12 = new Node(12);
        Node node_13 = new Node(13);

        list.addElement(node_10);
        list.addElement(node_11);
        list.addElement(node_12);
        list.addElement(node_13);

        //Imprime a lista
        list.print();

        //Imprime as sentinelas
        System.out.println("First Element: " + list.firstSentinel().toString());
        System.out.println("Last Element: " + list.lastSentinel().toString());
        //Recebe o nó do meio
        time_start = System.nanoTime();
        middle = list.achaNoDoMeio(list.firstSentinel(), list.lastSentinel());
        time_end = System.nanoTime();
        System.out.println("Middle Node: " + middle + " - Execution Time: " + (time_end - time_start) + " nano seconds");

        //Busca um nó especifico pelo seu elemento armazenado
        Node finded_node = list.findElement(5);
        System.out.println("Finded Node: " + finded_node.toString());

        //Remove um nó especifico passando o seu elemento armazenado
        list.removeElement(5);
        list.print();
    }
}
