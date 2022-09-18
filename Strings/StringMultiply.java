package Strings;
import java.math.BigInteger;
import java.util.*;
public class StringMultiply {

	static String multiply(String str1,String str2)
	{
		java.math.BigInteger n1=new java.math.BigInteger(str1);
		java.math.BigInteger n2=new java.math.BigInteger(str2);
		
		java.math.BigInteger ans=n1.multiply(n2);
		
		return ans.toString();
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		String ans=multiply(str1, str2);
		System.out.println(ans);
	}
}
