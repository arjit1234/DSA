package Recursion1;
import java.util.*;
public class ReplacePI 
{
	
	public static String replace(String input)
	{
		if(input.length()<=1)
		{
			return input;
		}
		String output;
		String small=replace(input.substring(1));
		if(input.charAt(0)=='P' && small.charAt(0)=='i')
		{
			output="3.14"+small.substring(1);
		}
		else {
			output=input.charAt(0)+small;
		}
		return output;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String res=replace(s);
		System.out.println(res);
	}
}
