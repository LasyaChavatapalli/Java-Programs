class x
{
int a;
void display()
{
a=0;
System.out.println(a);
}
}
class y extends x
{
int b;
void show()
{
b=1;
System.out.println(b);
}
}
class show_main
{
public static void main(String args[])
{
y y1=new y();
y1.display();
y1.show();
}
} 