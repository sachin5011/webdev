package ShaePattern;
import java.util.Scanner;

public class MixPatternShapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n :");
		int n = sc.nextInt();
		
		for(int i=0; i<=n-1; i++)
		{
//			LOOP TO PRINT SOLID SQAUARE
			for(int j=0; j<=n-1; j++)
			{	
				System.out.print("* ");
			}
			System.out.print(" ");
			
//			LOOP TO PRINT LEFT RIGHT ANGLE TRIANGLE
			for (int k=0; k<=n-1; k++)
			{
				if(k<=i)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			
//			LOOP TO PRINT HOLLOW SQUARE
			for (int l=0; l<=n-1; l++)
			{
				if(i==0 || l==0 || i==n-1 || l==n-1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			
//			LOOP TO PRINT INVERTED RIGHT ANGLE TRIANGLE
			for (int m=0; m<=n-1; m++)
			{
				if(m<n-i)
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
