package hello.servlet.request;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletInputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.util.StreamUtils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

@WebServlet(name = "requestBodyStringServlet", urlPatterns = "/request-body-string")
public class RequestBodyStringServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.service(req, resp);
        ServletInputStream inputStream = req.getInputStream();
        String messageBody = StreamUtils.copyToString(inputStream, StandardCharsets.UTF_8);

        System.out.println("--- INPUT STREAM START ---");
        System.out.println("messageBody = " + messageBody);
        System.out.println("--- INPUT STREAM END ---");

        System.out.println("--- DEFAULT REQ START ---");
        System.out.println("req: " + req.getHeaderNames());
        System.out.println("--- DEFAULT REQ END ---");

        resp.getWriter().write("OK");
    }
}
