package org.example.quest.inquisition;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "clickOn", value = "/click-on")
public class ClickOnServlet extends HttpServlet {
    private  String textStory2;
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter out = null;
        try {
            out = response.getWriter();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        out.println("<html>" +"<meta charset=\"UTF-8\">"+"<body>");
        out.println("<br><h2>"+"Сейчас  играет: "+ req.getSession().getAttribute("username")+ "</h2><br>");
        out.println("<h4>" + textStory2);
        out.println("<br><h2>"+(String) req.getSession().getAttribute("username")+" , в мире Warhammer`a превозмогают все по разному"+ "</h2><br>");

        out.println("</h4><br>");
        out.println("<form action=\"/quest_war_exploded\" method=\"POST\">\n" +
                "<input type=\"submit\" value=\"Вернуться в начало\" />\n" +
                "</form>");
        out.println("</body></html>");
    }

    @Override
    public void init() throws ServletException {
        textStory2 = "Креон знал – сопротивляться Сестре Битвы бессмысленно. Но он не мог просто сдаться.  <br>" +
                "<br>" +
                "\"Если я паду – вы падёте со мной.\"  <br>" +
                "<br>" +
                "Он нажал **триггер.  <br>" +
                "<br>" +
                "Сначала – тишина. Потом **оглушительный рёв взрывов.  <br>" +
                "<br>" +
                "Инквизитор Таллос успел броситься в сторону, но Сестра Битвы **не дрогнула. Её ауспикс вспыхнул, и она шагнула сквозь пламя**, меч всё ещё в руке.  \n" +
                "<br>" +
                "Последнее, что увидел Креон – сверкающий клинок, рассекающий его шлем.  <br>" +
                "<br> "+
                "**Финал:** <br> "+"Его тело сгорело в священном огне. Инквизиция записала его как еретика. Никто не узнает правды.  <br>";
    }
}
