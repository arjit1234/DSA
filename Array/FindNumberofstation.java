package Array;

import java.util.*;
import java.io.*;
import java.lang.*;

class FindNumberofstation
{
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   int n=sc.nextInt();
	   int arr[]=new int[n];
	   for(int i=0;i<n;i++)
	   {
		   arr[i]=sc.nextInt();
	   }
	   int dep[]=new int[n];
	   for(int i=0;i<n;i++)
	   {
		   arr[i]=sc.nextInt();
	   }
	   int ans=findPlatform(arr, dep, n);
	   System.out.println(ans);
   }
    static int findPlatform(int arr[], int dep[], int n)
    {
        // add your code here
        
        sort(arr);
        sort(dep);
        int count=0;
        int ans=0;
        int i=0,j=0;
        while(i<n)
        {
            if(arr[i]<=dep[j])
            {
                count++;
                ans=Math.max(ans,count);
                i++;
            }
            else if(arr[i]>dep[j]){
                count--;
                j++;
            }
        }
        return ans;
        
    }
    
    static void sort(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    
    
}





