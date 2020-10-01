package com.achs;

import org.w3c.dom.ls.LSOutput;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by IntelliJ IDEA.
 * User: abhinacharya
 * Date: 10/1/20
 * Time: 12:45 PM
 */

public class LoginServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
       String name = request.getParameter("username");
       String password = request.getParameter("password");
       // PrintWriter out = response.getWriter();
       // out.println(name+password);


    }

}
