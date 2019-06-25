import java.util.*;
public class ATM{
public static void main(String args[]){
try{
Scanner scan = new Scanner(System.in);
System.out.println("enter id");
        int id = scan.nextInt();
System.out.println("enter password");
int psswd = scan.nextInt();
System.out.println("Logged in successfully");
}
catch(InputMismatchException e){
System.out.println("Invalid vlues entered");
}
}
}
