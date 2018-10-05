import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < n; i++)
		{
			String input = sc.nextLine();
			int score, count;
			score = 0;
			count = 0;
			for (int j = 0; j < input.length(); j++)
			{
				if (input.charAt(j) == 'O')
				{
					score += ++count;
				}
				else
				{
					count = 0;
				}
			}
			System.out.println(score);
		}
	}
}