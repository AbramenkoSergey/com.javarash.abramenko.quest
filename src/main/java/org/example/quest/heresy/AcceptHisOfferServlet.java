package org.example.quest.heresy;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "acceptOffer", value = "/acceptOffer")
public class AcceptHisOfferServlet  extends HttpServlet {
    private String textStory;

    @Override
    public void init() {
        textStory = "Креон не умер.  <br>" +
                "<br>" +
                "Его кожа слезла, обнажив гниющую плоть, но он дышал. Его лёгкие наполнились личинками**, но он кричал.  <br>" +
                "<br>" +
                "Вейн стоял над ним, капая ему в глаза тёмным нектаром.  <br>" +
                "<br>" +
                "— \"Нургл любит стойких.\"  <br>" +
                "<br>" +
                "Креон хотел возненавидеть его. Но боль ушла. Вместо неё пришло **оцепенение.  <br>" +
                "<br>" +
                "Он поднялся.  <br>" +
                "<br>" +
                "Его рука отвалилась, но он **не заметил.  <br>" +
                "<br>" +
                "\"Где... враги?\" — прохрипел он.  <br>" +
                "<br>" +
                "\"Всё впереди, брат.\" <br>" +
                "<br>" +
                "Они вышли на улицы. Люди бежали.  <br>" +
                "<br>" +
                "Креон убивал. **Не помня зачем.  <br>" +
                "<br>" +
                "Последняя мысль: \"Я служил... кому?\"  <br>" +
                "<br>" +
                "Потом и она **растворилась в сладком гною*.  ";
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter out = null;
        try {
            out = response.getWriter();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        out.println("<html>" +"<meta charset=\"UTF-8\">"+"<body>");
        out.println("<h4>" + textStory);
        out.println("</h4><br>");
        out.println("<form action=\"/quest_war_exploded\" method=\"POST\">\n" +
                "<input type=\"submit\" value=\"Вернуться в начало\" />\n" +
                "</form>");
        out.println("</body></html>");

    }
}
