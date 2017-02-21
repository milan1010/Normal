public class SinglyLinkedList<E>{ //---------------- nested Node class ----------------
public static class Node<E> {
public E element; // reference to the element stored at this node
public Node<E> next; // reference to the subsequent node in the list
public Node(E e, Node<E> n) {
	element = e;
	next = n;
}
public E getElement(){
return element;
}
public Node<E> getNext(){
return next;
}
public void setNext(Node<E> n){
next = n;
}
}
public Node<E> head = null;
public Node<E> tail = null;



} //----------- end of nested Node class -----------