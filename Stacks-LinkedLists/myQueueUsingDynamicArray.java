class myQueueUsingDynamicArray{

    private dynamicArray A;
    public int length = 0;
    //Other variables to be defined by student
    
    public myQueueUsingDynamicArray(){
        A = new dynamicArray();
        //Othe initializations to be done by student
    }
    
    //This method should return the number of elements in the queue
    public int getSize(){

        return A.getSize();
        //To be written by student
    }


    public boolean isEmpty() {


        if (length == 0) {return true;} else {return false;} 
    }



     public boolean isFull(){


        if (length==getSize()) {return true;} else {return false;} 
    }
    
    //This should implement the enqueue operation of Queue
    public void enqueue(int value){

        if (length<getSize()) {A.modifyElement(value,length) ; } else  {

      A.doubleSize();
      A.modifyElement(value,length);

     } ;

      length++ ;
        //To be written by student
    }
    
    //This should implement the dequeue operation of Queue
    //This method should throw an exception in case the queue is empty.
    public int dequeue() { 

         
        if (isEmpty()) {System.out.print("Array is empty");return -11111;}   else {


         int a = A.getElement(0); int r =1 ;
         while(r<length) {

            int u = A.getElement(r); A.modifyElement(u,r-1) ; r++ ;
         } ; 
         
         A.modifyElement(0,r-1);
         length -- ; 
         if (2*length < getSize()) {A.halveSize();} else {} ;
         return a ;} 

        //To be written by student
    }
}