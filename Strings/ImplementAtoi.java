package Strings;
import java.util.*;
public class ImplementAtoi {

	
	public static int atoi(String str)
	{
		int ans=0;
		try {
			ans=Integer.parseInt(str);
		}
		catch(Exception e)
		{
			return -1;
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int ans=atoi(str);
		System.out.println(ans);
	}
}
