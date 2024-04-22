package com.example.project;

public class LinkedList {

    Node head, start;


    static class Node{
        int data;
        Node next;

        public Node(int entry){
            data = entry;
        }
    }

    static LinkedList insert(LinkedList list, int n){
        Node new_node = new Node(n);


        if(list.head == null){
            list.head = new_node;
            list.start = list.head;
        }else{
            while(list.head.next != null){
                list.head = list.head.next;
            }
            list.head.next = new_node;
        }
        list.head = list.start;

        return list;
    }

    static void printList(LinkedList list){
        while(list.head.next != null){
            System.out.print(list.head.data+ " ");
            list.head = list.head.next;
        }
        System.out.print(list.head.data+ " ");
        list.head = list.start;
    }

    public static void main(String[] args){
        LinkedList list = new LinkedList();

        list.insert(list, 4);
        list.insert(list, 5);
        list.insert(list, 6);
        list.insert(list, 7);

        printList(list);
    }
}
