class EvenOddclainfo
{
	int val1;
	void getValue(int a)
	{
		val1=a;
	}
	void ope()
	{
		if(val1%2==0)
		{
			System.out.println("Value is Even");
		}
		else
		{
			if(val1<=0)
			{
				System.out.println("Value is Negative");
			}
			else
			{
				System.out.println("Value is Odd");
			}
		}
	}

}
class EvenOddcla 
{
	public static void main(String[] args) 
	{
		int len=args.length;
		if(len!=1)
		{
			System.out.println("Enter Integer value to fint out Even or Odd.");
		}
		else
		{
		int x=Integer.parseInt(args[0]);
		EvenOddclainfo m=new EvenOddclainfo();
		m.getValue(x);
		m.ope();
		}
	}
}
