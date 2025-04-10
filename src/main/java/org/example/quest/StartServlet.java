package org.example.quest;



import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "startStory", value = "/start-story")
public class StartServlet extends HttpServlet {


    //Завязка
    public static String userStringName;
    public static Integer userCountGame;


    

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        req.setCharacterEncoding("UTF-8");
        String userStringName = req.getParameter("username");
        HttpSession session = req.getSession();
        if(userStringName != null) {
            session.setAttribute("username", userStringName);

        }
        getServletContext().getRequestDispatcher("/index.jsp")
                .forward(req, resp);



    }
}
