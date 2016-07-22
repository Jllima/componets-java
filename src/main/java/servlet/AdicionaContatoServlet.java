package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Contato;

@WebServlet("/adicionaContato")
public class AdicionaContatoServlet extends HttpServlet {

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		log("Iniciando a servlet");
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
		log("Destruindo a servlet");
	}

	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		String nome = request.getParameter("nome");
		String endereco = request.getParameter("endereco");
		String email = request.getParameter("email");
		String dataEmTexto = request.getParameter("dataNascimento");

		Calendar dataNascimento = null;

		try {
			Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dataEmTexto);
			dataNascimento = Calendar.getInstance();
			dataNascimento.setTime(date);
		} catch (Exception e) {
			out.println("Erro na conversão da data");
			return;
		}

		Contato contato = new Contato();
		contato.setName(nome);
		contato.setEmail(email);
		contato.setEndereco(endereco);
		contato.setDataDeNascimento(dataNascimento);

		RequestDispatcher rd = request
				.getRequestDispatcher("/contato-adicionado.jsp");
		rd.forward(request, response);
	}
}
