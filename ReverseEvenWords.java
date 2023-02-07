package week03;

public class ReverseEvenWords
{

       public static void main(String[] args)
       {   
    	   String y="";
    	   String text="my name is selvendran";
    	   String[] splitted=text.split(" ");
    	   for(int i=0;i<splitted.length;i++)
    	   {
    		   if(i%2!=0)
    		   {
    			String reverse="";
    			for(int j=splitted[i].length()-1;j>=0;j--)
    				reverse=reverse+splitted[i].charAt(j);
    			    System.out.print(reverse+" ");
    				
    		   }
    		   else
    		   {
    			   System.out.print(splitted[i]+" ");
    		   }
    	   }
	
       }
}
