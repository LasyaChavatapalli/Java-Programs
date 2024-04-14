class ThisReturn
{
private int i = 0;
ThisReturn increment()
{
i++;
return this ;
}
void print()
{
System.out.println ("The i value is " +  i);
}
public static void main (String arg[])
{
ThisReturn tr = new ThisReturn();
 tr.increment().increment().increment().increment().print();
}
}