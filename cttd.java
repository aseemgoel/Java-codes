class mainthread extends Thread{
public void run(){
int i;
int[] arr;
arr =new int[6];
arr[0]=1;
arr[1]=1;
arr[2]=1;
arr[3]=1;
arr[4]=1;
arr[5]=1;
for(i=0;i<6;i++)
{
System.out.println("value"+arr[i]);


}
}
}

public class cttd{
public static void main(String args[]){
mainthread ob=new mainthread();
ob.start();
mainthread oj=new mainthread();
oj.start();
}
}