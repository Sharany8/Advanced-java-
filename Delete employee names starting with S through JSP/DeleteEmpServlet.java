import java.io.*;
import java.sql.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/DeleteEmpServlet")
public class DeleteEmpServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String prefix = request.getParameter("prefix");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "root");

            PreparedStatement ps = con.prepareStatement("DELETE FROM Emp WHERE Emp_Name LIKE ?");
            ps.setString(1, prefix + "%");
            ps.executeUpdate();

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Emp");

            PrintWriter out = response.getWriter();
            out.println("Salary Report<br>");
            out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~<br>");

            while (rs.next()) {
                out.println("Emp_No : " + rs.getInt("Emp_NO") + "<br>");
                out.println("Emp_Name : " + rs.getString("Emp_Name") + "<br>");
                out.println("Basic : " + rs.getInt("Basicsalary") + "<br>");
                out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~<br>");
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace(response.getWriter());
        }
    }
}