import java.sql.*;

public class EmployeeReport {
    static final String URL = "jdbc:mysql://localhost:3306/Employee";
    static final String USER = "root";
    static final String PASS = "root";

    public static void main(String[] args) {
        int grandSalary = 0;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(URL, USER, PASS);

            Statement st = con.createStatement();

            st.executeUpdate("INSERT INTO Emp VALUES (101, 'Ramesh', 25000)");
            st.executeUpdate("INSERT INTO Emp VALUES (102, 'Ravi', 20000)");
            st.executeUpdate("INSERT INTO Emp VALUES (103, 'Raj', 30000)");
            st.executeUpdate("INSERT INTO Emp VALUES (104, 'Suresh', 18000)");
            st.executeUpdate("INSERT INTO Emp VALUES (105, 'Rekha', 22000)");

            ResultSet rs = st.executeQuery("SELECT * FROM Emp");

            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Salary Report");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

            while (rs.next()) {
                int empNo = rs.getInt("Emp_NO");
                String empName = rs.getString("Emp_Name");
                int salary = rs.getInt("Basicsalary");
                grandSalary += salary;

                System.out.println("Emp_No   : " + empNo);
                System.out.println("Emp_Name : " + empName);
                System.out.println("Basic    : " + salary);
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            }

            System.out.println("Grand Salary : " + grandSalary);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}