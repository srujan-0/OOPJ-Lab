public class  MultiCatch
{
	public static void main(String[] args) 
	{
		try
		{
			int a=args.length;
			System.out.println("a="+a);
			int b=42/a;
			int c[]={1};
			c[42]=100;
		}
		catch (ArithmeticException e)
		{
			System.out.println("Divide by 0 vjit;"+e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBounds;"+e);
		}
			catch(Exception e)
		{
		System.out.println("Divide by 0;"+e);
		}
		System.out.println("After try/catch blocks");
}
}
