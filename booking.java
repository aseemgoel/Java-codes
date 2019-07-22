public class booking{
void book(){

Scanner scan=new Scanner(System.in);
String name=scan.next();
int id=scan.nextInt();
int x=1124;
int total=10;
int seat=1;
System.out.println(b.name);
System.out.println(b.id);
System.out.println("seat no."+b.seat);
System.out.println("ticket no."+x);
seat=seat+1;
total=total-1;
}



public static void main(String args[]){
booking b=new booking();
b.book();


}
}