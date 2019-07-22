import java.util.*;
import java.sql.*;



//#########################create new################ add objects



class net{
void nex()throws Exception{
Scanner scan=new Scanner(System.in);

Class.forName("oracle.jdbc.driver.OracleDriver");  
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","user123");  
  
PreparedStatement ps=con.prepareStatement("insert into patient values(?,?,?,?,?,?)"); 

PreparedStatement ts=con.prepareStatement("insert into doctor values(?,?,?,?,?)");


String medrec="null";

System.out.println("enter email");
String email=scan.nextLine();
System.out.println("enter name");
String name=scan.nextLine();
System.out.println("enter dob");
String dob=scan.nextLine();
System.out.println("enter address");
String address=scan.nextLine();
System.out.println("enter phone");
int phone=scan.nextInt();
//System.out.println("enter medrec");
//String medrec=scan.nextLine();


ps.setString(1,email);
ps.setString(2,name);
ps.setString(3,dob);
ps.setString(4,address);
ps.setInt(5,phone);
ps.setString(6,medrec);




int i=ps.executeUpdate();

con.close();
}


void nex1()throws Exception{
Scanner scan=new Scanner(System.in);

Class.forName("oracle.jdbc.driver.OracleDriver");  
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","user123");  
  


PreparedStatement ts=con.prepareStatement("insert into doctor values(?,?,?,?,?)");

System.out.println("enter email");
String email=scan.nextLine();
System.out.println("enter name");
String name=scan.nextLine();
System.out.println("enter dob");
String dob=scan.nextLine();
System.out.println("enter address");
String address=scan.nextLine();
System.out.println("enter phone");
int phone=scan.nextInt();

ts.setString(1,email);
ts.setString(2,name);
ts.setString(3,dob);
ts.setString(4,address);
ts.setInt(5,phone);

int j=ts.executeUpdate();

con.close();
}
}








  
 

 
  
 



