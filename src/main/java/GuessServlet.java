import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

@WebServlet("/guess")
public class GuessServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("guess.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int randomNumber = new Random().nextInt(3) + 1;
        int guessedNumber = Integer.parseInt(request.getParameter("number"));

        if (guessedNumber == randomNumber) {
            response.sendRedirect("correct?message=You%20Won!");
        } else {
            response.sendRedirect("incorrect?message=You%20Lost!");
        }
    }
}
