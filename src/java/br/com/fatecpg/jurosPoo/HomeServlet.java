/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatecpg.jurosPoo;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author usuario
 */
@WebServlet(name = "HomeServlet", urlPatterns = {"/home"})
public class HomeServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {  
    
            
            out.println("<!DOCTYPE html>");
       out.println("<html>");
            
            out.println("<head>");
             
            out.println("<title>home</title>");  
              out.println("<link href=\"estilo.css\" rel=\"stylesheet\">"); /* Tag link do tipo stylesheet que relaciona a um conteúdo externo de formatação. CSS */
             out.println("<link href=\"bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">"); 
            
             out.println("</head>");
             
            out.println("<body style=\"background:#0099e6;text-align:center;\">");/*Definindo a cor da Página e o alinhamento*/
              
                out.println("<h1 style=\"color:black;\">Faculdade de Tecnologia de Praia Grande</h1>");
                 out.println("<h2 style=\"color:Black;\">Programação Orientada a Objetos</h2>");
                  out.println("<br><h2 style=\"color:Black;\"> Integrantes: </h2>");
                   out.println("<h3 style=\"color:Black;\">Anderson Nunes<br>" + 
                    "José Wandes <br> Thiago Sousa <br> Nicolas Almeida <br> Valéria Regina</p></h3>");
                   out.println("<br><br><br><h2 style=\"color:black;\">Escolha uma das Opções de Juros.</h2><br>"); 
                   out.println("<a href=\"juros-simples\" class=\"btn botao-form\">Juros Simples</a>"); /* Essa Tag de href, indica uma ação. Que linka o Servlet home
                   ao Servlet de juros-simples acrescentando uma barra ao endereço do localhost:8084/projetoJuros/juros-simples */
               out.println("<a href=\"juros-compostos\" name=\"btnCalculaS\" class=\"btn botao-form\">Juros Compostos</a>");  
               /* Essa Tag de href, indica uma ação. Que linka o Servlet home ao Servlet de juros-simples acrescentando
               uma barra ao endereço do localhost:8084/projetoJuros/juros-composto */
                         out.println("</body>");
       out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
