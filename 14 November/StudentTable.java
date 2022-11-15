package jdbc1;

import java.sql.*;

public class StudentTable {
static Connection con;
	
	static void getCon() throws SQLException {
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Test", "bhagyashree", "Bhagyashree07");
	}
	
	static void createTable() {
		try {
			Statement st = con.createStatement();
			st.executeUpdate("CREATE TABLE STUDENT(SID INT, SNAME VARCHAR(30), MARKS INT)");
			System.out.println("Table created successfully");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	static void insertRows() {
		try {
			Statement st = con.createStatement();
			int r = st.executeUpdate("INSERT INTO STUDENT VALUES(1, 'Bhagyashree', 67),(2, 'Sapna', 99),(3, 'Babita', 76)");
			System.out.println(r+" rows affected.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	

	public static void main(String[] args) throws SQLException {
		getCon();
		createTable();
		insertRows();
	}
}


