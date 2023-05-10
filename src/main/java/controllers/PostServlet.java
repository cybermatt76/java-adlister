package controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "controllers.PostServlet", urlPatterns = "/createPost")
public class PostServlet extends HttpServlet {

    @Override
    protected void doGet
            (HttpServletRequest request,
             HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/blog/createPost.jsp").forward(request, response);
    }

        @Override
        protected void doPost
        (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            String post = request.getParameter("post");
            request.setAttribute("post", post);
            request.getRequestDispatcher("/blog/createPost.jsp").forward(request, response);
        }
    }