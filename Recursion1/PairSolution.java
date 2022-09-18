package Recursion1;
import java.util.*;
public class PairSolution 
{
	
	public static String Pairstar(String str)
	{
		if(str.length()<=1)
		{
			return str;
		}
		String small=Pairstar(str.substring(1));
		if(str.charAt(0)==str.charAt(1))
		{
			small=str.charAt(0)+"*"+str.charAt(1)+small.substring(1);
		}else {
			small=str.charAt(0)+small;
		}
		return small;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String s=Pairstar(str);
		System.out.println(s);
	}
}
