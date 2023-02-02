package hello.servlet.basic.response;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "responseHeaderServlet", urlPatterns = "/response-header")
public class ResponseHeaderServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.service(req, resp);

        resp.setStatus(HttpServletResponse.SC_OK);

        resp.setHeader("Content-Type", "text/plain;charset=utf-8");
        resp.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
        resp.setHeader("Pragma", "no-cache");
        resp.setHeader("my-header", "hello");

//        content(resp);
        redirect(resp);

//        resp.getWriter().write("OK");
        resp.getWriter().println("ok");
    }

    private void content(HttpServletResponse resp) {
        // Content-Type: text/plain;charset=utf-8
        // Content-Length: 2
        // response.setHeader("Content-Type: text/plain;charset=utf-8");
        resp.setContentType("text/plain");
        resp.setCharacterEncoding("utf-8");
        // response.setContentLength(2);

    }

    private void cookie(HttpServletResponse resp) {
        // Set-Cookie: myCookie=good; Max-Age:600;
        // response.setHeader("Set-Cookie", "myCookie=good; Max-Age: 600");
        Cookie cookie = new Cookie("myCookie", "good");
        cookie.setMaxAge(600);
        resp.addCookie(cookie);
    }

    private void redirect(HttpServletResponse resp) throws IOException {
//        resp.setStatus((HttpServletResponse.SC_FOUND));
//        resp.sendRedirect("/basic/hello-form.html");
        resp.sendRedirect("/basic/hello-form.html");
    }
}
