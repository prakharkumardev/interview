package dev.prakhar.architect.interview;


public class ReverseLinkedList {

    static Node head;

    static class Node {

        int data;
        Node next;

        Node(int d)
        {
            data = d;
            next = null;
        }
    }


    Node reverse(Node node)
    {


        return node ;

    }

//    Node reverseRecurive(Node node){
//        if(node == null) return null;
//        if(node.next == null) return node;
//
//    }






    // prints content of double linked list
    void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    // Driver Code
    public static void main(String[] args)
    {
        ReverseLinkedList list = new ReverseLinkedList();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);

        System.out.println("Given linked list");
        list.printList(head);
        Node n = list.reverse(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList(n);
    }


}