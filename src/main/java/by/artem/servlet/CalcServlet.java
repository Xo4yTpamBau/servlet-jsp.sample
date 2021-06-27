package by.artem.servlet;

import by.artem.entity.Operation;
import by.artem.entity.User;
import by.artem.service.CalcService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/calc", name = "CalcServlet")
public class CalcServlet extends HttpServlet {
    CalcService calcService = new CalcService();



    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("calc.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String num1 = req.getParameter("num1");
        String num2 = req.getParameter("num2");
        String operation = req.getParameter("operation");
        User user = (User) req.getSession().getAttribute("user");
        double result = 0;
        switch (Operation.valueOf(operation)) {
            case SUM:
                result = calcService.sum(Double.parseDouble(num1), Double.parseDouble(num2), user);
                break;
            case SUB:
                result = calcService.sub(Double.parseDouble(num1), Double.parseDouble(num2), user);
                break;
            case MOD:
                result = calcService.mod(Double.parseDouble(num1), Double.parseDouble(num2), user);
                break;
            case DIV:
                result = calcService.div(Double.parseDouble(num1), Double.parseDouble(num2), user);
                break;
        }
        req.setAttribute("result", result);
        req.getRequestDispatcher("calc.jsp").forward(req, resp);
    }
}
