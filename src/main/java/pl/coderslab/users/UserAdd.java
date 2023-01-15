package pl.coderslab.users;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/user/add")
public class UserAdd extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/users/add.jsp")
                .forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserDao userDao = new UserDao();
        String userName = (String) request.getParameter("name");
        String userEmail = (String) request.getParameter("email");
        String userPassword = (String) request.getParameter("password");
        User user = new User();
        user.setUserName(userName);
        user.setEmail(userEmail);
        user.setPassword(userPassword);
        userDao.create(user);
        response.sendRedirect(request.getContextPath() + "/user/list");
    }
}
