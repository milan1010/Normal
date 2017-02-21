

public class Mult1 extends binaryOperations{
    
   
 public myBinaryNumber multiplication(myBinaryNumber N1, myBinaryNumber N2){
  

myBinaryNumber A2 ;
int size1 = N1.getSize() ; int size2 = N2.getSize() ; int size = size1 ; 
myBinaryNumber N3 = new myBinaryNumber(2*size2);
if(size2>size1) {
 A2 = new myBinaryNumber(size2);
int k = 0; 
while(k<size1) {
if(N1.getBit(k)==0) { } else {N3 = addition(N3,addZero(k,N2));} ; 
k++ ;
} ; 

} else {

A2 = new myBinaryNumber(size1);
int k = 0; 
while(k<size2) {
if(N2.getBit(k)==0) { } else {N3 = addition(N3,addZero(k,N1));} ; 
k++ ;
} ; 
} ; 

return N3 ; 

 }



public myBinaryNumber addZero(int u, myBinaryNumber N) {
int k = N.getSize() ; int r=0;
myBinaryNumber X = new myBinaryNumber(k+u);
try {
while(r<k) {X.setBit(u,N.getBit(r));r++ ; u++;} ;} catch (Exception e) {System.out.println(e);} ; 
return X ;
};


public myBinaryNumber reverse(myBinaryNumber N) {
int k = N.getSize()-1 ; 
int i = 0 ; 
try {
while(i<k) {
int a = N.getBit(i) ; int b = N.getBit(k) ; 
N.setBit(i,b) ; N.setBit(k,a) ; i++ ; k-- ; 
} ; } catch(Exception e) {System.out.println(e);}
return N ;
} ; 


}