package ShaePattern;
import java.util.Scanner;

public class ContiniousAlphabate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n :");
		int n = sc.nextInt();
		
		for(int i=0; i<=n-1; i++)
		{
//			LOOP T0 PRINT A
			for(int j=0; j<=n-1; j++)
			{
				if(i==0 || j==0 || j==n-1 || i==n/2)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			
//			LOOP TO PRINT B
			for(int k=0; k<=n-1; k++)
			{
				if(i==0 || k==0 || k==n-1 || i==n/2 || i==n-1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			
//			LOOP TO PRINT C
			for(int l=0; l<=n-1; l++)
			{
				if(i==0 && l!=n-1 || i==n-1 && l!=n-1 || l==0)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			
//			LOOP TO PRINT D
			for(int m=0; m<=n-1; m++)
			{
				if(i==0 || m==0 || m==n-1 || i==n-1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			
//			LOOP TO PRINT E
			for(int a=0; a<=n-1; a++)
			{
				if(i==0 && a!=n-1 || a==0 || i==n/2 && a!=n-1 || i==n-1 && a!=n-1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			
//			LOOP TO PRINT F
			for(int b=0; b<=n-1; b++)
			{
				if(i==0 && b!=n-1 || b==0 || i==n/2 && b!=n-1)
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
