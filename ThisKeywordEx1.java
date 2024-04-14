import java.lang.*;
class Point {
int x;
int y;
Point ( int x, int y)
{
this.x = x;
this.y = y;
}
void displayPoint ( ) {
System.out.println ("The x value is " + x);
System.out.println ("The y value is " + y);
}
public static void main ( String arg [ ] ) {
Point point = new Point (10,20);
point. displayPoint ( );
}
} 