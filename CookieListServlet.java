import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/CookieListServlet")
public class CookieListServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        int visitCount = 1;

        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("visitCount")) {
                    visitCount = Integer.parseInt(c.getValue()) + 1;
                }
            }
        }

        Cookie userCookie = new Cookie("username", username);
        Cookie countCookie = new Cookie("visitCount", String.valueOf(visitCount));
        userCookie.setMaxAge(60);
        countCookie.setMaxAge(60);

        response.addCookie(userCookie);
        response.addCookie(countCookie);

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h2>Welcome back " + username + " !</h2>");
        out.println("<h3>You have visited this page " + visitCount + " times</h3>");
        out.println("<h3>List of Cookies:</h3>");

        Cookie[] allCookies = request.getCookies();
        if (allCookies != null) {
            for (Cookie c : allCookies) {
                out.println("Cookie Name: " + c.getName() + ", Value: " + c.getValue() + "<br>");
            }
        }

        out.println("<p>Cookie expiry is 60 seconds.</p>");
    }
}