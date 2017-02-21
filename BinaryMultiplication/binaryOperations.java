//THIS CLASS SHOULD BE USED AS IT IS AND SHOULD NOT BE MODIFIED IN ANY MANNER

abstract class binaryOperations{
    
    //Given an n-bit number and an m-bit number, the method below outputs a binary number
    //of size max{n, m}+1 which is the sum of the given numbers
    public myBinaryNumber addition(myBinaryNumber N1, myBinaryNumber N2){
        //Find the size of the numbers
        int size1 = N1.getSize();
        int size2 = N2.getSize();
        int size = size1;
        if(size2 > size1)size = size2;
        
        //Create an all 0's binary number of size size+1
        myBinaryNumber N = new myBinaryNumber(size+1);
        
        int position;
        int sum, carry = 0;
        for(position = 0; position < size;++position){
            sum = N1.getBit(position) + N2.getBit(position) + carry;
            try{
              N.setBit(position, sum%2);
            }catch(Exception e){e.printStackTrace();System.exit(0);}
            carry = sum/2;
        }
        try{
            N.setBit(position, carry);
        }catch(Exception e){e.printStackTrace();System.exit(0);}
        
        return(N);
    }
    

    public myBinaryNumber Short(myBinaryNumber N1) {
  
     int i = N1.getSize()-1; int j = 0;
     while(N1.getBit(i) !=1 && i>=0) {j++;i--;}; int r=0;
      myBinaryNumber z = new myBinaryNumber(N1.getSize()-j);
      try {
     while(r<N1.getSize()-j) {z.setBit(r,N1.getBit(r));r++;};} catch (Exception e) {System.out.println(e);}
     return z ;
    
    }


    public boolean Smaller(myBinaryNumber N1, myBinaryNumber N2) {
    myBinaryNumber z1,z2 ; 
    z1 = Short(N1);
    z2 = Short(N2);boolean e =false ;

    if(z1.getSize()<z2.getSize()) {e= true;}
    else if (z1.getSize()>z2.getSize()) {e= false;}
    else {

     int r1 = z1.getSize()-1 ; 

     while(r1>=0 ) {

     	if (z2.getBit(r1)==1 && z1.getBit(r1)==1) {r1-- ;e=false;} else if (z2.getBit(r1)==1) {e=true;break;} else if (z1.getBit(r1)==1) {e = false ; break;}
       else {r1--;e=false;} ;
     }
     } ; 

   
    return e ;
    }
    
    //Given an n-bit number and an m-bit number, the method below should return an
    //(n+m)-bit number which is the product of the given numbers.
    abstract myBinaryNumber multiplication(myBinaryNumber N1, myBinaryNumber N2);
}