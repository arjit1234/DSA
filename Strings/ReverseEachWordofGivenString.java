package Strings;
import java.util.Stack;
import java.util.*;
public class ReverseEachWordofGivenString {

	
	 static String reverse(String S)
	 {
	        // code here 
	        Stack<String> st=new Stack<String>();
	        String s="";
	        for(int i=0;i<S.length();i++)
	        {
	            if(S.charAt(i)!='.')
	            {
	                s+=S.charAt(i);
	            }
	            if(S.charAt(i)=='.')
	            {
	                st.push(s);
	                s="";
	            }
	        }
	        st.push(s);
	        String res="";
	        while(!st.empty())
	        {
	            String str=st.peek();
	            st.pop();
	            res+=str+".";
	            
	        }
	        // res.delete(res.length()-1);
	        return res.substring(0,res.length()-1);
	    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String res=reverse(str);
		System.out.println(res);
		
		
	}
}
