    import java.sql.*;  
    class db3{  
    public static void main(String args[]){  
    try{  
    //step1 load the driver class  
    Class.forName("oracle.jdbc.driver.OracleDriver");  
      
    //step2 create  the connection object  
    Connection con=DriverManager.getConnection(  
    "jdbc:oracle:thin:@localhost:1521:xe","system","user123");  
      
    //step3 create the statement object  
    Statement stmt=con.createStatement();  
      
    //step4 execute query  
    stmt.executeQuery("insert into car2 values(2,'car1',23)");  
      
    //step5 close the connection object  
    con.close();  
      
    }catch(Exception e){ System.out.println(e);}  
      
    }  
    }  