package com.aca.week8.Homework06;

/*
Make the class generic.
Provide a generic DoublyLinkedNode class implementation.
Implement a method to find the given element and return its index.
Implement a method to find the given element and delete it.
Implement methods to add new elements a) at the beginning of the list, b) at the given index and c) at the end of the list.
Restrict duplicate data in the list.
 */

public class CustomDoublyLinkedList <E> {

    public static class DoublyLinkedNode<E> {
        private E element; // reference to the element stored at this node
        private DoublyLinkedNode<E> prev; // reference to the previous node in the list
        private DoublyLinkedNode<E> next; // reference to the subsequent node in the list

        public DoublyLinkedNode(E e, DoublyLinkedNode<E> p, DoublyLinkedNode<E> n) {
            element = e;
            prev = p;
            next = n;
        }
        public DoublyLinkedNode(E e, DoublyLinkedNode<E> n) {
            element = e;
            next = n;
        }

        public E getElement() {
            return element;
        }

        public DoublyLinkedNode<E> getPrev() {
            return prev;
        }

        public DoublyLinkedNode<E> getNext() {
            return next;
        }

        public void setPrev(DoublyLinkedNode<E> p) {
            prev = p;
        }

        public void setNext(DoublyLinkedNode<E> n) {
            next = n;
        }
    }

    private DoublyLinkedNode<E> header;
    private DoublyLinkedNode<E> trailer;
    private int size = 0;

    /**
     * Constructs a new empty list.
     */
    public CustomDoublyLinkedList() {
        header = new DoublyLinkedNode<>(null, null, null); // create header
        trailer = new DoublyLinkedNode<>(null, header, null); // trailer is preceded by header
        header.setNext(trailer); // header is followed by trailer
    }

    /**
     * Returns the number of elements in the linked list.
     */
    public int size() {
        return size;
    }

    /**
     * Tests whether the linked list is empty.
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Returns (but does not remove) the first element of the list.
     */
    public E first() {
        if (isEmpty())
            return null;

        return header.getNext().getElement(); // first element is beyond header
    }

    /**
     * Returns (but does not remove) the last element of the list.
     */
    public E last() {
        if (isEmpty())
            return null;

        return trailer.getPrev().getElement(); // last element is before trailer
    }
    // public update methods

    /**
     * Adds element e to the front of the list.
     */
    public void addFirst(E e) {
        addBetween(e, header, header.getNext()); // place just after the header
    }

    /**
     * Adds element e to the end of the list.
     */
    public void addLast(E e) {
        addBetween(e, trailer.getPrev(), trailer); // place just before the trailer
    }

    /**
     * Removes and returns the first element of the list.
     */
    public E removeFirst() {
        if (isEmpty())
            return null; // nothing to remove

        return remove(header.getNext()); // first element is beyond header
    }

    /**
     * Removes and returns the last element of the list.
     */
    public E removeLast() {
        if (isEmpty())
            return null; // nothing to remove

        return remove(trailer.getPrev()); // last element is before trailer
    }
    // private update methods

    /**
     * Adds element e to the linked list in between the given nodes.
     */
    private void addBetween(E e, DoublyLinkedNode<E> predecessor, DoublyLinkedNode<E> successor) {  // create and link a new node
        DoublyLinkedNode<E> newest = new DoublyLinkedNode<>(e, predecessor, successor);
        predecessor.setNext(newest);
        successor.setPrev(newest);
        size++;
    }

    /**
     * Removes the given node from the list and returns its element.
     */
    private E remove(DoublyLinkedNode<E> node) {
        DoublyLinkedNode<E> predecessor = node.getPrev();
        DoublyLinkedNode<E> successor = node.getNext();
        predecessor.setNext(successor);
        successor.setPrev(predecessor);
        --size;
        return node.getElement();
    }

    DoublyLinkedNode<E> insertNodeAtPosition(DoublyLinkedNode<E> head, E data, int position) {
        DoublyLinkedNode<E> curr = head;
        while(position > 1)
        {
            head = head.next;
            position--;
        }
        DoublyLinkedNode<E> newNode = new DoublyLinkedNode<E>(data, curr.next);
        newNode.next = head.next;
        head.next = newNode;

        return curr;

    }
    static void PrintDoublyLinkedList(DoublyLinkedNode<Integer> header)
    {
        while (header != null) {

            System.out.print(header.getElement() + " ");
            header = header.next;
        }
    }



}


