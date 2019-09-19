/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 703174
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ArithmeticCalculatorServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ArithmeticCalculatorServlet at " + request.getContextPath() + "</h1>");
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
        String operator = request.getParameter("operator");
        int valueOne = 0;
        int valueTwo = 0;
        int result;
        try {
            valueOne = Integer.parseInt(request.getParameter("numFirst"));
            valueTwo = Integer.parseInt(request.getParameter("numSecond"));
            switch (operator) {
                case "+":
                    result = valueOne + valueTwo;
                    request.setAttribute("message", result);
                    break;
                case "-":
                    result = valueOne - valueTwo;
                    request.setAttribute("message", result);
                    break;
                case "*":
                    result = valueOne * valueTwo;
                    request.setAttribute("message", result);
                    break;
                case "%":
                    result = valueOne % valueTwo;
                    request.setAttribute("message", result);
                    break;
            }

        } catch (Exception e) {
            request.setAttribute("message", "Invalid");
        }

        request.setAttribute("numFirst", request.getParameter("numFirst"));
        request.setAttribute("numSecond", request.getParameter("numSecond"));
        getServletContext().getRequestDispatcher("/Arithmetic.jsp").forward(request, response);
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
