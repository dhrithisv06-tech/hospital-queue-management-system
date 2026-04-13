package Hospital1Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

	public class DatabaseHandler {

	    static final String URL = "jdbc:mysql://localhost:3306/hospital2";
	    static final String USER = "root";
	    static final String PASS = "";

	    public static void insertPatient(Patient p) {
	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");

	            Connection con = DriverManager.getConnection(URL, USER, PASS);

	            String query = "INSERT INTO patients(name, `condition`, priority) VALUES (?, ?, ?)";

	            PreparedStatement ps = con.prepareStatement(query);
	            ps.setString(1, p.name);
	            ps.setString(2, p.condition);
	            ps.setInt(3, p.priority);

	            ps.executeUpdate();

	            System.out.println("Saved to Database ✅");

	            con.close();

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }


}
