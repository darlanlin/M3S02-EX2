package br.com.futurodev.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Cadastro Servlet", urlPatterns = "/cadastro.do")
public class CadastroServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();

        writer.println("<h1>Informações enviadas com sucesso!</h1>");

        String login = req.getParameter("login");
        String senha = req.getParameter("senha");

        if (login.equals("admin") && senha.equals("password")) {
            writer.println("<ul>");
            writer.println("<li>Bem vindo usuário admin</li>");
            writer.println("</ul>");
        } else {
            writer.println("<ul>");
            writer.println("<li>Login e/ou senha inválidos.</li>");
            writer.println("</ul>");
        }

    }
}
