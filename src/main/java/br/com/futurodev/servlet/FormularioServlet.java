package br.com.futurodev.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "Formulario Cadastro Usuario", urlPatterns = "/usuario.do")
public class FormularioServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // indica o local do html e direciona para a página cadastro_usuario.html
        req.getRequestDispatcher("cadastro_usuario.html").forward(req,resp);
    }
}
