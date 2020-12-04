package com.yash.pms.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCUtil {

	public static PreparedStatement prepareStatement(String sql) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/productdb";
			Connection con= DriverManager.getConnection(url,"root","root");
			PreparedStatement  preparedStatement=con.prepareStatement(sql);
			return preparedStatement;
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

}
