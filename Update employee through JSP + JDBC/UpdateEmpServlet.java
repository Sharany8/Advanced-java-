import java.io.*;
import java.sql.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/UpdateEmpServlet")
public class UpdateEmpServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int empno = Integer.parseInt(request.getParameter("empno"));
        String empname = request.getParameter("empname");
        int basicsalary = Integer.parseInt(request.getParameter("basicsalary"));

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "root");

            PreparedStatement ps = con.prepareStatement(
                "UPDATE Emp SET Emp_Name=?, Basicsalary=? WHERE Emp_NO=?"
            );
            ps.setString(1, empname);
            ps.setInt(2, basicsalary);
            ps.setInt(3, empno);

            ps.executeUpdate();

            response.getWriter().println("Employee updated successfully.");
            con.close();
        } catch (Exception e) {
            e.printStackTrace(response.getWriter());
        }
    }
}