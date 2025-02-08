/** java program to maintain divided by Exception || Exp-20||Exp Date:- 21/10/24||**/
import java.io.*;
class exp20
{
	public static void main(String args[])
	{
		int a=5;
		int b=0;
		try
		{
			System.out.println(a/b);
		}
			catch(ArithmeticException e)
			{
				System.out.println("Divided by zero operation cannot possible");
			}

		}
	}

