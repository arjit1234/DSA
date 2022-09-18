package Strings;
import java.util.*;
public class AllSubString
{
	
//	public static void substring(String str)
//	{
//		for(int start=0;start<=str.length();start++)
//		{
//			for(int end=start+1;end<=str.length();end++)
//			{
//				System.out.println(str.substring(start,end));
//			}
//		}
//	}
	public static void substring1(String str)
	{
		for(int len=1;len<=str.length();len++)
		{
			for(int start=0;start<=str.length()-len;start++)
			{
				int end=start+len;
				System.out.println(str.substring(start,end));
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		substring1(str);
		
	}
}
