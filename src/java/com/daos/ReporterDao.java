/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daos;
 
import com.beans.Reporter;
import com.beans.Reporter;
import com.Pool.ConnectionPool;
import com.sun.org.apache.regexp.internal.REProgram;
import java.sql.*;
import java.util.ArrayList;


public class ReporterDao {
    public boolean  add(Reporter reporter){
       boolean status=false;
       ConnectionPool cp = ConnectionPool.getInstance();
       cp.initialize();
       Connection con = cp.getConnection();
       if(con!=null){
        try{
            String sql = "Insert into reporter(name,dob,gender,contact,email,address, image,userid,password, status)values(?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement smt = con.prepareStatement(sql);
            smt.setString(1, reporter.getName());
            smt.setString(2, reporter.getDob());
            smt.setString(3, reporter.getGender());
            smt.setString(4, reporter.getContact());
            smt.setString(5, reporter.getEmail());
            smt.setString(6, reporter.getAddress());
            smt.setString(7,reporter.getPhoto());
            smt.setString(8, reporter.getUserid());
            smt.setString(9, reporter.getPassword());
             smt.setString(10, reporter.getStatus());
            if(smt.executeUpdate()>0)
                status=true;
            smt.close();
            cp.putConnection(con);
        }   catch(Exception e){
            System.out.println("Database Error :"+ e.getMessage());
        }
       }
       
    return status;
   }
   
   
   
   public boolean  remove(int id){
       boolean status=false;
       ConnectionPool cp = ConnectionPool.getInstance();
       cp.initialize();
       Connection con = cp.getConnection();
       if(con!=null){
        try{
            String sql = "Delete from reporter where id=?";
            PreparedStatement smt = con.prepareStatement(sql);
            smt.setInt(1, id);
            
            if(smt.executeUpdate()>0)
                status=true;
            smt.close();
            cp.putConnection(con);
        }   catch(Exception e){
            System.out.println("Error :"+e.getMessage());
        }
       }
       
    return status;
   }
   
   public Reporter  getById(int id){
      Reporter reporter=null;
       ConnectionPool cp = ConnectionPool.getInstance();
       cp.initialize();
       Connection con = cp.getConnection();
       if(con!=null){
        try{
            String sql = "select * from reporter where id=?";
            PreparedStatement smt = con.prepareStatement(sql);
            smt.setInt(1, id);
            ResultSet rs= smt.executeQuery();
            if(rs.next()){
                reporter =new Reporter();
                reporter.setId(rs.getInt("id"));
                reporter.setName(rs.getString("name"));
                reporter.setDob(rs.getString("dob"));
                reporter.setGender(rs.getString("gender"));
                reporter.setUserid(rs.getString("userid"));
                reporter.setPassword(rs.getString("password"));
                reporter.setPhoto(rs.getString("photo"));
                reporter.setContact(rs.getString("contact"));
                reporter.setEmail(rs.getString("email"));
                reporter.setStatus(rs.getString("status"));
                reporter.setAddress(rs.getString("address"));
                
            }
            smt.close();
            cp.putConnection(con);
        }   catch(Exception e){
            System.out.println("Error :"+e.getMessage());
        }
       }
       
    return reporter;
   }
   
   public ArrayList<Reporter>  getAllRecords(){
    
       ArrayList<Reporter> reporters =new ArrayList<Reporter>();
       ConnectionPool cp = ConnectionPool.getInstance();
       cp.initialize();
       Connection con = cp.getConnection();
       if(con!=null){
        try{
            String sql = "select * from reporter";
            PreparedStatement smt = con.prepareStatement(sql);
            ResultSet rs= smt.executeQuery();
            while(rs.next()){
                Reporter reporter=new Reporter();
                reporter.setId(rs.getInt("id"));
                reporter.setName(rs.getString("name"));
                reporter.setDob(rs.getString("dob"));
                reporter.setGender(rs.getString("gender"));
                reporter.setUserid(rs.getString("userid"));
                reporter.setPassword(rs.getString("password"));
                reporter.setPhoto(rs.getString("photo"));
                reporter.setContact(rs.getString("contact"));
                reporter.setEmail(rs.getString("email"));
                reporter.setStatus(rs.getString("status"));
                reporter.setAddress(rs.getString("address"));
                reporters.add(reporter);
            }
            smt.close();
            cp.putConnection(con);
        }   catch(Exception e){
            System.out.println("Error :"+e.getMessage());
        }
       }
       
    return reporters;
   }
   
   
   
