/* Demonstrate the concept of method overriding|| Exp-18||exp date-23/09/24||*/
class A
{
void display()
{
System.out.println("class A");
}
}
class B extends A
{
void display()
{
System.out.println("class B");
}
}
class C extends A
{
void display()
{
System.out.println("class C");
}
}
class TestDemo
{
public static voidmain(String args[])
{
B ob = new B();
c ob2 = new C();
ob.display();
ob1.display();
}
}




