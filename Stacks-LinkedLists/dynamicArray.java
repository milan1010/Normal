class dynamicArray{
    private int[] A;//Reference to the array that is maintained.
    private int arraySize;//This stores the size of the current array A
    
    public dynamicArray(){
        //Start with an array of size 1
        A = new int[1];
        arraySize = 1;
    }
    
    //This method should return the current size of the dynamic array
    public int getSize(){
        return(arraySize);
    }
    
    //This method should double the size of the array A and copy all
    //the previous elements in the first half of the array (of double size)
    public void doubleSize(){

         int size  = 2*arraySize;
         int[] B = new int[size];
         for(int i=0;i<arraySize;i++) {B[i]=A[i];};
         A=B;
         arraySize=size;
        //To be written by the student.
    }
    
    //This method should halve the size of the array by copying the first-half
    //in an array of half the size and ignoring the second-half
    public void halveSize(){

          int size = arraySize/2 ;
          int[] B = new int[size];
          for (int i=0;i<size;i++){B[i]=A[i];};
          	A=B;
            arraySize=size;
        //To be written by the student.
    }
    
    //This method should return the integer at array index "index"
    //If index exceeds the size of the array, then this
    //method should throw an exception
    public int getElement(int index) { int k=0;
    	try { 
           if (index<arraySize && index>=0) { k= A[index];} else {k= Integer.parseInt("Error");} 
    	} catch (Exception e) {System.out.println(e);}
             
        return k;
       
    	}
        //To be written by the student.
    
    
    //This method should write integer "value" in array location "index"
    //In case, "index" exceeds the size of the array, then this method should
    //throw an exception.
    public void modifyElement(int value, int index){
        //To be written by the student.


       	try {
           if (index<arraySize && index>=0) {A[index]=value;} else {} ;

       } catch (Exception e) {System.out.println(e);} ;
       
    }
}