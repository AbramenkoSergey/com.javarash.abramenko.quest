package org.example.quest.inquisition;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet (name ="surrender", value = "/surrender")

public class SurrenderServlet extends HttpServlet {
    private String textStory2;
    @Override
    public void init(ServletConfig config) throws ServletException {
        textStory2 = "Сестра Битвы **не стала его добивать**.  <br>" +
                "<br>" +
                "Она оттащила его в тень**, где *уже ждали.  <br>" +
                "<br>" +
                "Человек в красном с **механическим голосом**:  <br>" +
                "<br>" +
                "— \"Где остальные?\"  <br>" +
                "<br>" +
                "Креон **не знал**.  <br>" +
                "<br>" +
                "**Ему помогли вспомнить.**  <br>" +
                "<br>" +
                "Сначала **иглы**. Потом **кислота**. Потом **открытый череп**.  <br>" +
                "<br>" +
                "Он **говорил**. Говорил **много**.  <br>" +
                "<br>" +
                "Имена. Координаты. Сны.**  <br>" +
                "<br>" +
                "Потом **его бросили**.  <br>" +
                "<br>" +
                "Он полз.  <br>" +
                "<br>" +
                "**Мимо трупов новобранцев.**  <br>" +
                "<br>" +
                "Мимо своей отрезанной кожи.**  <br>" +
                "<br>" +
                "Мимо зеркала.  <br>" +
                "<br>" +
                "В нём **не было его отражения.  <br>" +
                "<br>" +
                "Только **надпись**:  " +
                "<br>" +
                "\"Душ нет. Есть только мы.\" ";
    }

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
        out.println("<h4>" + textStory2);
        out.println("</h4><br>");
        out.println("<br><h2>"+(String) req.getSession().getAttribute("username")+" , в мире Warhammer`a превозмогают все по разному"+ "</h2><br>");

        out.println("<form action=\"/quest_war_exploded\" method=\"POST\">\n" +
                "<input type=\"submit\" value=\"Вернуться в начало\" />\n" +
                "</form>");
        out.println("</body></html>");
    }
}
