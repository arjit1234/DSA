package ArrayList;
import java.util.*;
public class ArrayList1 
{
	public static void main(String[] args) {
		ArrayList<Integer> ar=new ArrayList<Integer>();
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(1,80);
		for(int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		for(int i=0;i<ar.size();i++)
		{
			
		}
	}
}
