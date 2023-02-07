package week03;

public class CharOccurrance
{      
	public static void main(String[] args)
    {
		  String input="Hexaware";
			char[] charArray=input.toCharArray();
			int count=0;
			for(int i=0;i<charArray.length;i++)
			{
				
				if(charArray[i]=='e')
				{
					count++;
				}
			}
			System.out.println(count);
		}
	

    }


