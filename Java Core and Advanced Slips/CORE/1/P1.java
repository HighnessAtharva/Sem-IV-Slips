import java.io.*;
class P1
{
	public static void main(String args[])
	{
		try
		{
			int i;
			FileReader fr = new FileReader("dummy.txt");
			while((i=fr.read())!=-1)
			{
				char ch = (char)i; 
				if(Character.isLowerCase(ch)){
					System.out.println(ch +" "+ "is a loweracse Character.");
					ch = Character.toUpperCase(ch);
					System.out.println(ch);
				}
				else if(Character.isUpperCase(ch)){
					System.out.println(ch +" "+ "is an uppercase Character.");
					ch = Character.toLowerCase(ch);
					System.out.println(ch);
				}
				else if(Character.isDigit(ch)){
					System.out.println(ch +" "+ "is a digit.");
					System.out.println(ch);
				}
				else if(Character.isWhitespace(ch))
				{
					System.out.println(ch +" "+ "is a whitespace.");
				    System.out.println(ch);
				}
			}
		}
			catch(Exception e)
			{
				System.out.println("Exception found"+e.getMessage());
			}
		finally
		{
			System.out.println("Successful!!");
		}
	}
}