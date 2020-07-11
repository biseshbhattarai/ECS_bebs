/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecs_102;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author xploiter
 */
public class Db {
     Statement stmt = null;
    Connection connection;

    public Db(){
        
    }
    public void connect(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver joined");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Event?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "");
            System.out.println("Connection established");
            stmt = connection.createStatement();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    
    public void create_user(int userid, String username , int level , String subject , String password){
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Event?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "");
            stmt = connection.createStatement();
            String sql = "INSERT INTO student VALUES (? , ? , ? , ? , ?, ?)";
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setInt(1, userid);
            pstmt.setString(2, username);
            pstmt.setInt(3, level);
            pstmt.setString(4, subject);
            pstmt.setString(5, password);
            pstmt.setBoolean(6, false);
            int i = pstmt.executeUpdate();
            System.out.println("User created");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //finally block used to close resources
            try {
                if (stmt != null)
                    connection.close();
            } catch (SQLException e) {
            }// do nothing
            try {
                if (connection != null)
                    connection.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        
    }
    

    public boolean check_user(int id){
        try{
         connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Event?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "");
         stmt = connection.createStatement();
         String sql = "SELECT * FROM student WHERE student_id="+id;
         ResultSet rs = stmt.executeQuery(sql);
         if(rs.next()){
             return true;
         }else{
             return false;
         }
     
        }catch(SQLException e){
            e.printStackTrace();
        }
        return false;
    }
   
