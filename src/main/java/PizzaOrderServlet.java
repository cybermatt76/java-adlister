import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/pizza-order")
public class PizzaOrderServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // forward the request to the pizza-order.jsp
        request.getRequestDispatcher("pizza-order.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get the form data
        String crustType = request.getParameter("crust-type");
        String sauceType = request.getParameter("sauce-type");
        String sizeType = request.getParameter("size-type");
        String[] toppings = request.getParameterValues("toppings");
        String deliveryAddress = request.getParameter("delivery-address");

        // Print the form data to the console
        System.out.println("Crust Type: " + crustType);
        System.out.println("Sauce Type: " + sauceType);
        System.out.println("Size Type: " + sizeType);
        System.out.println("Toppings: " + Arrays.toString(toppings));
        System.out.println("Delivery Address: " + deliveryAddress);

        // Set the response content type
        response.setContentType("text/html");

        // Create a PrintWriter for writing the response
        PrintWriter out = response.getWriter();

        // Write the HTML response
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Pizza Order Confirmation</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Pizza Order Confirmation</h1>");
        out.println("<p>Crust Type: " + crustType + "</p>");
        out.println("<p>Sauce Type: " + sauceType + "</p>");
        out.println("<p>Size Type: " + sizeType + "</p>");
        out.println("<p>Toppings: " + Arrays.toString(toppings) + "</p>");
        out.println("<p>Delivery Address: " + deliveryAddress + "</p>");
        out.println("</body>");
        out.println("</html>");
    }
}
