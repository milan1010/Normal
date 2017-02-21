class myQueueUsingLinkedList<E> extends SinglyLinkedList{

    private SinglyLinkedList<E> L;
    int size = 0;
    public Node<E> head = null;
    public Node<E> tail = null;
    //Other variables to be defined by student
    
    public myQueueUsingLinkedList(){
        L = new SinglyLinkedList<>();
    }
    
    
    public int getSize(){
        return size ; 
        //To be written by student
    }


    public boolean isEmpty() { if (size==0) {return true;} else {return false;} }
    
    
    public void enqueue(E value){

        Node<E> newest = new Node<>(value, null);
        if (isEmpty())
        head = newest;
        else 
        tail.setNext(newest);
        tail = newest;
        size++;
       
    }
    
    
    public E dequeue(){

        if (isEmpty()) return null;
        E answer = head.getElement();
        head = head.getNext();
        size=size-1;
        if (size==0)
            tail = null;
            return answer;
     
    }
}