package week03;

import java.util.Arrays;

public class Anagram 
{
	public static void main(String[] args) 
	{
		String text1="triangle";
		char x[]=text1.toCharArray();
		Arrays.sort(x);
		String text2="integral";
		char y[]=text2.toCharArray();
		Arrays.sort(y);
		int z=0;
			if(Arrays.equals(x,y))
					z=1;
		   if(z>0)
			   System.out.println("the words are anagram");
		   else
			   System.out.println("the words are not anagram");
			
		
	}

}
