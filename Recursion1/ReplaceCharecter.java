package Recursion1;
import java.util.*;
public class ReplaceCharecter {
	
	public static String replace(String str,char c1,char c2)
	{
		if(str.length()==1)
		{
			return str;
		}
		
		char x=str.charAt(0);
		
		if(str.charAt(0)==c1)
		{
			x=c2;
			str=c2+str.substring(1);
		}
		
		return x+replace(str.substring(1),c1,c2);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char c1=sc.next().charAt(0);
		char c2=sc.next().charAt(0);
		
		System.out.println(replace(str,c1,c2));
		
	}
}
