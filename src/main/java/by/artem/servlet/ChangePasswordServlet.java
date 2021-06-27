package by.artem.servlet;

import by.artem.entity.User;
import by.artem.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/user/updatePassword", name = "ChangePasswordServlet")
public class ChangePasswordServlet extends HttpServlet {
    UserService userService = new UserService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/user/updatePassword.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String password = req.getParameter("password");
        User user = (User) req.getSession().getAttribute("user");
        User byLogin = userService.getByLogin(user.getLogin());
        byLogin.setPassword(password);
        resp.sendRedirect("/");
    }
}
