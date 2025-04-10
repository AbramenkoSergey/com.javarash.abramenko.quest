package org.example.quest.truth;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "AdeptusArbitesServlet", value = "/adeptus-arbites-servlet")
public class AdeptusArbitesServlet extends HttpServlet {
    private String textStory3;
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
        out.println("<center><img src=\"imgAdeptusArbites.jpg\" ></center><br><br>");
        out.println("<h4>" + textStory3);
        out.println("<br><h2>"+"Сейчас  играет: "+ req.getSession().getAttribute("username")+ "</h2><br>");
        out.println("</h4><br>");
        out.println("<form action=\"send-signal\" method=\"POST\">\n" +
                "<input type=\"submit\" value=\"Отправить сигнал\" />\n" +
                "</form>");
        out.println("<form action=\"destroy-record\" method=\"POST\">\n" +
                "<input type=\"submit\" value=\"Уничтожить запись\" />\n" +
                "</form>");
        out.println("</body></html>");
    }

    @Override
    public void init() throws ServletException {
        textStory3 = "Новобранец дрожал, глядя на Креона.  <br>" +
                "<br>" +
                "— Что будем делать?  <br>" +
                "<br>" +
                "Сержант медленно поднял комби-инструмент — устройство, способное передать сообщение **прямо в командование Арбитес.  <br>" +
                "<br>" +
                "**Выбор:**  <br>" +
                "-Отправить сигнал — даже если среди высших чинов есть предатели, Император защитит правду. <br>" +
                "-Уничтожить запись — если ересь проникла так глубоко, доверять нельзя никому";
    }
}
