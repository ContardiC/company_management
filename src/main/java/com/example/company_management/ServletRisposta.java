package com.example.company_management;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletRisposta", value = "/ServletRisposta")
public class ServletRisposta extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");

        PrintWriter out = response.getWriter();

        out.println("<html><body>"+"Ciao "+username+"<br>"
                +"</body></html>");


    }
}
