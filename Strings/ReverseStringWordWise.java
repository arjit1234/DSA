package Strings;
import java.util.*;
public class ReverseStringWordWise 
{
	
	public static String reversestring(String str)
	{
		String result=" ";
		int i=str.length()-1;
		int end=str.length();
		while(i>=0)
		{
			if(str.charAt(i)==' ')
			{
				result=result+str.substring(i+1,end)+" ";
				end=i;
			}
			i--;
		}
		result+=str.substring(i+1,end);
		return result;
	}
	
	public static void main(String[] args) {
		
		String str="abc def ghi jkl";
		String ans=reversestring(str);
		System.out.println(ans);
	}
}
