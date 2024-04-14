class x
{
int a;
x()
{
a=0;
}
void display()
{
System.out.println(a);
}
}
class y extends x
{
int b;
y()
{
super();
b=1;
}
void display()
{
super.display();
System.out.println(b);
}
}
class super_main
{
public static void main(String args[])
{
y y1=new y();
y1.display();
}
}