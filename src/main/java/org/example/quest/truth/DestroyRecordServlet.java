package org.example.quest.truth;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DestroyRecordServlet", value = "/destroy-record")
public class DestroyRecordServlet extends HttpServlet {
    private  String textStory3;
    @Override
    public void init() throws ServletException {
        textStory3 = "Креон посмотрел на новобранца. \"Если мы отправим сигнал – нас устранят. Если уничтожим запись – нас всё равно найдут.\"  <br>" +
                "<br>" +
                "Он поднял болтер.  <br>" +
                "<br>" +
                "\"Прости, брат.\"  <br>" +
                "<br>" +
                "Выстрел.  <br>" +
                "<br>" +
                "Теперь он был один.  <br>" +
                "<br>" +
                "Креон направил ствол себе в подбородок.  <br>" +
                "<br>" +
                "Но дверь распахнулась.  <br>" +
                "<br>" +
                "В проёме стояли двое в чёрных караульных доспехах – дознаватели Арбитес.  <br>" +
                "<br>" +
                "\"Сержант Креон, вы обвиняетесь в убийстве подчинённого и сокрытии ереси.\"  <br>" +
                "\n" +
                "Он понял – **это ловушка.  <br>" +
                "<br>" +
                "**Финал:**<br> Его пытали семь дней. На восьмой он признался во всём, даже в том, чего не совершал. Его казнили как предателя. ";
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
        out.println("<h4>" + textStory3);
        out.println("</h4><br>");
        out.println("<form action=\"/quest_war_exploded\" method=\"POST\">\n" +
                "<input type=\"submit\" value=\"Вернуться в начало\" />\n" +
                "</form>");
        out.println("</body></html>");
    }
}
