package Stack;
import java.util.*;
public class IsBalanced
{
	
	public static boolean isBalanced(String expression)
	{
		Stack<Character> stack=new Stack<Character>();
		
		for(int i=0;i<expression.length();i++)
		{
			if(expression.charAt(i)=='(')
			{
				stack.push(expression.charAt(i));
			}
			else if(expression.charAt(i)==')')
			{
				if(stack.isEmpty())
				{
					return false;
				}
				
				char topchar=stack.pop();
				
				if(expression.charAt(i)==')' && topchar=='(')
				{
					continue;
				}else {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		if(isBalanced(str))
		{
			System.out.println("Balanced");
		}else {
			System.out.println("Not Balanced");
		}
	}
}
