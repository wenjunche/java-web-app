package com.openfin;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/sso")
public class SSOServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false);
        if (session != null) {
            session.invalidate();
        }
        String sig = request.getParameter("username");
        if (sig != null && sig.equals("openfin")) {
            request.getSession().setAttribute("user", "openfin");
//            request.getRequestDispatcher("/index.html").forward(request, response);
            response.sendRedirect("/index.html");
        } else {
//            request.getRequestDispatcher("/login.html").forward(request, response);
            response.sendRedirect("/login.html");
        }
    }

}
