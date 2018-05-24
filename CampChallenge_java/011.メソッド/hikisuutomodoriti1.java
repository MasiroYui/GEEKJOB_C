/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orgcamp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author absolute
 */
@WebServlet(name = "hikisuutomodoriti1", urlPatterns = {"/hikisuutomodoriti1"})
public class hikisuutomodoriti1 extends HttpServlet {
    
    ArrayList myprofile1(String st){
        
        ArrayList<String> data1 = new ArrayList<String>();
        ArrayList<String> returndata = new ArrayList<String>();
        data1.add("1");
        data1.add("1995年07月11日");
        data1.add("東京都");
        
        if(data1.contains(st)){
            returndata = data1;
        }
        
        ArrayList<String> data2 = new ArrayList<String>();
        data2.add("2");
        data2.add("1995年08月12日");
        data2.add("埼玉県");
        
        if(data2.contains(st)){
            returndata = data2;
        }
        
        ArrayList<String> data3 = new ArrayList<String>();
        data3.add("3");
        data3.add("1995年09月13日");
        data3.add("千葉県");
        
        if(data3.contains(st)){
            returndata = data3;
        }               
        return returndata;
        
    }
   
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           
            ArrayList prof1 = myprofile1("1");
            for(int i=1;i<prof1.size();i++){
               out.print(prof1.get(i));
               out.print("<br>");
           }
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
