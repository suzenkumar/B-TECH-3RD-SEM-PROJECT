/* Demonstrate the concept of method overloading|| Exp-17||exp date-23/09/24||*/
class overloadDemo
{
int add(int p,int q)
{
return (p+q);
}
float.add(float x,float y)
{
return(x+y);
}
int add(int m,int n,it z)
{
return(m+n+z);
}
}
class Test
{
	public static void main(string args[])
	{
		overloadDemo ob=new overloadDemo();
		int s;
		s = ob.add(5,0);
		System.out.println("sum"+3);
		float.s1;
		s1 = ob.add(2.3f,5.2f);
		System.out.println("sum ="+s1);
		s = ob.add(3,4,9);
		System.out.println("sum ="+s);
	}
}