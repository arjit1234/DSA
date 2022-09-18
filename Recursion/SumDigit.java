package Recursion;
import java.util.*;
public class SumDigit 
{
	
	public static int sumdigit(int input)
	{
		if(input<10)
		{
			return input;
		}
		
		int sum=(input%10)+sumdigit(input/10);
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ans=sumdigit(n);
		System.out.println(ans);
	}
}
