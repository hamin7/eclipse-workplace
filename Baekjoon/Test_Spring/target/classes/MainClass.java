import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

public class MainClass {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		String dolls ;
		dolls = sc.next();
		sc.close();
		
		System.out.println(dolls);     //
		
		
		int[] lion = new int[1000000];
		int m = 0;
		
		if(dolls.length() >0)
		{
			int l = -1, i = 0;
			do
			{
				l = dolls.indexOf("1", l + 1);
				lion[m] = l;
				m++;
				i++;
			}while(l+1 < dolls.length() && l != -1);
			for (i = 0; i < N; i++)
			{
				System.out.println("lion["+ i+ "]의 값 : " +lion[i]);
				if(lion[i]==-1)
				{
					break;
				}
			}
		}
		int count = StringUtils.countMatches(dolls,"1");
		
		System.out.println(count);
}
