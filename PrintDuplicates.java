package week03;

public class PrintDuplicates
{
	public static void main(String[] args)
	{
		int x[]= {22,23,33,22,45,56,45,33,67,89,76,54,67,89,70};
		int y=x.length;
		for(int i=0;i<y;i++)
			for(int j=i+1;j<y;j++)
			{
				if(x[i]==x[j])
					System.out.println(x[i]);
			}
	}

}
