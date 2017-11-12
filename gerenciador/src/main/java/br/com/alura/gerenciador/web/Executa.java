package br.com.alura.gerenciador.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns="/executa")
public class Executa extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String tarefa = req.getParameter("tarefa");
		
		if(tarefa==null){
			throw new IllegalArgumentException("Tarefa não informada");
		}else{
			try {
			String nomedaClasse = "br.com.alura.gerenciado.web."+tarefa;
			Class<?> type = Class.forName(nomedaClasse);			
			Tarefa instancia = (Tarefa) type.newInstance();			
			String pagina = instancia.executa(req, resp);
			RequestDispatcher requestDispatcher = req.getRequestDispatcher(pagina);
			requestDispatcher.forward(req, resp);
			} catch (Exception e) {
				
				throw new ServletException(e);
			}
		}
		
	}

}
