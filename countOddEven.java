//Initial Template for Java

import java.io.*;
import java.util.*;


 // } Driver Code Ends


//User function Template for Java

/*Class Geeks with countOddEven() as its member function
* a : input array
* n : size of array
*/
class Geeks{
    static void countOddEven(int a[], int n){
        
        // Your code here
        int ctr_even=0;
        int ctr_odd=0;
        for(int i=0; i<a.length; i++){
            if(a[i]%2==0){
              ctr_even++;
            }
           else{
               ctr_odd++;
           }
        }
       
        System.out.print(ctr_odd);
        System.out.print(" ");
         System.out.print(ctr_even);
         System.out.println();
        
        
    }
}

// { Driver Code Starts.


class GFG {
    
    // Driver code
	public static void main (String[] args) {
	    
	    // Taking input using scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking count of testcases
		int testcase = sc.nextInt();
		
		while(testcase-- > 0){
		    
		    //taking size of arary
		    int sizeof_array = sc.nextInt();
		    
		    //creating an array
		    int a[] = new int[sizeof_array];
		    
		    //inserting elements in the array
		    for(int i = 0;i<sizeof_array;i++){
		        a[i] = sc.nextInt();
		    }
		    
		    //creating an object of class Geeks
		    Geeks obj = new Geeks();
		    
		    //calling countOddEven() method
		    //of class Geeks
		    obj.countOddEven(a, sizeof_array);
		}
		
	}
}
  // } Driver Code Ends