import java.sql.*;

public class EmployeeReportByR {
    static final String URL = "jdbc:mysql://localhost:3306/Employee";
    static final String USER = "root";
    static final String PASS = "root";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(URL, USER, PASS);

            PreparedStatement ps = con.prepareStatement("SELECT * FROM Emp WHERE Emp_Name LIKE 'R%'");
            ResultSet rs = ps.executeQuery();

            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Salary Report");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

            while (rs.next()) {
                System.out.println("Emp_No   : " + rs.getInt("Emp_NO"));
                System.out.println("Emp_Name : " + rs.getString("Emp_Name"));
                System.out.println("Basic    : " + rs.getInt("Basicsalary"));
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}