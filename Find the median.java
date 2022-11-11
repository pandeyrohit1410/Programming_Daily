// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine();
            String[] S = s.split(" ");
            int[] v  = new int[n];
            for(int  i = 0; i < n; i++)
                v[i] = Integer.parseInt(S[i]);
            Solution ob = new Solution();
            int ans = ob.find_median(v);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int find_median(int[] v)
    {
        // Code here
        int temp,med,t;
        if(v.length==1)
            return v[0];
        if(v.length == 2)
            return (v[0]+v[1])/2;
        for(int i=0; i<v.length; i++)
        {
            for(int j=i+1; j<v.length; j++){
                if(v[i] >= v[j])
                {
                    temp = v[i];
                    v[i] = v[j];
                    v[j] = temp;
                }
            }
            
        }
        if(v.length % 2 == 0)
        {
            t = v.length/2;
            med = (v[t]+v[t-1])/2;
            // System.out.print(v[0] +" "+ v[1]+" "+ v[2]+" "+ v[3]+" "+ v[4] +" "+ v[5]+ ", ");
            return med;
        } 
        else{
            t = (v.length)/2;
            med = v[t];
            return med;
    }
}
}