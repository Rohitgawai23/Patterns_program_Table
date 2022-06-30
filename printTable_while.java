//wap input a number find the table of it,till that number.

class printTable_while
{
	public static void main(String []args)
	{
		int i=1;
		while(i<=10)
		{
			int j=1;
			while(j<=5)
			{
				
				System.out.print((i*j)+"\t");
				j++;
			}
		System.out.println();
		i++;

		}
	}
}