   public ArrayList<Reporter>  getRecordByLimit(int start, int end){
    
       ArrayList<Reporter> reporters =new ArrayList<Reporter>();
       ConnectionPool cp = ConnectionPool.getInstance();
       cp.initialize();
       Connection con = cp.getConnection();
       if(con!=null){
        try{
            String sql = "select * from reporter limit ?,?";
            PreparedStatement smt = con.prepareStatement(sql);
            smt.setInt(1, start);
            smt.setInt(2, end);
            ResultSet rs= smt.executeQuery();
             while(rs.next()){
                Reporter reporter=new Reporter();
                reporter.setId(rs.getInt("id"));
                reporter.setName(rs.getString("name"));
                reporter.setDob(rs.getString("dob"));
                reporter.setGender(rs.getString("gender"));
                reporter.setUserid(rs.getString("userid"));
                reporter.setPassword(rs.getString("password"));
                reporter.setPhoto(rs.getString("photo"));
                reporter.setContact(rs.getString("contact"));
                reporter.setEmail(rs.getString("email"));
                reporter.setStatus(rs.getString("status"));
                reporter.setAddress(rs.getString("address"));
                reporters.add(reporter);
            }
            smt.close();
            cp.putConnection(con);
        }   catch(Exception e){
            System.out.println("Error :"+e.getMessage());
        }
       }
       
    return reporters;
   }
   
  
   public int  getRecordsCount(){
    
       int total=0;
       ConnectionPool cp = ConnectionPool.getInstance();
       cp.initialize();
       Connection con = cp.getConnection();
       if(con!=null){
        try{
            String sql = "select count(*) from reporter";
            PreparedStatement smt = con.prepareStatement(sql);
            ResultSet rs= smt.executeQuery();
            if(rs.next()){
                total = rs.getInt(1);
            }
            smt.close();
            cp.putConnection(con);
        }   catch(Exception e){
            System.out.println("Error :"+e.getMessage());
        }
       }
       
    return total;
   }
   
   public boolean  update(Reporter reporter){
       boolean status=false;
       ConnectionPool cp = ConnectionPool.getInstance();
       cp.initialize();
       Connection con = cp.getConnection();
       if(con!=null){
        try{
            String sql = "update Reporter set name=?,dob=?,gender=?,contact=?,email=?,address=?,image=?  where id=?";
            PreparedStatement smt = con.prepareStatement(sql);
            smt.setString(1, reporter.getName());
            smt.setString(2, reporter.getDob());
            smt.setString(3, reporter.getGender());
            smt.setString(4, reporter.getContact());
            smt.setString(5, reporter.getEmail());
            smt.setString(6, reporter.getAddress());
            smt.setString(7,reporter.getPhoto());
           smt.setInt(8, reporter.getId());
            if(smt.executeUpdate()>0)
                status=true;
            smt.close();
            cp.putConnection(con);
        }   catch(Exception e){
            System.out.println("DBError :"+e.getMessage());
        }
       }
       
    return status;
   }
   
   public boolean  isUserIdExist(String userid){
       boolean status = false;
        ConnectionPool cp = ConnectionPool.getInstance();
       cp.initialize();
       Connection con = cp.getConnection();
       if(con!=null){
        try{
            String sql = "select * from reporter where userid=?";
            PreparedStatement smt = con.prepareStatement(sql);
            smt.setString(1, userid);
            ResultSet rs= smt.executeQuery();
            if(rs.next()){
                status=true;
            }
            smt.close();
            cp.putConnection(con);
        }   catch(Exception e){
            System.out.println("Error :"+e.getMessage());
        }
       }
       
       return status;
   }
   
   
   
   public boolean  isContactExist(String contact){
       boolean status = false;
        ConnectionPool cp = ConnectionPool.getInstance();
       cp.initialize();
       Connection con = cp.getConnection();
       if(con!=null){
        try{
            String sql = "select * from reporter where contact=?";
            PreparedStatement smt = con.prepareStatement(sql);
            smt.setString(1, contact);
            ResultSet rs= smt.executeQuery();
            if(rs.next()){
                status=true;
            }
            smt.close();
            cp.putConnection(con);
        }   catch(Exception e){
            System.out.println("Error :"+e.getMessage());
        }
       }
       
       return status;
   }  
   
   
   public boolean  isEmailExist(String email){
       boolean status = false;
        ConnectionPool cp = ConnectionPool.getInstance();
       cp.initialize();
       Connection con = cp.getConnection();
       if(con!=null){
        try{
            String sql = "select * from reporter where contact=?";
            PreparedStatement smt = con.prepareStatement(sql);
            smt.setString(1, email);
            ResultSet rs= smt.executeQuery();
            if(rs.next()){
                status=true;
            }
            smt.close();
            cp.putConnection(con);
        }   catch(Exception e){
            System.out.println("Error :"+e.getMessage());
        }
       }
       
       return status;
   }   
   
   
   
   public boolean  isValid(String userid,String password){
       boolean status = false;
        ConnectionPool cp = ConnectionPool.getInstance();
       cp.initialize();
       Connection con = cp.getConnection();
       if(con!=null){
        try{
            String sql = "select * from reporter where userid=? and password=?";
            PreparedStatement smt = con.prepareStatement(sql);
            smt.setString(1, userid);
            smt.setString(2, password);
            ResultSet rs= smt.executeQuery();
            if(rs.next()){
                status=true;
            }
            smt.close();
            cp.putConnection(con);
        }   catch(Exception e){
            System.out.println("DBError :"+e.getMessage());
        }
       }
       
       return status;
   }  
}

