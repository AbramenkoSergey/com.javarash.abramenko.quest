package org.example.quest.inquisition;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(name = "inquisitionStart", value = "/Inquisition")
public class InquisitionStartServlet extends HttpServlet {
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
        out.println("<center><img src=\"Inquisition1.jpg\" ></center><br>");
        out.println("<br><h4>" + textStory2);
        out.println("</h4>");

        out.println("<br><form action=\"surrender\" method=\"POST\">\n" +
                "<input type=\"submit\" value=\"Сдаться\" />\n" +
                "</form>");
        out.println("<form action=\"notAcceptOffer\" method=\"POST\">\n" +
                "<input type=\"submit\" value=\"Нажать на скрытый триггер\" />\n" +
                "</form>");
        out.println("</body></html>");
    }

    @Override
    public void init() throws ServletException {
        textStory2 = "Дверь распахнулась сама. В проеме стоял человек в черном, его глаза горели холодным огнем.  <br>" +
                "<br>" +
                "— Сержант Креон? — голос инквизитора звучал, как приговор.  <br>" +
                "<br>" +
                "— Да, господин.  <br>" +
                "<br>" +
                "— Вы вели их сюда. Вы знали.  <br>" +
                "<br>" +
                "Креон опустил взгляд. Его пальцы сжали пистолет.  <br>" +
                "<br>" +
                "— Простите.  <br>" +
                "<br>" +
                "Выстрел грянул в тишине. Выстрел инквизитора прошел мимо — Креон успел отпрыгнуть.  <br>" +
                "<br>" +
                "— Ты не судья мне, Таллос! — рявкнул он, прячась за колонной.  <br>" +
                "<br>" +
                "Инквизитор усмехнулся:  <br>" +
                "<br>" +
                "— Ты прав. Но она — да.  <br>" +
                "<br>" +
                "Из тьмы вышла девушка в серебряных доспехах — **сестра Битвы**. Ее меч уже был занесен.  <br>" +
                "<br>" +
                "**Выбор:**  <br>" +
                "- Сдаться — может, инквизитор даст ему шанс искупить вину.  <br>" +
                "-  Нажать на скрытый триггер — здание заминировано. Если уж погибать, то с ними.";

    }
}
