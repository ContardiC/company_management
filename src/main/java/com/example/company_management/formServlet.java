package com.example.company_management;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "formServlet", value = "/formServlet")
public class formServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username=request.getParameter("username");
        System.out.println("METHOD GET");
        System.out.println("Ecco lo username: "+ username);
        PrintWriter out= response.getWriter();
        out.println("<html><body>"+"Ciao "+username+"</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstName=request.getParameter("first-name");
        String lastName=request.getParameter("last-name");
        String email=request.getParameter("email");
        String password=request.getParameter("password");



        PrintWriter out= response.getWriter();
        out.println("<html><body>"+"Ciao "+email+"<br>"
                +firstName+"<br>"
                +lastName+"<br>"
                +"</body></html>");
    }
}
