package week03;

public class Palindrome
{

	public static void main(String[] args) 
	{
		String x="malayalam";
		String y="";
		for(int i=x.length()-1;i>=0;i--)
			y=y+x.charAt(i);
	if(x.equals(y))
		System.out.println("the given word is palindrome");
	}
}
