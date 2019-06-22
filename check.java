import java.util.*;
class ran{
public static int otp(){
int min=1000;
int max=9999;
Random r=new Random();
return r.nextInt((max-min)+1)+min;
}
}
public class check{
public static void main(String args[]){
ran ob=new ran();
System.out.println(ob.otp());
}
}