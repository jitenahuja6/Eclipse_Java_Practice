package com.jiten.practice;

public class Divide {
	public  int divide(int dividend, int divisor) {
        // Edge cases
       // If the quotient is stictly greater than 2^31-1, return 2^31-1
       if((dividend == Integer.MIN_VALUE && divisor == -1) 
          || (dividend == Integer.MAX_VALUE && divisor == 1)){
           return Integer.MAX_VALUE;
       }
       
		// This is used to determine if the final result is -ve
       boolean isPositive = true;
       
       // If dividend and divisor have different symbols, the result is -ve
       if((dividend <0) ^ (divisor < 0)){
           isPositive = false;
       }
       
       
     
       
       // In order to not have to deal with numbers with different sings, lets convert
       // both divisor and dividend to integers
       
       dividend = dividend < 0 ? dividend : -1* dividend;
       divisor = divisor < 0? divisor: -1*divisor;
       
       // Each time we do a left shift of a number, it is same as doubling it
       // Similarly, a right shift equates to shrinking that number by half. 
       // The logic is
       // step1: for i in range(31,0):
       // step2:      is divisor * 2^i >= dividend? (Remmeber, both number are -ve)
       // step3:      Yes: dividend = dividend - divisor * 2^i
       // step4:     No: continue checking
       
       // One problem with that logic is the possibility of integer overflow in step 2.
       // Example:
       //  For the sake of simplicity, lets assume:
       //      int is a 8 bit signed integer (i.e. int holds values between 2^7-1 & -2^7 (i.e. 127 and -128)),
       //      Also assume, divisor = 3, dividend = 127
       //  Now, in step 2, 3 * 2 ^ 7 is 474 which greater than 127. 
       // So, we need to find the highest power of 2 that can prevent overflow instead of iterating from 31
       
       int highestPower = findHighestPower(divisor, dividend);
       
       int numMultiply = 0;
       for(int i=highestPower; i>=0; i--){
           
           if((divisor << i) >=  dividend){
               dividend = dividend - (divisor << i);
               numMultiply += (1<<i);
           }
           
       }
       
       if(isPositive){
           return numMultiply;
       }
       return -1*numMultiply;
       
       
   }
   
   int findHighestPower(int divisor, int dividend){
       
       // In order to find the highest power, keep doubling the dividend
       // as long as it is greater than half of divisor (Remember, both numbers are -ve). 
       // Because if you double after that, it is going to be less than divisor
       
       int halfDividend = dividend >>1;
       int highestPower = 0;
       while(divisor >= halfDividend){
           highestPower++;
           divisor = divisor << 1;
       }
       return highestPower;
       
   }
   
   public static void main(String[] args) {
	
	   int dividend = 25;
	   int divisor = 4;
	   Divide obj = new Divide();
	   int k = obj.divide(dividend, divisor);
	   System.out.println(k);
}

}