 
 abstract class A
{
abstract void callme();
void call()
{
System.out.println("HELLO");
}
}
class B extends A
{
void callme()
{
System.out.println("GOOD MORNING");
}
}
class abstractdemo
{
public static void main(String args[]){
B b=new B();
b.callme();
b.call();
}
}