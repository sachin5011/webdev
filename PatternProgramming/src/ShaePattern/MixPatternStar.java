package ShaePattern;
import java.util.Scanner;

public class MixPatternStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n :");
		int n = sc.nextInt();
		
		for(int i=0; i<=n-1; i++)
		{
//			LOOP T PRINT *
			for(int j=0; j<=n-1; j++)
			{
				System.out.print("* ");
			}
			
//			LOOP TO PRINT $
			for(int k=0; k<=n-1; k++)
			{
				System.out.print("$ ");
			}
			
//			LOOP TO PRINT @
			for(int l=0; l<=n-1; l++)
			{
				System.out.print("@ ");
			}
			System.out.println();
		}

	}

}