    public boolean match_password(int userid , String password){
        try{
         connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Event?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "");
         stmt = connection.createStatement();
         String sql = "SELECT * FROM student WHERE student_id="+userid;
         ResultSet rs = stmt.executeQuery(sql);
         String actual_password = "";
         while(rs.next()){
             actual_password = rs.getString("password");
        }
        if (password.equals(actual_password)){
            return true;
            
        }else{
            return false;
        }
        }catch(SQLException e ){
            e.printStackTrace();
        }
        return false;
    }
    
   public void add_in_session(int userid){
       try{
         connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Event?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "");
         stmt = connection.createStatement();
         String sql = "INSERT INTO session VALUES (?)";
         PreparedStatement pstmt = connection.prepareStatement(sql);
         pstmt.setInt(1, userid);
         int i = pstmt.executeUpdate();
       }catch(SQLException e){
           e.printStackTrace();
       }
   }
   
   public void remove_from_session(){
        try{
         connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Event?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "");
         stmt = connection.createStatement();
         String sql = "DELETE FROM session";
         stmt.executeUpdate(sql);
       }catch(SQLException e){
           e.printStackTrace();
       }
   }
   
   public int fetch_from_session(){
        try{
         connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Event?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "");
         stmt = connection.createStatement();
         String sql = "SELECT * FROM session";
         ResultSet rs = stmt.executeQuery(sql);
         int id = 0;
         while(rs.next()){
             id = rs.getInt("student_id");
         }
         
         return id;
       }catch(SQLException e){
           e.printStackTrace();
       }
       return 0 ;
   }
   
   public String[] fetch_events(){
       String[] s = {"hello"};
       try{
         connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Event?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "");
         stmt = connection.createStatement();
         String sql = "SELECT * FROM program";
         ResultSet rs = stmt.executeQuery(sql);
         int organizer_id = 0 ; 
         String event_name = "" , location = "", timestamp="" , description="";
         int remaining_seats =0;
         
         while(rs.next()){
            organizer_id = rs.getInt("organizer_id");
            event_name = rs.getString("event_name");
            description = rs.getString("description");
            location = rs.getString("location");
            remaining_seats = rs.getInt("remaining_seats");
            timestamp = rs.getString("timestamp");
         }
        String s_organizer_id = Integer.toString(organizer_id);
        String s_remaining_seats = Integer.toString(remaining_seats);
        String[] data = {s_organizer_id, event_name , description , location , 
        s_remaining_seats, timestamp, "action"};
        return data;
       
       }catch(SQLException e){
           e.printStackTrace();
       }
       return s;
   }
   
   public void create_new_event(int organizer_id, String event_name , String description , String location , int remaining_seats, String timestamp){
     try{
         connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Event?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "");
         stmt = connection.createStatement();
         String sql = "INSERT INTO PROGRAM VALUES(? , ? , ? , ? , ? , ? )";
         PreparedStatement pstmt = connection.prepareStatement(sql);
         pstmt.setInt(1, organizer_id);
         pstmt.setString(2, event_name);
         pstmt.setString(3, description);
         pstmt.setString(4, location);
         pstmt.setInt(5, remaining_seats);
         pstmt.setString(6, timestamp);
         int i = pstmt.executeUpdate();
         
   }catch(SQLException e){
       e.printStackTrace();
   }
   }
   
    public boolean fetch_current_user_status(int id){
        try{
         connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Event?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "");
         stmt = connection.createStatement();
         String sql = "SELECT * FROM student WHERE student_id="+id;
         ResultSet rs = stmt.executeQuery(sql);
         Boolean status = false;
         while(rs.next()){
             status = rs.getBoolean("authorized");
         }
         if(status == true){
             return true;
         }
        }catch(SQLException e){
            e.printStackTrace();
            
        }
        return false;


    }
    
    public String[] get_single_user(int id){
         String s[] = {"s"};
         try{
         connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Event?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "");
         stmt = connection.createStatement();
         String sql = "SELECT * FROM student WHERE student_id="+id;
         ResultSet rs = stmt.executeQuery(sql);
         String student_id = "";
         String username = ""; String level = ""; String subject= "";
         Boolean authorized = false;
         String s_auth="";
         while (rs.next()){
             student_id = Integer.toString(rs.getInt("student_id"));
             username = rs.getString("username");
             level = Integer.toString(rs.getInt("level"));
             subject = rs.getString("subject");
             authorized = rs.getBoolean("authorized");
         }
         if (authorized== true){
             s_auth="true";
         }else{
             s_auth="false";
         }
         String data[] = {student_id, username , level , subject , s_auth};
         return data;
        }catch(SQLException e){
            e.printStackTrace();
            
        }
        return s;
    }
    
    public String[] get_single_event(String name){
        String s[] = {"s"};
         try{
         connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Event?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "");
         stmt = connection.createStatement();
         
         String sql = "SELECT * FROM program WHERE event_name = ?";
         PreparedStatement pstmt = connection.prepareStatement(sql);
         pstmt.setString(1, name);
         System.out.println(sql);
         ResultSet rs = pstmt.executeQuery();
         String organizer_id = "";
         String event_name = ""; String description = ""; String location= "";
         String remaining_seats = "";
         String timestamp = "";
         while (rs.next()){
             organizer_id = Integer.toString(rs.getInt("organizer_id"));
             event_name = rs.getString("event_name");
             description = rs.getString("description");
             location = rs.getString("location");
             remaining_seats = Integer.toString(rs.getInt("remaining_seats"));

             timestamp = rs.getString("timestamp");
         }
      
         String data[] = {organizer_id, event_name , description , location , remaining_seats , timestamp};
         System.out.println(data[0]);
         return data;
        }catch(SQLException e){
            e.printStackTrace();
            
        }
        return s;
    }
    public void delete_event(String name){
      try{
         connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Event?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "");
         stmt = connection.createStatement();
         String sql = "DELETE FROM program WHERE event_name=?";
         PreparedStatement pstmt = connection.prepareStatement(sql);
         pstmt.setString(1, name);
         pstmt.executeUpdate();
       }catch(SQLException e){
           e.printStackTrace();
       }
    }
    
    public void delete_user(int id){
       try{
         connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Event?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "");
         stmt = connection.createStatement();
         String sql = "DELETE FROM student WHERE student_id=?";
         PreparedStatement pstmt = connection.prepareStatement(sql);
         pstmt.setInt(1, id);
         pstmt.executeUpdate();
       }catch(SQLException e){
           e.printStackTrace();
       }
    }
    
    public void book_by_name(String event_name){
     try{
         connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Event?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "");
         stmt = connection.createStatement();
         String sql = "INSERT INTO booking VALUES(? , ? , ? , ? , ?)";
         PreparedStatement pstmt = connection.prepareStatement(sql);

         String[] data = get_single_event(event_name);
         int id = fetch_from_session();
         pstmt.setInt(1, id);
         pstmt.setString(2, event_name);
         pstmt.setString(3, data[2]);
         pstmt.setString(4, data[3]);
         System.out.println(data[0]);
         System.out.println(data[2]);

         int organizer = Integer.parseInt(data[0]);
         pstmt.setInt(5, organizer);
    
         pstmt.executeUpdate();
         
   }catch(SQLException e){
       e.printStackTrace();
   }
    }
    
   public String[] get_user_booking(){
              String[] s = {"hello"};
       try{
         connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Event?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "");

         stmt = connection.createStatement();
         int id = fetch_from_session();
         String sql = "SELECT * FROM booking WHERE booked_by="+id;
         ResultSet rs = stmt.executeQuery(sql);
         int booked_by = 0 ; 
         String event_name = "" , location = "", timestamp="" , description="";
         int organizer =0;
         
         while(rs.next()){
            booked_by = rs.getInt("booked_by");
            event_name = rs.getString("event_name");
            description = rs.getString("description");
            location = rs.getString("location");
            organizer = rs.getInt("organizer");
            
         }
        String s_booked_by = Integer.toString(booked_by);
        String s_organizer = Integer.toString(organizer);
        String[] data = {event_name, description , location , s_organizer};
        return data;
       
       }catch(SQLException e){
           e.printStackTrace();
       }
       return s;
   }
   
   public void delete_booking(String name){
      try{
         connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Event?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "");
         stmt = connection.createStatement();
         String sql = "DELETE FROM booking WHERE event_name=?";
         PreparedStatement pstmt = connection.prepareStatement(sql);
         pstmt.setString(1, name);
         pstmt.executeUpdate();
       }catch(SQLException e){
           e.printStackTrace();
       }
    }
   
}