package Strings;
import java.util.*;
public class Substring 
{
	
	
	public static void subs(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			System.out.println(str.substring(0,i+1));
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		subs(str);
	}
}
