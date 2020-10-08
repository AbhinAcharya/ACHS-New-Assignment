package com.achs.controller;

import com.achs.dao.UserDao;
import com.achs.dao.UserDaoImpl;
import com.achs.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.function.DoubleToIntFunction;

/**
 * Created by IntelliJ IDEA.
 * User: abhinacharya
 * Date: 10/4/20
 * Time: 3:35 PM
 */
@WebServlet("/EditUserServlet")
public class EditUserServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int uId = Integer.parseInt(request.getParameter("uid"));//String ma aako lai int ma parse gareko
        UserDao userDao = new UserDaoImpl();
        User user = new User();
        try {
            user = userDao.getUserById(uId);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        request.setAttribute("uid", user.getUid());
        //request.setAttribute("user", user);
        request.setAttribute("username", user.getUserName());
        request.setAttribute("email", user.getEmail());
        request.setAttribute("password", user.getPassword());
        request.setAttribute("address", user.getAddress());
        request.setAttribute("phone", user.getContactNumber());
        request.getRequestDispatcher("/views/edit-user.jsp").forward(request, response);


    }
}
