package Webapp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Alok-PC on 09-Nov-17.
 */
@WebServlet(name = "login")
//it fires on localhost://xyz/login

public class login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter out=response.getWriter();
        out.println("do-post version :");
        out.println("Login-name :"+request.getParameter("loginname")+"\nPassword : "+request.getParameter("password"));

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out=response.getWriter();
        out.println("login-name"+request.getParameter("loginname")+"Password"+request.getParameter("password"));

    }
}
