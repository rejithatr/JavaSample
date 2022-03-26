import java.util.Scanner;
class Dowhile
{
public static void main(String arg[])
{
int num1,num2;
 
int flag=1,sum;
int i=0;
Scanner in = new Scanner(System.in);
do
{
 
  	System.out.println("Enter a Number: ");
	num1= in.nextInt();
	System.out.println("Enter a Number: ");
	num2= in.nextInt();
sum=num1+num2;
System.out.println("Total: "+sum);
System.out.println("Do you want to continue(0/1): ");
flag= in.nextInt();
i++;

}
while(flag==1 && flag!=0);
{

}

}
}