package hhh;

import java.sql.*;

public class JDBC {
	
	/*
	public static void main(String[] args) {
		String JDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";// SQL数据库引擎
		String connectDB = "jdbc:sqlserver://127.0.0.1:1433;DatabaseName=serverHHH";// 数据源
		try {
			Class.forName(JDriver);// 加载数据库引擎，返回给定字符串名的类
		} catch (ClassNotFoundException e) {
			// e.printStackTrace();
			System.out.println("加载数据库引擎失败");
			System.exit(0);
		}
		System.out.println("数据库驱动成功");

		try {
			String user = "hehuihui";
			String password = "hehuihui";
			Connection con = DriverManager.getConnection(connectDB, user, password);// 连接数据库对象
			System.out.println("连接数据库成功");
			Statement stmt = con.createStatement();// 创建SQL命令对象
            
			String a1="ffffff";
			//'"+name+"','"+age+"')");
			String a2 = "INSERT INTO ServerTable(event) VALUES('"+a1+"')";
			stmt.executeUpdate(a2);

		
			// 关闭连接
			stmt.close();// 关闭命令对象连接
			con.close();// 关闭数据库连接
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("数据库连接错误");
			System.exit(0);
		}
	}

	*/
	
	
	public void insert(String a1)
	{
		String JDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";// SQL数据库引擎
		   String connectDB = "jdbc:sqlserver://127.0.0.1:1433;DatabaseName=serverHHH";// 数据源
			try {
				Class.forName(JDriver);// 加载数据库引擎，返回给定字符串名的类
			} catch (ClassNotFoundException e) {
				// e.printStackTrace();
				System.out.println("加载数据库引擎失败");
				System.exit(0);
			}
			System.out.println("数据库驱动成功");

			try {
				String user = "hehuihui";
				String password = "hehuihui";
				Connection con = DriverManager.getConnection(connectDB, user, password);// 连接数据库对象
				System.out.println("连接数据库成功");
			    Statement stmt = con.createStatement();// 创建SQL命令对象

				String a2 = "INSERT INTO ServerTable(event) VALUES('"+a1+"')";
				stmt.executeUpdate(a2);

				// 关闭连接
				stmt.close();// 关闭命令对象连接
				con.close();// 关闭数据库连接
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("数据库连接错误");
				System.exit(0);
			}
	}
}
