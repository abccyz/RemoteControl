package hhh;

import java.sql.*;

public class JDBC {
	
	/*
	public static void main(String[] args) {
		String JDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";// SQL���ݿ�����
		String connectDB = "jdbc:sqlserver://127.0.0.1:1433;DatabaseName=serverHHH";// ����Դ
		try {
			Class.forName(JDriver);// �������ݿ����棬���ظ����ַ���������
		} catch (ClassNotFoundException e) {
			// e.printStackTrace();
			System.out.println("�������ݿ�����ʧ��");
			System.exit(0);
		}
		System.out.println("���ݿ������ɹ�");

		try {
			String user = "hehuihui";
			String password = "hehuihui";
			Connection con = DriverManager.getConnection(connectDB, user, password);// �������ݿ����
			System.out.println("�������ݿ�ɹ�");
			Statement stmt = con.createStatement();// ����SQL�������
            
			String a1="ffffff";
			//'"+name+"','"+age+"')");
			String a2 = "INSERT INTO ServerTable(event) VALUES('"+a1+"')";
			stmt.executeUpdate(a2);

		
			// �ر�����
			stmt.close();// �ر������������
			con.close();// �ر����ݿ�����
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("���ݿ����Ӵ���");
			System.exit(0);
		}
	}

	*/
	
	
	public void insert(String a1)
	{
		String JDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";// SQL���ݿ�����
		   String connectDB = "jdbc:sqlserver://127.0.0.1:1433;DatabaseName=serverHHH";// ����Դ
			try {
				Class.forName(JDriver);// �������ݿ����棬���ظ����ַ���������
			} catch (ClassNotFoundException e) {
				// e.printStackTrace();
				System.out.println("�������ݿ�����ʧ��");
				System.exit(0);
			}
			System.out.println("���ݿ������ɹ�");

			try {
				String user = "hehuihui";
				String password = "hehuihui";
				Connection con = DriverManager.getConnection(connectDB, user, password);// �������ݿ����
				System.out.println("�������ݿ�ɹ�");
			    Statement stmt = con.createStatement();// ����SQL�������

				String a2 = "INSERT INTO ServerTable(event) VALUES('"+a1+"')";
				stmt.executeUpdate(a2);

				// �ر�����
				stmt.close();// �ر������������
				con.close();// �ر����ݿ�����
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("���ݿ����Ӵ���");
				System.exit(0);
			}
	}
}
