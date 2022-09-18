package Recursion;
import java.util.*;
public class CheckPalindrome
{
	
	public static boolean checkpalindrome(String s)
	{
		if(s.length()<=1)
		{
			return true;
		}
		if(s.charAt(0)==s.charAt(s.length()-1))
		{
			return checkpalindrome(s.substring(1,s.length()-1));
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		if(checkpalindrome(s))
		{
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
	}
}
