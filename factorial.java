import java.util.Scanner
class factorial
{
  public static void main(String args[])
{
    Scanner obj =new Scanner (System.in);
    System.out.println("enter the number");
    int n = obj.nextint();
try{
if (n>1)
{
     int result = factorial(n);
     System.out.println("The factorial of "  + n + " is " + result);
}
else
{
throw new exception("0! is equal to 1");
}
}
catch (exception e )
{
System.out.println("1");
}
}
public static int factorial (int n)
{
int result=1;
for (int i=1;i<=n;i++)
{
result =result*i

