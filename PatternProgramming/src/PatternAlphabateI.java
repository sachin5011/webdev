import java.util.Scanner;

public class PatternAlphabateI {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Eneter n : ");
		
		int n = sc.nextInt();
		
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
					System.out.print("  5");
				}
			}
			System.out.println();
		}

	}

}
