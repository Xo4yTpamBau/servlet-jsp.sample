package by.artem.servlet;

import by.artem.entity.User;
import by.artem.service.CalcService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/individualHistory")
public class IndividualHistoryServlet extends HttpServlet {
    CalcService calcService = new CalcService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = (User) req.getSession().getAttribute("user");
        List<Double> individualHistory = calcService.getIndividualUSerHistory(user);
        req.setAttribute("individualHistory", individualHistory);
        getServletContext().getRequestDispatcher("/individualHistory.jsp").forward(req, resp);

    }
}
