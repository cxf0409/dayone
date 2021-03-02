//package com.example.demo;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//
//public class JDBCTest {
//    private static String driver="com.mysql.jdbc.Driver";
//    private static String url="jdbc:mysql://localhost:3306/mysql?useUnicode=true&characterEncoding=UTF-8&serverTimezone=PRC";
//    private static String username="root";
//    private static String password="";
//
//    public static Connection open(){
//        Connection conn=null;
//        try {
//                Class.forName(driver);
//                conn= DriverManager.getConnection(url,username,password);
//        }catch (Exception e){
//            e.getMessage();
//        }
//        return conn;
//    }
//
//
//    public static void main(String[] args) {
//        Connection con=open();
//        System.out.println(con);
//    }
//}
