package Recursion1;
import java.util.*;
public class RemoveX
{
	
	public static String removex(String s)
	{
		if(s.length()==0)
		{
			return "";
		}
		
		if(s.charAt(0)=='x')
		{
			return removex(s.substring(1));
		}
		return s.charAt(0)+removex(s.substring(1));
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String ans=removex(s);
		System.out.println(ans);
	}
}
