package org.example.quest.truth;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SendSignalServlet", value = "/send-signal")
public class SendSignalServlet extends HttpServlet {
    private  String textStory3;

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
        out.println("<h4>" + textStory3);
        out.println("</h4><br>");
        out.println("<br><h2>"+(String) req.getSession().getAttribute("username")+" , в мире Warhammer`a превозмогают все по разному"+ "</h2><br>");

        out.println("<form action=\"/quest_war_exploded\" method=\"POST\">\n" +
                "<input type=\"submit\" value=\"Вернуться в начало\" />\n" +
                "</form>");
        out.println("</body></html>");
    }

    @Override
    public void init() throws ServletException {
        textStory3 = "Дознаватели **не стали его казнить.  <br>" +
                "<br>" +
                "Они **дали ему шанс.  <br>" +
                "<br>" +
                "\"Найди предателей. Умри как герой.\"  <br>" +
                "<br>" +
                "Он согласился**.  <br>" +
                "<br>" +
                "Они вживили ему в грудь бомбу.  <br>" +
                "<br>" +
                "\"48 часов.\"  <br>" +
                "<br>" +
                "Он искал.  <br>" +
                "<br>" +
                "Нашёл. <br>" +
                "<br>" +
                "Это был Инквизитор Таллос.  \n" +
                "<br>" +
                "— \"Ты... знал?\" <br>" +
                "<br>" +
                "— \"Все знают. Никому не важно.\"  <br>" +
                "<br>" +
                "Креон активировал бомбу.  <br>" +
                "<br>" +
                "Взрыв.  <br>" +
                "<br>" +
                "Темнота. <br>" +
                "<br>" +
                "Потом – свет.  <br>" +
                "<br>" +
                "Он **стоял в рядах таких же, как он**.  <br>" +
                "<br>" +
                "**Мёртвых. Но всё ещё служащих.  <br>" +
                "<br>" +
                "\"Следующее задание, агент.\"  <br>" +
                "<br>" +
                "---  <br>" +
                "<br>" +
                "**Теперь ты – часть системы.  <br>" +
                "<br>" +
                "Ты проиграл. Но игра продолжится.  <br>" +
                "<br>" +
                "Выбирай ветку. Попробуй снова.  <br>" +
                "<br>" +
                "Или сдайся.  <br>" +
                "<br>" +
                "Всё равно.";
    }
}
