

final class myBinaryNumber{
    private int[] N;
  
  private int size;
      
 public myBinaryNumber(int n){
        size = n;
        N = new int[size];
    }
    
  
 public myBinaryNumber(String S){
 size = S.length();
        N = new int[size];
       
      for(int i=0;i<size;++i){
 N[i] = Character.getNumericValue(S.charAt(size-1-i));
        }
    }
   
 public int getSize(){
   return(size);
    }
    
   
 public int getBit(int position){
 if(position >= size)return(0);
else return(N[position]);
}
    
    

 public void setBit(int position, int bit)throws Exception{
  if(position >= size || (bit != 0 && bit != 1))
{
System.out.println("Error in setting the bit. Please check the inputs: (" + position + ", " + bit + ")");
            throw new Exception();
        }
        else N[position] = bit;
    }
    
    

 public void printNumber(){
 for(int i = size-1;i>=0;--i){
System.out.print(N[i]);
}
 System.out.println();
    }
}