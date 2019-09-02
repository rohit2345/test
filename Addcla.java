class Addcla
{ 
	public static void main(String a[])
	{
		int len=a.length;
		if(len==0)
		{
			System.out.println("Enter Any two Integer value to Calculate");
		}
		else
		{
		int x=Integer.parseInt(a[0]);
		int y=Integer.parseInt(a[1]);
		int z=x+y;
		System.out.println("Addition Result of given value= "+z);
		}
	}
}