import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // Retrieve the submitted username and password values
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Check if the username and password match the expected values
        if ("admin".equals(username) && "password".equals(password)) {
            // If the username and password match, redirect to the profile page
            response.sendRedirect("profile.jsp");
        } else {
            // If the username and password don't match, redirect back to the login form
            response.sendRedirect("login.jsp");
        }
    }
}
