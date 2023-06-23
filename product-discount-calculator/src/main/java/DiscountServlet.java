import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet", value = "/display-discount")

public class DiscountServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        float listPrice = Float.parseFloat(req.getParameter("price"));
        float discountPercent = Float.parseFloat(req.getParameter("percent"));
        float discountAmount = (float) (listPrice * discountPercent * 0.01);
        float result = listPrice - discountAmount;
        String discription = req.getParameter("mota");
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<h1>Discription: " + discription + "</h1><br>");
        writer.println("<h1>List Price: " + listPrice + "</h1><br>");
        writer.println("<h1>Discount Percent: " + discountPercent + "%</h1><br>");
        writer.println("<h1> Discount Amount: " + discountAmount + "</h1><br>");
        writer.println("<h1> Discount Price: " + result + "</h1><br>");
        writer.println("</html>");
    }
}
