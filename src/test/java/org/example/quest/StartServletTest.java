package org.example.quest;

import static org.mockito.Mockito.*;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.RequestDispatcher;

import org.junit.Before;
import org.junit.Test;


import java.io.IOException;

public class StartServletTest {
    private static StartServlet servlet;
    private HttpServletRequest request;
    private HttpServletResponse response;
    private HttpSession session;
    private RequestDispatcher requestDispatcher;

    @Before
    public void setUp() throws ServletException {
        servlet = new StartServlet(); // Инициализация сервлета
        ServletConfig config = mock(ServletConfig.class);
        ServletContext servletContext = mock(ServletContext.class);

        when(config.getServletContext()).thenReturn(servletContext);
        servlet.init(config); // Инициализация сервлета

        request = mock(HttpServletRequest.class);
        response = mock(HttpServletResponse.class);
        session = mock(HttpSession.class);
        requestDispatcher = mock(RequestDispatcher.class);

        when(request.getSession()).thenReturn(session);

        // Настройка мока для getRequestDispatcher
        when(servletContext.getRequestDispatcher("/index.jsp")).thenReturn(requestDispatcher);
        when(request.getRequestDispatcher("/index.jsp")).thenReturn(requestDispatcher);
    }

    @Test
    public void testDoPost_WithUsername() throws ServletException, IOException {
        when(request.getParameter("username")).thenReturn("testUser");

        servlet.doPost(request, response);

        verify(session).setAttribute("username", "testUser");
        verify(requestDispatcher).forward(request, response);
    }

    @Test
    public void testDoPost_WithoutUsername() throws ServletException, IOException {
        when(request.getParameter("username")).thenReturn(null);

        servlet.doPost(request, response);

        verify(session, never()).setAttribute(anyString(), anyString());
        verify(requestDispatcher).forward(request, response);
    }
}