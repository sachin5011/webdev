import java.util.Scanner;

public class PatternName {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n : ");
		int n = sc.nextInt();
		
//		loop for printing s
		for(int i=0; i<=n-1; i++)
		{
			for(int j=0; j<=n-1; j++)
			{
				if(i==0 || j==0 && i<=n/2 || i==n-1 || j==n-1 && i>=n/2 || i==n/2)
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
		System.out.println();
		
//		loop for printing o
		for(int i=0; i<=n-1; i++)
		{
			for(int j=0; j<=n-1; j++)
			{
				if(i==0 || j==0 || i==n-1 || j==n-1)
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
		System.out.println();
		
//		loop for printing n
		for(int i=0; i<=n-1; i++)
		{
			for(int j=0; j<=2*n-1; j++)
			{
				if(j==0 || j==n-1 || j==i)
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
		System.out.println();
		
//		loop for printing i
		for(int i=0; i<=n-1; i++)
		{
			for(int j=0; j<=n-1; j++)
			{
				if(i==0 || i==n-1 || j==n/2)
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
//		loop to print space
		for(int i=0; i<=3; i++)
		{
			System.out.println();
		}
		
//		loop to print I
		for(int i=0; i<=n-1; i++)
		{
			for(int j=0; j<=n-1; j++)
			{
				if(i==0 || i==n-1 || j==n/2)
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
		
//		loop to print space
		for(int i=0; i<=3; i++)
		{
			System.out.println();
		}
		
//		loop to print L
		for(int i=0; i<=n-1; i++)
		{
			for(int j=0; j<=n-1; j++)
			{
				if(j==0 || i==n-1)
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
		System.out.println();
		
//		loop to print O
		for(int i=0; i<=n-1; i++)
		{
			for(int j=0; j<=n-1; j++)
			{
				if(i==0 || j==0 || i==n-1 || j==n-1)
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
		System.out.println();
		
//		loop to print V
		for(int i=0; i<=n-1; i++)
		{
			for(int j=0; j<=n-1; j++)
			{
				if(j==0 && i<=n/2 || i-j==(n/2)-1 || j==n-1 && i<=n/2 || i+j==n-1)
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
		System.out.println();
				
//		loop to print E
		for(int i=0; i<=n-1; i++)
		{
			for(int j=0; j<=n-1; j++)
			{
				if(i==0 || j==0 || i==n-1 || i==n/2)
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
		

//		loop for space
		for(int i=0; i<=3; i++)
		{
			System.out.println();
		}
		
//		loop to print Y
		for(int i=0; i<=n-1; i++)
		{
			for(int j=0; j<=n-1; j++)
			{
				if(j==n/2 && i>=n/2 || i==j && i<=n/2 || i+j==n-1 && i<=n/2)
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
		
//		loop for space
		for(int i=0; i<=3; i++)
		{
			System.out.println();
		}
		
//		loop to print 0
		for(int i=0; i<=n-1; i++)
		{
			for(int j=0; j<=n-1; j++)
			{
				if(i==0 || j==0 || i==n-1 || j==n-1)
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
		System.out.println();
		
//		loop to print U
		for(int i=0; i<=n-1; i++)
		{
			for(int j=0; j<=n-1; j++)
			{
				if(j==0 || i==n-1 || j==n-1)
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
