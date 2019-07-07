class car{
abstract void id(int i);
}
class bike{
abstract void id(String c);
}
class transport extends car extends bike{
public void id(int i){
System.out.println(i);
}
public void id(String c){
System.out.println(c);
}
}
public class vehicle{
public static void main(String args[]){
transport ob = new transport();
ob.id(2);
}
}
