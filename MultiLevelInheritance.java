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
class z extends y
{
int c;
void show1()
{
c=2;
System.out.println(c);
}
}
class show_main1
{
public static void main(String args[])
{
z z1=new z();
z1.display();
z1.show();
z1.show1();

}
} 