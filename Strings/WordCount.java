package Strings;
import java.util.*;
public class WordCount 
{
	public static int count(String str)
	{
		int wordcount=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				wordcount++;
			}
		}
		return ++wordcount;
		
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		int ans=count(str);
		System.out.println(ans);
	}
}
