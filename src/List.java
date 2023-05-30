

public class List {
	Node head; // Первый элемент списка
	Node tail; // Последний элемент списка


	public class Node {
		int value;
		Node next; // Следующее значение
		Node previous; // Предидущее значение
	}


	 // Разворот связного списка


	public void revert() {
		Node currentNode = head;
		while (currentNode != null) {
			Node next = currentNode.next;
			Node previous = currentNode.previous;
			currentNode.next = previous;
			currentNode.previous = next;
			if (previous == null) {
				tail = currentNode;
			}
			if (next == null) {
				head = currentNode;
			}
			currentNode = next;
		}
	}
}




