package Recursion1;
import java.util.*;
public class ReverseString 
{
	public static void reverse(String []input)
	{
		int s=0;
		int e=input.length-1;
		while(s<=e)
		{
			String temp=input[s];
			input[s]=input[e];
			input[e]=temp;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String str[]=new String[n];
		for(int i=0;i<str.length;i++)
		{
			str[i]=sc.nextLine();
		}
		
		reverse(str);
		for(int i=0;i<str.length;i++)
		{
			System.out.print(str[i]);
		}
	}
}
	