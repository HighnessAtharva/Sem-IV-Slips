class MyException extends Exception
{
	MyException()
	{
		super();
	}
	MyException(String str)
	{
		super(str);
		//Null error is passed to parametrized constructor of Exception class
		System.out.println("am in parametrized constructor");
	}
	public String getMessage()
	{
		return("a modified error message-"+super.getMessage());
	}
}
class MyDemoException
{
	public static void main(String args[])
	{
		try
		{
			System.out.println("am in try");
			int i=Integer.parseInt(args[0]);
			if(i<=0)
				throw new MyException("Null Error");
			int b=50/i;
			System.out.println("The value of b= "+b);
		}
		catch(MyException e)
		{
			System.out.println("am in exception-"+e.getMessage());
		}
		catch(Throwable e)
		{
			System.out.println("am in other exception"+e.getMessage());
		}
	}
}