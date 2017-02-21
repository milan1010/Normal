class myStackUsingLinkedList<E> extends SinglyLinkedList{

    private SinglyLinkedList<E> L;
    int size = 0;
    public Node<E> head = null;
    public Node<E> tail = null;
    //Other variables to be defined by student
    
    public myStackUsingLinkedList(){
        L = new SinglyLinkedList<>();
        //Other initializations to be done by student
    }
    
    //This method should return the size of the stack
    public int getSize(){
        return size;
        //To be written by student
    }

     public boolean isEmpty() { return size == 0; }
    
    //This should implement the push operation of stack
    public void push(E value){

        Node<E> newest = new Node<>(value, null);
        if (isEmpty())
        head = newest;
        else 
        tail.setNext(newest);
        tail = newest;
        size++;
        //To be written by student
    }
    
    //This should implement the pop operation of stack.
    //This method should throw an exception in case the stack is empty.
    public E pop() throws Exception{

        if (size==0) return null;
        E answer = tail.getElement();
        size = size-1; Node<E> x = head ; Node<E> y = x;
        while(x.getNext()!=null) { 
           y = x; 
           x = x.getNext() ;
        }
        tail = y;
        tail.setNext(null);
      
        if (size==0)
            tail = null;
           return answer ;
        //To be written by student
    }


    public void multipop(int k) throws Exception{


       if (size<k) { throw new Exception("Empty Array") ;} 
     else { int r = 1 ;


        while (k>=r) {E g = pop();k--;} ;
     } ;

    }
}