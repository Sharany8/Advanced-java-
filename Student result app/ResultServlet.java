import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/ResultServlet")
public class ResultServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int s1 = Integer.parseInt(request.getParameter("sub1"));
        int s2 = Integer.parseInt(request.getParameter("sub2"));
        int s3 = Integer.parseInt(request.getParameter("sub3"));
        int s4 = Integer.parseInt(request.getParameter("sub4"));
        int s5 = Integer.parseInt(request.getParameter("sub5"));

        double avg = (s1 + s2 + s3 + s4 + s5) / 5.0;
        String result = (s1 > 40 && s2 > 40 && s3 > 40 && s4 > 40 && s5 > 40) ? "Pass" : "Fail";

        request.setAttribute("rollno", request.getParameter("rollno"));
        request.setAttribute("studentname", request.getParameter("studentname"));
        request.setAttribute("sub1", s1);
        request.setAttribute("sub2", s2);
        request.setAttribute("sub3", s3);
        request.setAttribute("sub4", s4);
        request.setAttribute("sub5", s5);
        request.setAttribute("average", avg);
        request.setAttribute("result", result);

        RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
        rd.forward(request, response);
    }
}