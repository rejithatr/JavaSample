class Cons
{
static int c=0;
public static void count()
{
c++;
System.out.println(c);
}

public static void main(String args[])
{
Cons.count();
System.out.println(Cons.c);
Cons.count();
Cons.count();
Cons.count();
}
}