package com.youtube.controllers.dashboard;

import com.youtube.entities.User;
import com.youtube.entities.History;
import com.youtube.services.ICommonService;
import com.youtube.services.IHistoryService;
import com.youtube.utils.ApplicationUtil;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@WebServlet(urlPatterns = {"/history"})
public class HistoryController extends HttpServlet {

    private static final Long serialVersionUID = 1L;

    @Inject
    private ICommonService commonService;

    @Inject
    private IHistoryService historyService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User userCurrent = (User) ApplicationUtil.getInstance().getValue(req, "user");
        Collection<History> histories = historyService.findAllByUser(userCurrent.getId());
        if (histories == null) {
            histories = new ArrayList<>();
        }
        Collections.reverse((List<?>) histories);
        req.setAttribute("histories", histories);
        req.setAttribute("cs", commonService);
        RequestDispatcher rd = req.getRequestDispatcher("/views/dashboard/history.jsp");
        rd.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPut(req, resp);
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doDelete(req, resp);
    }
}
