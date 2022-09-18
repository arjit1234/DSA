package ArrayList;
import java.util.*;
public class Vowel {
	
	public static void checkvowel(char str)
	{
		ArrayList<Character> st=new ArrayList<>();
		char arr1[]= {'a','e','i','o','u','A','E','I','O','U'};
		for(int i=0;i<arr1.length;i++)
		{
			st.add(arr1[i]);
		}
		
		if(st.contains(str))
		{
			System.out.println("Vowel");
		}else {
			System.out.println("Not Vowel");
		}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char input=sc.next().charAt(0);
		checkvowel(input);
	}
}
