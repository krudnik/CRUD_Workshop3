package pl.coderslab.users;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/user/delete")
public class UserDelete extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userId = request.getParameter("id");
        UserDao userDao = new UserDao();
        //User user = userDao.read(Integer.parseInt(userId));
        userDao.delete(Integer.parseInt(userId));
        response.sendRedirect(request.getContextPath() + "/user/list");
        //getServletContext().getRequestDispatcher("/users/edit.jsp")
        //        .forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
