import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(name = "CountServlet", urlPatterns = "/count")
public class CountServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        HttpSession session = req.getSession(true);
        Integer count = (Integer) session.getAttribute("count");

        if (req.getParameter("reset") != null) {
            count = 0;
            session.setAttribute("count", count);
        } else {
            if (count == null) {
                count = 0;
            }
            count++;
            session.setAttribute("count", count);
        }

        out.println("<html><body>");
        out.println("<h1>View count: " + count + "</h1>");
        out.println("</body></html>");
    }

}
