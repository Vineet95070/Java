//	Errors are of two types
//	1) Logical Error,  2) Syntex Error
//	* Exception error in Java

public class hello
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println("Using exception error in Java!");
		
			int a=5, b=0;
			int c=a/b;
		
			System.out.println(c);
		}

		catch(Exception e)
		{
			System.out.println("Wrong logic!");
		}

		finally
		{
			System.out.println("Finnaly!");
		}
	}
}