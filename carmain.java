class car{
int a;
double b;
car(int a){
System.out.println(a);
}
car(double b){
System.out.println(b);
}
car(){
System.out.println("nothing");
}
}
public class carmain{
public static void main(String args[]){
car ob = new car();
car ob1 = new car(10.2);
car ob2 = new car(7);
}
}

