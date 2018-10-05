import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		String str = sc.next();
		int cnt = 0;
		for (int i = 0; i < str.length(); i++)
		{
			if (str.charAt(i)=='L')
			{
				i++;
				cnt++;
			}
		}
		if (cnt > 0)
		{
			System.out.println(l - (cnt - 1));
		}
		else
		{
			System.out.println(l);
		}
	}
}