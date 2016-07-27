package servlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/customers", loadOnStartup = 1)
public class CustomersServlet extends HttpServlet {

	private String customers;

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().print(customers);
	}

	@Override
	public void init() throws ServletException {
		try {
			BufferedReader bufferedReader = new BufferedReader(
					new InputStreamReader(
							CustomersServlet.class
									.getResourceAsStream("/customers.xml")));
			String line = null;
			StringBuilder builder = new StringBuilder();
			while ((line = bufferedReader.readLine()) != null) {
				builder.append(line);
				builder.append("\n");
			}
			customers = builder.toString();
		} catch (IOException e) {
			throw new ServletException(e);
		}
	}

}
