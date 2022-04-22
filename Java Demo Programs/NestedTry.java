class NestedTry
{
	public static void main(String args[])
	{
		System.out.println("The prog starts...");
		int a=args.length;
		try
		{
			System.out.println("Inside outer try"+ a);
			int b=45/a;
			try
			{
				if(a==1)
					a=0;
				System.out.println("Inside the inner try"+a);
				b=45/a;
				int c[]={1};
				c[Integer.parseInt(args[0])]=5;
				
			}
			catch(ArithmeticException e)
			{
				System.out.println("arithmetic"+e.getMessage());
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("array out of bound"+e);
			}
			catch(Exception e)
			{
				System.out.println("exception caught"+e.getMessage());
			}
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("inside outer try arithmetic exception"+e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println("Exception caught"+e.getMessage());
		}
		System.out.println("the prog ends here....");
	}
}