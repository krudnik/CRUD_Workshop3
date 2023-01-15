package pl.coderslab.users;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/user/edit")
public class UserEdit extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userId = request.getParameter("id");
        UserDao userDao = new UserDao();
        User user = userDao.read(Integer.parseInt(userId));
        request.setAttribute("user", user);
        getServletContext().getRequestDispatcher("/users/edit.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = (String) request.getParameter("name");
        String userEmail = (String) request.getParameter("email");
        String userPassword = (String) request.getParameter("password");
        String userId = request.getParameter("id");
        User user = new User();
        user.setId((Integer.parseInt(userId)));
        user.setUserName(userName);
        user.setEmail(userEmail);
        user.setPassword(userPassword);
        UserDao userDao = new UserDao();
        userDao.update(user);
        response.sendRedirect(request.getContextPath() + "/user/list");

    }
}
