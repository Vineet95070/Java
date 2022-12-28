public class FinalKeyword
{
	public static void main(String[] args)
	{
		final int a = 20;
		//a=30 				gives an error because re-initialization of 'a'.
		System.out.println(a);        //gives output as '20'.
	}
}