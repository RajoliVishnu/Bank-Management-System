package bank.management.system;

import java.sql.*;

public class Con {
    Connection connection;
    Statement statement;


    public Con(){
       try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/banksystem","root","Vishnu@143");
           statement = connection.createStatement();





       }catch (Exception e){
           e.printStackTrace();
       }

   }
}
