class Add
{
public static int addition(int x, int y)
{
int sum=x+y;
System.out.println(sum);
return sum;
}
public static int addition(int x, int y, int z)
{
int sum=x+y+z;
System.out.println(sum);
return sum;
}
public static void main(String args[])
{
Add.addition(10,20,30);
Add.addition(10,20);

}

}