import java.util.*;
public class Special_M {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n : ");
		int n = sc.nextInt();
		
		for(int i=0; i<=n-1; i++)
		{
			for(int j=0; j<=n-1; j++)
			{
				if(j==0 && i!=0 || j==n-1 && i!=0 || i==j && i<=n/2 && i!=0
						|| i+j==n-1  && i<=n/2 && i!=0 )
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
