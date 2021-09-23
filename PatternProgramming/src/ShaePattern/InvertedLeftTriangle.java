package ShaePattern;
import java.util.Scanner;

public class InvertedLeftTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n :");
		int n = sc.nextInt();
		
		for(int i=0; i<=n-1; i++)
		{
			for(int j=0; j<=n-1; j++)
			{
				if(j<=i+1)
				{
					System.out.print("  ");
				}
				else
				{
					System.out.print("* ");
				}
			}
			System.out.println();
		}

	}

}
