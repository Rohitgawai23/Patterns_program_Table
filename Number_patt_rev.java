/*number patterns

1 2 3 4 5 
1 2 3 4              //  i=row  ,  j=colume
1 2 3 
1 2 
1

*/

class Number_patt_rev
{
	public static void main(String []args)
	{
		for(int i=5; i>=1; i--)
		{
			for(int j=1; j<=i; j++)
				System.out.print(j+" ");

			System.out.println();
		}
	}
}