package com.wilferraciolli.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * The type Hello world servlet. To run this servlet, first do a mvn clean install. followed by mvn tomcat7:run.
 * For more info see: <link>https://www.boraji.com/how-to-create-a-web-project-using-maven-in-eclipse</link>
 */
@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    /**
     * Do get.
     *
     * @param req  the req
     * @param resp the resp
     * @throws ServletException the servlet exception
     * @throws IOException      the io exception
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("text/plain");
        resp.getWriter().write("Hello World! Maven Web Project Example.");
    }
}
