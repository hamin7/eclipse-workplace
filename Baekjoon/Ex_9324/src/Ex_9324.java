import java.util.Scanner;

public class Ex_9324
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int t=0 ; t < testcase ; t++)
		{
			boolean answer = true;
			int[] word = new int['Z'+1];
			char[] str = sc.next().toCharArray();
			for(int i = 0; i < str.length; i++)
			{
				word[str[i] - 'A']++;
				if (word[str[i] - 'A'] == 3)
				{
					if (i == str.length - 1)
					{
						answer = false;
						break;
					}
					else if (str[i] != str[i+1])
					{
						answer = false;
						break;
					}
					word[str[i] - 'A'] -= 3;
					i++;
				}
			}
			if(answer)
			{
				System.out.println("OK");
			}
			else
			{
				System.out.println("FAKE");
			}
		}
	}
}