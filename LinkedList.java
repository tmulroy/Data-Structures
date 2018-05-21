
public class LinkedList {

	Node head = null;

	public void addFirst(int value) {
		Node tmp = new Node(value);
		if (head == null) {
			head = tmp;
			head.next = null;
		} else {
			tmp.next = head;
			head = tmp;
		}
	}

	public void insert(int value) {}

	public void addLast(int value) {
		Node tmp = head;
		while(tmp.next != null) {
			tmp = tmp.next;
		}
		tmp.next = new Node(value);
		System.out.println("final node value" + tmp.next.value);
	}

	public static void main(String[] args) {
		LinkedList test = new LinkedList();
		test.addFirst(25);
		test.addFirst(37);
		test.addLast(100);
		test.addLast(500);
		System.out.println("first node is: " + test.head.value);
	}

}
