//wap input a number find the table of it,till that number.

class printTable_dowhile
{
	public static void main(String []args)
	{
		int i=1;
		do
		{
			int j=1;
			do
			{
				System.out.print((i*j)+" \t");
				j++;

			}while(j<=5);

		System.out.println();
		i++;

		}while(i<=10);
	}
}