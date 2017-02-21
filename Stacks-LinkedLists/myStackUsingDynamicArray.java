
class myStackUsingDynamicArray{

    private dynamicArray A;
    public int length=0;
    //Other variables to be defined by student
    
    public myStackUsingDynamicArray(){
        A = new dynamicArray();
        //Othe initializations to be done by student
    }
    
    //This method should return the size of the stack
    public int getSize(){
        //To be written by student
        return A.getSize();
    }
    

    public int length() {

        return length;
    }


    public boolean isEmpty() {


        if (length == 0) {return true;} else {return false;} 
    }

    public boolean isFull(){


        if (length==getSize()) {return true;} else {return false;} 
    }
   


    //This should implement the push operation of stack
    public void push(int value){
     
     if (length()<getSize()) {A.modifyElement(value,length()) ; } else  {

      A.doubleSize();
      A.modifyElement(value,length());

     } ;

      length++ ;

        //To be written by student
    }


    public int Find(int k) throws Exception {
    
   return  A.getElement(k);


    }


    public int pop() throws Exception { 
             
       
        if (length==0) {System.out.print("Array is empty");return -11111;}  else {

         int j = (A.getElement(length-1)) ;
         length-- ;
         

        if (2*length < getSize()) {A.halveSize();} else {} ;

         return j; }

        //To be written by student
    }



    public void multipop(int k) throws Exception{

    if (length<k) { throw new Exception("Empty Array") ;} 
     else { int r = 1 ;


     	while (k>=r) {int g = pop();k--;} ;
     } ;

    
    
    //This should implement the pop operation of stack.
    //This method should throw an exception in case the stack is empty.
    }
    
    
}