import java.io.*;
import java.util.*;
import java.lang.*;

public class array {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int i=0;
        int count=0;
        int j=s.length();
        while(i!=j){
            char c = s.charAt(i);
            char d = s.charAt(j);
            if(c==d){
                count++;
            }
        }
        if(count==(j/2)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
    }
}



