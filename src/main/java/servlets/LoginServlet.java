package servlets;

/*
 * Browser sends Http Request to Web Server
 *
 * Code in Web Server => Input:HttpRequest, Output: HttpResponse
 * JEE with Servlets
 *
 * Web Server responds with Http Response
 */

import service.LoginServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {

    LoginServiceImpl loginService = new LoginServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("/WEB-INF/views/Login.jsp").forward(request, response);

        /*
         * Test HTML below. Since it is not
         * recommended to send static HTML from Java, JSP was introduced to create Dynamic HTMLs
         */
       /*
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>My First Servlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("Hello World");
        out.println("</body>");
        out.println("</html>");
        */

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstName = request.getParameter("first");
        request.setAttribute("fName", firstName);
        String lastName = request.getParameter("last");
        request.setAttribute("lName", lastName);
        String pwd = request.getParameter("password");
        if (loginService.isEmptyFields(firstName, lastName, pwd)) {
            request.setAttribute("errorMessage", "Please fill all fields !");
            request.getRequestDispatcher("/WEB-INF/views/Login.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("/WEB-INF/views/Greet.jsp").forward(request, response);
        }
    }

}