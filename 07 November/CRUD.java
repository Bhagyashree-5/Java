package jdbc;

import java.sql.*;

public class CRUD {
private Connection conn;
	
	public void makeConnection() throws SQLException {
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/anudip","bhagyashree","Bhagyashree07");
	}
	
	public void create() throws SQLException {
		PreparedStatement pstmt = conn.prepareStatement("CREATE TABLE candidates(cid int, cname varchar(30), city varchar(20))");
		pstmt.execute();
		System.out.println("Table has been created successfully");
		PreparedStatement pstmt2 = conn.prepareStatement("INSERT INTO candidates VALUES(1, 'Bhagyashree', 'Kalyan'),"
				+ "(2, 'Ashutosh', 'Murbad'),(3, 'Vikas', 'Kurla'),"
				+ "(4, 'Pratham', 'Kalyan'), (5, 'Gyanendra', 'Murbad')");
		pstmt2.execute();
		System.out.println("Values inserted");
	}
	
	public void read() throws SQLException {
		PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM candidates");
		ResultSet rs  = pstmt.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1)+ "    " +rs.getString(2)+"    "+rs.getString("city"));
		}
	}
	
	public void update() throws SQLException {
		PreparedStatement pstmt = conn.prepareStatement("UPDATE candidates SET cname = ? WHERE cid = ?");
		pstmt.setString(1, "Rupam");
		pstmt.setInt(2, 1);
		int rs = pstmt.executeUpdate();
		if (rs > 0) {
			System.out.println(rs + " row affected");
		}
	}
	
	public void delete() throws SQLException {
		PreparedStatement pstmt = conn.prepareStatement("DROP TABLE candidates");
		pstmt.execute();
		System.out.println("Table Deleted");
	}
	
	public static void main(String[] args) throws SQLException {
		CRUD oper = new CRUD();
		oper.makeConnection();
		oper.create();
		oper.read();
		oper.update();
		oper.read();
		oper.delete();
	}

}
