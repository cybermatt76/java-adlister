import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/favorite-language")
public class FavoriteLanguageServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String selectedLanguage = req.getParameter("fav_language");
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Favorite Language</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Your favorite language is " + selectedLanguage + "!</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}


