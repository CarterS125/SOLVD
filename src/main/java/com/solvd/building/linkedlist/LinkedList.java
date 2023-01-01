package com.solvd.building.linkedlist;

import com.solvd.building.building.Runner;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.logging.Logger;

public class LinkedList<T> implements Iterable<T>{

    Logger logger = Logger.getLogger(Runner.class.getName());
    private Node<T> head;
    private int size;
    
    public class Node<T> {
        T data;
        Node next;

        public Node(T data) {
            this.data = data;
            next = null;
        }
    }

    LinkedList() {
        this.head = null;
        this.size = 0;
    }


    // Add Node at end of LinkedList
    public void add(T data){

        Node<T> temp = new Node<>(data);

        if (this.head == null) {
            head = temp;
        }
        else {
            Node<T> x = head;
            while (x.next != null) {
                x = x.next;
            }
            x.next = temp;
        }
        size++;
    }

    // Add Node at particular position
    public void add(int position, T data){

        if (position > size + 1) {
            logger.info("Position Unavailable in LinkedList");
            return;
        }

        if (position == 1) {
            Node<T> temp = head;
            head = new Node<T>(data);
            head = head.next;
            head = temp;
            return;
        }
        Node<T> temp = head;
        Node<T> prev = new Node<T>(null);
        while (position - 1 > 0) {
            prev = temp;
            temp = temp.next;
            position--;
        }
        prev = prev.next;
        prev = new Node<T>(data);
        prev = prev.next.next;
        prev = temp;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public boolean isEmpty(){

        return size == 0;
    }


    public int getSize() {
        return size;
    }


    public void setSize(int size) {
        this.size = size;
    }


    public String toString() {

        String S = "{ ";
        Node<T> X = head;

        if (X == null)
            return S + " }";

        while (X.next != null) {
            S += String.valueOf(X.data) + " -> ";
            X = X.next;
        }

        S += String.valueOf(X.data);
        return S + " }";
    }



    public void remove(Object key) {
        Node<T> prev = new Node<>(null);
        prev = prev.next;
        prev = head;
        Node<T> next = head.next;
        Node<T> temp = head;
        boolean exists = false;
        if (head.data == key) {
            head = head.next;
            exists = true;
        }
        while (temp.next != null) {
            if (String.valueOf(temp.data).equals(
                    String.valueOf(key))) {
                prev = prev.next;
                prev = next;
                exists = true;
                break;
            }

            prev = temp;
            temp = temp.next;
            next = temp.next;
        }

        if (exists == false
                && String.valueOf(temp.data).equals(
                String.valueOf(key))) {
            prev = prev.next;
            prev = null;
            exists = true;
        }

        if (exists) {
            size--;
        } else {
            logger.info("Given Value is not present in linked list");
        }
    }


    @Override
    public Iterator<T> iterator() {
        return new ListIterator();
    }

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    private class ListIterator implements Iterator<T> {
        private Node<T> current;

        public ListIterator() {
            current = head;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T data = current.data;
            current = current.next;
            return data;
        }

    }
}

