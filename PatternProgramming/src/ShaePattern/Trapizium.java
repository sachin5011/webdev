package ShaePattern;
import java.util.Scanner;

public class Trapizium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter n :");
		int n = sc.nextInt();
		
		for(int i=0; i<=n-1; i++)
		{
//			loop to print inverted triangle
			for (int j=0; j<=n-1; j++)
			{
				if(j<=i)
				{
					System.out.print("  ");
				}
				else
				{
					System.out.print("* ");
				}
			}
			
//			loop to print solid square
			for(int k=0; k<=n-1 ;k++)
			{
				System.out.print("* ");
			}
			
//			loop to print left right triangle
			for (int l=0; l<=n-1; l++)
			{
				if(l<=i)
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
