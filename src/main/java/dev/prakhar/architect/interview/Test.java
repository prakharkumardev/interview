package dev.prakhar.architect.interview;

public class Test {
    // trie: Appple
    // trie: Appricot

    //tree A-A, A--b, A-c
    // 1 -> 2,3
    // 2 -> 4,5
    // 3 -> 6,7


    // Graph A->B->C->D


    //A, (BCD)


    // deadlock -> Pen is depnedent on paper
    //paper is dependent on pen
    //thread run pen, thread run paper
    //thread run paper, thread run pen

    class Pen{
       Pen pen ;
       Paper paper ;

       Pen(){
           this.pen = new Pen();
       }
    }

    class Paper{
        Paper paper ;
        Pen pen ;

        Paper(){
            this.paper = new Paper();

        }
    }

    class writeWithPen implements Runnable{

        final Pen pen;
        writeWithPen(Pen pen){
            this.pen = pen;
        }
        @Override
        public void run() {
            synchronized (pen) {
                synchronized (pen.paper) {
                    System.out.println("Writing with pen");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }

    class writeWithPaper implements Runnable{
        final Paper paper;
        writeWithPaper(Paper paper){
            this.paper = paper;
        }
        @Override
        public void run() {
            synchronized (paper) {
                synchronized (paper.pen) {
                    System.out.println("Writing with paper");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Test test = new Test();
        Pen pen1 = test.new Pen();
        Paper paper = test.new Paper();
        writeWithPen penObj = test.new writeWithPen(paper.pen);
        writeWithPaper paperObj = test.new writeWithPaper(pen1.paper);
        Thread thread1 = new Thread(penObj);
        Thread thread2 = new Thread(paperObj);
        thread1.start();
        thread2.start();
//        thread1.join();
//        thread2.join();
//        System.out.println("Done");

    }

    // SAGA - > {queries} - > ok, done, porcessing, failed
    // payent, pay mthe money, (), processing, -> failure,
    // amazon, flipkart

    //actuators-> IOC, beans

    // Dependency inject


    //class A{
    // obj class b = new B();
    // @autowired

    // }

    //car {
    //@autowired("Honda")
    // drive = new Honda();
    // }

    //@primaty
    //@quialifier




}


class test1{
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

            // 1->2->3-4
            //prev =1
            //head= 1

            Node head = node;
            Node prev = node;
            Node temp = null;
            while(head.next != null){
                temp = head.next;
                head.next = prev;
                prev = head;
                head = temp;
            }

        return head;
        }




        // prints content of double linked list
        void printList(Node node)
        {
            while (node != null) {
                System.out.print(node.data + " ");
                node = node.next;
            }
        }

        // Driver Code
        public void main(String[] args)
        {
            ReverseLinkedList list = new ReverseLinkedList();
            list.head = new Node(1);
            list.head.next = new Node(2);
            list.head.next.next = new Node(3);
            list.head.next.next.next = new Node(4);

            System.out.println("Given linked list");
            list.printList(head);
            head = list.reverse(head);
            System.out.println("");
            System.out.println("Reversed linked list ");
            list.printList(head);
        }


    }
}
