class Clockclainfo
{
	int min,h,m;
	void set(int x)
	{
		min=x;
	}
	void ope()
	{
		if(min<=0)
		{
			System.out.println("Enter Positive Value to convert second into hour.");
		}
		else
		{
			h=min/60;
			m=min%60;
		}
	}
	void disp()
	{
		System.out.println("Time in Second is= "+min);
		System.out.println("Conversion of Second into Hour.");
		System.out.println(h+" Hour "+m+" min ");
	}
}
class Clockcla
{
	public static void main(String a[])
	{
		Clockclainfo cs=new Clockclainfo();
		if(a.length==0)
		{
			System.out.println("Enter Integer value to Conversion of Second into Hour.");
		}
		else
		{
		int ar=Integer.parseInt(a[0]);
		cs.set(ar);
		cs.ope();
		cs.disp();
		}
	}
}