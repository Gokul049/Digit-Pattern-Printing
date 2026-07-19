// WAJP TO PRINT FOUR IN PATTERN

class  Four
{
	public static void main(String[] args) 
	{
		int n = 5;
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j==n-1 || i==n/2 || (j==0 && i<n/2))
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
