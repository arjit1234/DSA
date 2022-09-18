package Recursion1;
import java.util.*;
public class RemoveDuplicate 
{
	
	public static String removeduplicate(String str)
	{
		if(str.length()<=1)
		{
			return str;
		}
		if(str.charAt(0)==str.charAt(1))
		{
			return removeduplicate(str.substring(1));
		}else {
			String small= removeduplicate(str.substring(1));
			return str.charAt(0)+small;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String ans=removeduplicate(str);
		System.out.println(ans);
	}
}
