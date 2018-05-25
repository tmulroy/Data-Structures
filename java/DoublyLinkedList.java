public class DoublyLinkedList {



       Node head = null;



       public void addFirst(int value) {

             Node newNode = new Node(value);

             if (head == null) {

                    head = newNode;

                    newNode.prev = null;

                    newNode.next = null;

             } else {

                    Node temp = head;

                    head = newNode;

                    newNode.next = temp;

                    newNode.prev = null;

                    temp.prev = head;

                    temp.next = null;

             }

       }



       public void addLast(int value) {

             Node newNode = new Node(value);

             Node tmp = head;

             while (tmp.next != null) {

                    tmp = tmp.next;

             }

             tmp.next = newNode;

             newNode.prev = tmp;

             newNode.next = null;

       }

       public void insert(int value) {

             // ideally:

             // if zeroNodes()

             // if oneNode()

             // if multipleNodes()

             Node tmp = head;

             // Zero Nodes Exist

             if (tmp == null) {

                    addFirst(value);

             } else if (tmp.next == null) {

                    // One Node Exists

                    if (value <= tmp.value) {

                           addFirst(value);

                    } else {

                           addLast(value);

                    }

             } else {

                    // Two or more Nodes Exist

                    while (tmp.next != null) {

                           //insert into middle

                           if (tmp.value < value && tmp.next.value > value) {

                                 Node newNode = new Node(value);

                                  newNode.next = tmp.next;

                                  tmp.next.prev = newNode;

                                  tmp.next = newNode;

                                  newNode.prev = tmp;

                           }

                           tmp = tmp.next;

                    }

                    if (value > tmp.value) {

                           addLast(value);

                    }

             }

       }



       public void printValues() {

             Node tmp = head;

             while (tmp.next != null) {

                    System.out.println("Value: " + tmp.value);

                    tmp = tmp.next;

             }

              System.out.println("Value: " + tmp.value);

       }



       public static void main(String[] args) {

             // TODO Auto-generated method stub

             DoublyLinkedList test = new DoublyLinkedList();

             test.addFirst(10);

             test.insert(3);

             test.insert(5);

             test.insert(6);

             test.insert(4);

             test.insert(11);

             test.addLast(12);

             test.printValues();

       }



}
