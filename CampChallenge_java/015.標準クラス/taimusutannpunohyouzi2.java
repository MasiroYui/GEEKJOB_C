/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orgcamp;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author absolute
 */
@WebServlet(name = "taimusutannpunohyouzi2", urlPatterns = {"/taimusutannpunohyouzi2"})
public class taimusutannpunohyouzi2 extends HttpServlet {

    public class sample {
    public void main(String[] arg) throws ParseException{
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH時mm分ss秒");
        
        Date day1 = sdf.parse("2015年1月1日 0時0分0秒");
        Date day2 = sdf.parse("2015年12月31日 23時59分59秒");
        
        long dayTime1 = day1.getTime();
        long dayTime2 = day2.getTime();
        
        long sa = (dayTime2 - dayTime1);
        
        System.out.println(sdf.format(day1) + "　と　" + sdf.format(day2) + "　の差分は　" + sa + "ミリ秒です");
    }
}
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
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
