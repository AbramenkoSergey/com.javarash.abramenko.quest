package org.example.quest.heresy;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "heresyOne", value = "/heresy")
public class heresyOne extends HttpServlet {
    private String   textStory;

    @Override
    public void init()  {
        textStory = "Тени шевельнулись. Из темноты вырвался рык мутанта, его когти блеснули в свете фонаря. <br>" +
                "<br>" +
                "— «За Императора!» — рявкнул Креон, открывая огонь. <br>" +
                "<br>" +
                "Но было поздно. Один из новобранцев упал, его крик оборвался под тяжестью твари. Второй, дрожа, отступал.  <br>" +
                "<br>" +
                "— Стой, трус!* — но юноша уже бежал.<br>" +
                "<br>" +
                "Креон остался один. Один против мутанта. Его болтер клинил, и тварь уже готовилась прыгнуть, когда в спину ей ударил луч *плазменного пистолета.  <br>" +
                "<br>" +
                "Из тени вышел человек в рваном плаще.  <br>" +
                "<br>" +
                "— Капитан Вейн?* — прошептал Креон.  <br>" +
                "<br>" +
                "Тот, кто когда-то был его командиром, теперь носил на лице символ Нургла.  <br>" +
                "<br>" +
                "— Ты всё еще служишь трупу на троне, Креон?* — засмеялся Вейн.  <br>" +
                "<br>" +
                "**Выбор:** <br>" +
                "- Принять его предложение — Вейн знает, где скрываются другие предатели. Можно проникнуть в их ряды... или пасть.  <br>" +
                "- Использовать последнюю гранату — даже если это убьет его самого. Лучше смерть, чем измена";

    }

    public void doPost (HttpServletRequest request, HttpServletResponse response){
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter out = null;
        try {
            out = response.getWriter();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        out.println("<html>" +"<meta charset=\"UTF-8\">"+"<body>");
        out.println("<center><img src=\"Heresy_seal.webp\" ></center><br>");
        out.println("<h4>" + textStory);

        out.println("</h4>");
        out.println("<form action=\"acceptOffer\" method=\"POST\">\n" +
                "<input type=\"submit\" value=\"Принять его предложение\" />\n" +
                "</form>");
        out.println("<form action=\"notAcceptOffer\" method=\"POST\">\n" +
                "<input type=\"submit\" value=\"Использовать последнюю гранату\" />\n" +
                "</form>");
        out.println("</body></html>");
    }
}
