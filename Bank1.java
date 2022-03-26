class Bank1
{
static int accountNumer=123212;
static int prinAmount=1000;

public static void amountdeposit(int depos)
{
int currentbalance=prinAmount+depos;
System.out.println("Amount Deposited:"+currentbalance);
}

public static void withdrawn(int withdr)
{
balancecheck(withdr);
int currentbalance=prinAmount-withdr;
System.out.println("Your Current Balance:"+currentbalance);
}

public static void balancecheck(int withdrAmount)
{
if(prinAmount==withdrAmount)
{
System.out.println("Please wait. Your transaction is processing");
}
else
{
System.out.println("No balance");
}
}

public static void main(String args[])
{
System.out.println("Account Number:"+Bank1.accountNumer);
Bank1.amountdeposit(2000);
Bank1.withdrawn(1000);
}
}