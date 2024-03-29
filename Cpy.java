import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Cpy {

    public static void main(String[] args) {
        try
        {
            boolean create=true;
            Scanner Sc=new Scanner(System.in);

            System.out.print("Enter Source File Name:");
            String sfilename=Sc.next();
            File srcfile=new File(sfilename);
            if(!srcfile.exists())
            {
                System.out.println("File Not Found..");
            }
            else
            {
                FileInputStream FI=new FileInputStream(sfilename);
                System.out.print("Enter Target File Name:");
                String tfilename=Sc.next();
                File tfile=new File(tfilename);
                if(tfile.exists())
                {  
                    System.out.print("File Already Exist OverWrite it..Yes/No?:");
                    String confirm=Sc.next();
                    if(confirm.equalsIgnoreCase("yes"))
                    { 
                        create=true;
                    }
                    else 
                    {
                        create=false;  
                    } 
                }  
                if(create)
                {
                    FileOutputStream FO = new FileOutputStream(tfilename);
                    int b;
                    //read content and write in another file
                    while((b=FI.read())!=-1)
                    { 
                        FO.write(b);
                    }
                    System.out.println("\nFile Copied...");
                }
                FI.close();
            }
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}
