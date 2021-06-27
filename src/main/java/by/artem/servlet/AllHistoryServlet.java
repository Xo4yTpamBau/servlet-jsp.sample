package by.artem.servlet;

import by.artem.entity.User;
import by.artem.service.CalcService;
import by.artem.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet (urlPatterns = "/allHistory", name = "IndividualHistoryServlet")
public class AllHistoryServlet extends HttpServlet {
    CalcService calcService = new CalcService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Double> allHistory = calcService.getAll();
        req.setAttribute("allHistory", allHistory);
        getServletContext().getRequestDispatcher("/allHistory.jsp").forward(req, resp);

    }


}
