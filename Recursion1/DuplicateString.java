package Recursion1;
import java.util.*;
public class DuplicateString 
{
	
	public static String removeduplicate(String str)
	{
		if(str.length()==0)
		{
			return str;
		}
		String ans="";
		if(str.charAt(0)!='x')
		{
			ans+=str.charAt(0);
		}
		String smallans=removeduplicate(str.substring(1));
		return ans+smallans;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(removeduplicate(str));
	}
}
