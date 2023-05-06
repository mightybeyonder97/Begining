/** Name: Miguelito Jean
 * Class : CSC205
 */

import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseExample {

	public static void main(String args[]) {
		Connection conn = null;
		Scanner obb = new Scanner(System.in);
	/*	String titl;
		//String direc;
		int year; */
		String rat;
		
		try {
				conn = DriverManager.getConnection("jdbc:sqlite:csc205.db");
				System.out.println("Opened database connection!");
				
				try {
					deleteTable(conn);   // table must exist
				}
				catch (Exception ignored) {
					// Do nothing - table probably doesn't exist
				}
				createTable(conn);
				
				System.out.println();
				System.out.println("Inserting data");
				System.out.println("Insert your data:");
			
				DatabaseExample.getMovie(conn, null, null, 0, null);
			    insertMovie(conn, "Aliens", "James Cameron", 1986, "R");
			    insertMovie(conn, "Highlander", "Russell Mulcahy", 1986, "R");
			    insertMovie(conn, "Goodfellas", "Martin Scorsese", 1990, "R");
			    insertMovie(conn, "Inside Out", "Pete Docter", 2015, "PG");
			    insertMovie(conn, "Guardians of the Galaxy", "James Gunn", 2014, "PG-13");
			    insertMovie(conn, "Dick Tracy", "Warren Beatty", 1990, "PG");
			    insertMovie(conn, "Toy Story", "John Lasseter", 1995, "G");
			    insertMovie(conn, "Twelve Monkeys", "Terry Gilliam", 1995, "R");
			    insertMovie(conn, "The Dark Knight", "Christopher Nolan", 2008, "PG-13");
			    insertMovie(conn, "The Hurt Locker", "Kathryn Bigelow", 2008, "R");	
			    
				System.out.println();
				System.out.println("Displaying database");
			    displayDatabase(conn, "Movies");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getClass().getName() + ": " + e.getMessage());
		}
		finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
	                e.printStackTrace();
	                System.out.println(e.getMessage());
				}
			}
		}
	}

	private static void displayDatabase(Connection conn, String tableName) throws SQLException {
		String selectSQL = "SELECT * from " + tableName;
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(selectSQL);
		
		System.out.println("------- " + tableName + " -------");
		while(rs.next()) {
			System.out.print("Movie: " + rs.getString("title") + ", ");
			System.out.print(rs.getString("director") + ", ");
			System.out.print(rs.getInt("year") + ", ");
			System.out.println(rs.getString("rating"));
		}
		System.out.println("------------------------------");
	}
	private static void getMovie(Connection conn, String title, String director, int year, String rating)throws SQLException{
		String insertSQL = "INSERT INTO Movies(title, director, year, rating) VALUES(?,?,?,?)";
		PreparedStatement pstmt = conn.prepareStatement(insertSQL);
		Scanner scan = new Scanner(System.in);
		
		String userti = scan.nextLine();
		String userdi = scan.nextLine();
		int ye = scan.nextInt();
		String userR = scan.next();
	
		title = userti;
		director = userdi;
		rating = userR;
		year = ye; 
		
		 pstmt.setString(1,  userti);
	     pstmt.setString(2,  userdi);
	     pstmt.setInt(3,  ye);
	     pstmt.setString(4,  userR);
	     
	     pstmt.executeUpdate();
	}

	private static void insertMovie(Connection conn, String title, String director, int year, String rating) throws SQLException {
	     String insertSQL = "INSERT INTO Movies(title, director, year, rating) VALUES(?,?,?,?)";
	     PreparedStatement pstmt = conn.prepareStatement(insertSQL);
	     pstmt.setString(1,  title);
	     pstmt.setString(2,  director);
	     pstmt.setInt(3,  year);
	     pstmt.setString(4,  rating);
	     pstmt.executeUpdate();
	}

	private static void createTable(Connection conn) throws SQLException {
		String createTablesql = "" +
	              "CREATE TABLE  Movies " +
	              "( " +
	              "title varchar(255), " +
	              "director varchar(255), " +
	              "year integer, " +
	              "rating varchar(5) " +
	              "); " +
	              "";
		Statement stmt = conn.createStatement();
		stmt.execute(createTablesql);
	}

	private static void deleteTable(Connection conn) throws SQLException {
		String deleteTableSQL = "DROP TABLE Movies";
		Statement stmt = conn.createStatement();
		stmt.execute(deleteTableSQL);
	}}