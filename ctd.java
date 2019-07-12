import java.util.*;
class mainthread extends Thread{
public void run(){
int i;
int t=10;
int[] arr;
arr =new int[6];
for(int c=0;c<6;c++){
t=t+10;
arr[c]=t;

}
for(i=0;i<6;i++)
{
System.out.println("value"+arr[i]);


}
}
}

public class ctd{
public static void main(String args[]){
mainthread ob=new mainthread();
mainthread oj=new mainthread();
ob.start();

oj.start();
System.out.println(System.currentTimeMillis());
}
}