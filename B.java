class A{
void one(){
System.out.println("1");
}
}
class B extends A{
void two(){
System.out.println("2");
}
public static void main(String args[]){
B ob=new B();
ob.one();
ob.two();
}
}
