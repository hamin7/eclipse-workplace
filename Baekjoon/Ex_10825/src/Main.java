import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Info implements Comparable<Info>
{
	String name;
	int k;
	int e;
	int m;
	
	Info(String name, int k, int e,int m)
	{
		this.name=name;
		this.k=k;
		this.e=e;
		this.m=m;
	}
	
	@Override
	public int compareTo(Info that) 
	{
	
		if(this.k<that.k)
		{
			return 1;
		}else if(this.k==that.k)
		{
			if(this.e>that.e)
			{
				return 1;
			}else if(this.e==that.e)
			{
				if(this.m<that.m)
				{
					return 1;
				}else if(this.m==that.m)
				{
					
					if(this.name.compareTo(that.name)>0)
					{
						
						return 1;
					}
				}
			}
		}
		return -1;
	}
	@Override
	public String toString() 
	{
		return this.name;
	}
}
public class Main 
{

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int count=Integer.parseInt(br.readLine());
		Info[] human=new Info[count];
		
		for (int i = 0; i < count; i++) 
		{
			
			String[] temp=br.readLine().split(" ");
			human[i]=new Info(temp[0],Integer.parseInt(temp[1]),Integer.parseInt(temp[2]),Integer.parseInt(temp[3]));
		}
		
		Arrays.sort(human);
		StringBuilder sb=new StringBuilder();
		for (int i = 0; i <count; i++) 
		{
			sb.append(human[i]+"\n");
		}
		System.out.println(sb);
	}

}
