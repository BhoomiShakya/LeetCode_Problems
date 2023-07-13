//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isHappy(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution { 
  
     static int isHappy(int n) { 
         //code here
            int slow=n;
            int fast=n;
            do{
                slow=square(slow);
                fast=square(square(fast));
            }while(slow!=fast);
            
            if(slow==1){
                return 1;
            }
            return 0;
     }
     public static int square(int n){
         int sum=0;
         while(n>0){
             int rem=n%10;
             sum+=rem*rem;
             n=n/10;
         }
         return sum;
     }
}