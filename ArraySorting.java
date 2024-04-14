import java.util.Scanner;
class Sorting
{
public static void main(String args[])
{
int i, j, a, n;
int[] number=new int[30];
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of n \n");
n=sc.nextInt();
System.out.println("Enter the numbers \n");
for(i = 0; i < n; i++)
number[i]=sc.nextInt();
for(i = 0; i < n; i++)
{for(j = i + 1; j < n; ++j)
{
if (number[i] > number[j])
{
a = number[i];
number[i] = number[j];
number[j] = a;
}
}
}
System.out.println("The numbers arranged in ascending order are given below \n");
for(i = 0; i < n; ++i)
System.out.println( number[i]);
}
} 