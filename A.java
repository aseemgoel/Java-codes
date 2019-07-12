public class A{
finalize void B(){System.out.println("garbage collection");
}
public static void main(String args[]){
A ob =new A();
ob.B();
}
}