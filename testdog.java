class animal{
public void move(){
System.out.println("animal can move");
}
}
class dog extends animal{
public void move(){
System.out.println("dogs can move");
}
}
public class testdog{
public static void main(String args[]){
//animal a=new animal();
animal a=new dog();
a.move();
//b.move();
}
}