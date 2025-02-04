/*
1)Write a program that shows the implementation of null pointer exception &array index out of bound exception using try catch finally blocks
2) Write a java program by creating a custom exception of your own */

class CannotPassEmptyNameException extends Exception
{
	//no-arg constr
	public CannotPassEmptyNameException()
	{
		super();
	}
	
	//param constr
	public CannotPassEmptyNameException(String name)
	{
		super(name);
	}
}


public class TestExceptions
{
	public static void printName(String name) throws CannotPassEmptyNameException
	{
		if(name == null) throw new NullPointerException("No null values allowed");
		else if(name.isBlank()) throw new CannotPassEmptyNameException("Empty strings cannot be passed. Please pass a non-empty string.");
		else
			System.out.println(name);
	}

	public static void main(String[] args)
	{
		System.out.println("main() starts => ");
		//implementation of NullPointerException(NPE)
		try
		{
			String str = null;
			System.out.println(str.charAt(0));
		}
		catch(NullPointerException e)
		{
			System.out.println("In NPE catch");
			e.printStackTrace();
		}
		finally
		{
			System.out.println("In finally block associated to NPE");
		}

		//implementation of ArrayIndexOutOfBoundsException(AIOOBE)
		try
		{
			System.out.println(args[0]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("In AIOOBE catch");
			e.printStackTrace();
		}
		finally
		{
			System.out.println("In finally block associated to AIOOBE");
		}

		//implementation of Custom Exception
		try
		{
			String str = " ";//blank string
			printName(str);
		}
		catch(CannotPassEmptyNameException e)
		{
			System.out.println("In CPENE catch msg = " + e.getMessage());
			e.printStackTrace();
		}
		finally
		{
			System.out.println("In finally block associated to CPENE");
		}
		System.out.println("main() ends => ");
	}

}