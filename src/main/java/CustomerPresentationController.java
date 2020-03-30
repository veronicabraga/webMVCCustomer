import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CustomerPresentationController extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        Customer customer = new Customer();
        customer.setName("Rui");
        customer.setEmail("rui.ferrao@gmail.com");
        customer.setPhone("99887766");

        request.getSession().setAttribute("customer", customer);

        RequestDispatcher customerDispatcher = getServletContext().getRequestDispatcher("/customerPresentation.jsp");
        try {
            customerDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
