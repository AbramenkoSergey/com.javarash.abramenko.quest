package org.example.quest.heresy;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "notAcceptOffer", value = "/notAcceptOffer")
public class NotAcceptHisOfferServlet extends HttpServlet {
    String textStory;

    @Override
    public void init(){
        textStory ="Креон сжал в руке болтер, глядя в глаза бывшего капитана. \"Ты выбрал Хаос, Вейн. Но я – нет.\"  <br>" +
                "<br>" +
                "Он рванул чеку кислотной гранаты – последнее, что у него осталось. Мутант взвыл, плоть его пузырилась, но Вейн лишь рассмеялся.  \n" +
                "<br>" +
                "\"Жалко. Ты мог бы стать великим.\"  <br>" +
                "<br>" +
                "Пламя охватило Креона. Он чувствовал, как плоть обугливается, но вдруг... боль исчезла.  <br>" +
                "<br>" +
                "Перед ним стоял **теневой демон**, протягивая когтистую ладонь.  <br>" +
                "\"Ты уже наш, сержант. Ты выбрал смерть – но мы даруем жизнь.\"  <br>" +
                "<br>" +
                "Креон хотел крикнуть, но вместо слов из горла вырвался **скрежет тысяч насекомых.  <br>" +
                "<br>" +
                "**Финал:** <br>" +
                "Его тело исказилось, став частью Чумного Легиона. Теперь он будет служить Нурглу – в муках, но без надежды на смерть.";
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
        out.println("<br><h2>"+(String) request.getSession().getAttribute("username")+" , в мире Warhammer`a превозмогают все по разному"+ "</h2><br>");

        out.println("<form action=\"/quest_war_exploded\" method=\"POST\">\n" +
                "<input type=\"submit\" value=\"Вернуться в начало\" />\n" +
                "</form>");
        out.println("</body></html>");

    }


}
