class commandTest 
{
	public static void main(String args[]) 
	{
		System.out.println("Lenght of String Argument:: "+args.length);//------ if we pass any argument then it will give us compile time error
		for
		(
			int i=0;
			i<args.length;
			i++
		)
		{
			System.out.println(args[i]);
		}
	}
}
