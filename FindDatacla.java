class FindData
{
	int a,b,c;
	void set(int x,int y,int z)
	{
		a=x; b=y; c=z;
	}
	void ope()
	{
		if((a==b)&&(b==c)&&(c==a))
		{
			System.out.println("Entered Value are equal "+a+" "+b+" "+c);
		}
		else
		{
			 int big=a;
			if(big==b)
			{
				big=b;
			}
			if(big==c)
			{
				big=c;
			}
		}
		System.out.println("Entered Value are "+a+" "+b+" "+c);
	}
}
class FindDatacla
{
	public static void main (String a[])
	{
		FindData fd=new FindData();
		if(a.length==0)
		{
			System.out.println("Enter Three number to find which one is big.");
		}
		else
		{
			int s=Integer.parseInt(a[0]);
			int d=Integer.parseInt(a[1]);
			int e=Integer.parseInt(a[2]);
			fd.set(s,d,e);
			fd.ope();
		}
	}
}