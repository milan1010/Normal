

public class Mult4 extends binaryOperations{

private myBinaryNumber longMultiplication(myBinaryNumber N1, myBinaryNumber N2){
 

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
    
    



public myBinaryNumber multiplication(myBinaryNumber N1, myBinaryNumber N2){
   


myBinaryNumber A1,A2 ;
if (N1.getSize()>=N2.getSize()) {A1=N1;A2=N2;} else{A2=N1;A1=N2;} ;
 myBinaryNumber Z  ;
if ((A1.getSize()<=100) &&(A2.getSize()<=100)) { return longMultiplication(A1,A2);} 
else {
int i = 0 ; int k1 = A1.getSize() ;  int k2 = A2.getSize() ; int p1 ; int p2 ; 
if (k1%2 != 0) {p1= k1/2 + 1;} else{p1=k1/2;} ;if (k2%2 != 0) {p2= k2/2 + 1;} else{p2=k2/2 ;} ;
myBinaryNumber AL = new myBinaryNumber(p1) ; myBinaryNumber AR = new myBinaryNumber(k1/2) ; 
myBinaryNumber BL = new myBinaryNumber(p2) ; myBinaryNumber BR = new myBinaryNumber(k2/2) ; 
while(i<k1/2) { try {
 AR.setBit(i,A1.getBit(i)) ;  i++ ;} catch (Exception e) {System.out.println(e);};
} ; // while ends

int r=0;
while(i<k1) { try {
AL.setBit(r,A1.getBit(i)) ; i++ ;r++;} catch(Exception e) {System.out.println(e);} ; 
} ; //while ends

i=0;r=0;

while(i<k2/2) { try {
 BR.setBit(i,A2.getBit(i)) ;  i++ ;} catch (Exception e) {System.out.println(e);};
} ; // while ends

while(i<k2) { try {
BL.setBit(r,A2.getBit(i)) ; i++ ;r++;} catch(Exception e) {System.out.println(e);} ; 
} ; //while ends

 myBinaryNumber P,Q,R,S,T,U ;

P = multiplication(AL,BL);
Q = multiplication(AR,BR);
R = multiplication (addition(AL,AR),addition(BL,addZero(k1/2-k2/2,BR))) ;

S = addition(addZero(k1/2+k2/2,P),Q);
T = subtract(subtract(R,P),addZero(k1/2-k2/2,Q)) ;

return (addition(S,addZero(k2/2,T))) ; }

} ;



public myBinaryNumber subtract(myBinaryNumber X1, myBinaryNumber X2) {
int size1 = X1.getSize() ; int size2 = X2.getSize() ; 
myBinaryNumber X3 = new myBinaryNumber(size1) ; 
for (int i=0;i<size1 ; i++) { try {
if (X2.getBit(i)==0) {X3.setBit(i,X1.getBit(i)) ;}
else if (X1.getBit(i)==1) {X3.setBit(i,0);}
else { int k = i+1 ; 
while(X1.getBit(k) != 1) {X1.setBit(k,1);k++ ; } ; 
X1.setBit(k,0) ;  
X3.setBit(i,1) ; 
} ;  

} catch (Exception e) {System.out.println(e);} ;

} ;  
return X3 ; 

 } ;



public myBinaryNumber addZero(int u, myBinaryNumber N) {
int k = N.getSize() ; int r=0;
myBinaryNumber X = new myBinaryNumber(k+u);
try {
while(r<k) {X.setBit(u,N.getBit(r));r++ ; u++;} ;} catch (Exception e) {System.out.println(e);} ; 
return X ;
};
  



public boolean check(myBinaryNumber N) {
int k = N.getSize() ; 
int i = 1 ;
while(i<k){if (N.getBit(i)==1) {break ;} else {i++ ; } ; }
if (i==k) {return true ;} else {return false;} 
} ;




}