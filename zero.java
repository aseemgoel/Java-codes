public class zero{
int x=10;
public static void main(String args[]){
try{
zero ob = new zero();
int y;
y=ob.x;
int z;
z=y/0;
System.out.println(z);
}
catch(ArithmeticException e){
System.out.println("Division by zero");
}
}
}