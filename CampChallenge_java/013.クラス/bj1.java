/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orgcamp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author absolute
 */
@WebServlet(name = "bj1", urlPatterns = {"/bj1"})
public class bj1 extends HttpServlet {

    public class Dealer extends Human {

    ArrayList<Integer> cards = new ArrayList<>();

    
    Dealer() {

        
        for (int i = 0; i < 4; i++) {

            cards.add(1);      // 1
            cards.add(2);      // 2
            cards.add(3);      // 3
            cards.add(4);      // 4
            cards.add(5);      // 5
            cards.add(6);      // 6
            cards.add(7);      // 7
            cards.add(8);      // 8
            cards.add(9);      // 9
            cards.add(10);     // 10
            cards.add(11);     // 11
            cards.add(12);     // 12
            cards.add(13);     // 13
        }
    }

    
    public ArrayList<Integer> deal() {

        ArrayList<Integer> dealCard = new ArrayList<>();

        Random rand = new Random();

        for (int i = 0; i < 2; i++) {

            Integer index = rand.nextInt(cards.size());

            dealCard.add(cards.get(index));
        }

        return dealCard;
    }

    
    public ArrayList<Integer> hit() {

        ArrayList<Integer> hitCard = new ArrayList<>();

        Random rand = new Random();

        Integer index = rand.nextInt(cards.size());

        hitCard.add(cards.get(index));

        return hitCard;
    }

   
    @Override
    public void setCard(ArrayList<Integer> set) {

        for (int i = 0; i < set.size(); i++) {
            myCards.add(set.get(i));
        }
    }

    
    @Override
    public boolean checkSum() {

        if (open() < 18) {
            return true;
        } else {
            return false;
        }
    }

    
    @Override
    public int open() {

        int sum = 0;

        for (int i = 0; i < myCards.size(); i++) {
            sum += myCards.get(i);
        }

        return sum;
    }
}
    
    public abstract class Human {

    public abstract void setCard(ArrayList<Integer> set);

    public abstract boolean checkSum();

    public abstract int open();

    ArrayList<Integer> myCards = new ArrayList<Integer>();
}
    
    public class Main {

    public void main(String[] args) {

        User user = new User();
        Dealer dealer = new Dealer();

        user.setCard(dealer.deal());
        dealer.setCard(dealer.deal());

        System.out.println("ディール時");
        System.out.println("User:" + user.myCards);
        System.out.println("Dealer" + dealer.myCards);
        System.out.println("");

        while (user.checkSum()) {
            user.setCard(dealer.hit());
        }

        while (dealer.checkSum()) {
            dealer.setCard(dealer.hit());
        }

        System.out.println("最終結果");
        System.out.println("Dealer:" + dealer.open());
        System.out.println("手札 :" + dealer.myCards);
        System.out.println("");
        System.out.println("User :" + user.open());
        System.out.println("手札 :" + user.myCards);
        System.out.println("");

        System.out.println("結果発表");

        if (dealer.open() == user.open()) {
            System.out.println("引き分け");
        } else if (dealer.open() > 21 && user.open() > 21) {
            System.out.println("Dealerの勝ち(両者 バースト)");
        } else if (user.open() > 21){
            System.out.println("Dealerの勝ち(User バースト)");            
        } else if (dealer.open() > 21){
            System.out.println("Userの勝ち(Dealer バースト)");
        } else if (dealer.open() == 21) {
            System.out.println("Dealerの勝ち(ブラックジャック)");
        } else if (user.open() == 21) {
            System.out.println("Userの勝ち(ブラックジャック)");
        } else if (dealer.open() > user.open()) {
            System.out.println("Dealerの勝ち");
        } else if (dealer.open() < user.open()) {
            System.out.println("Userの勝ち");
        }
    }
}
    
    public class User extends Human {

    @Override
    public void setCard(ArrayList<Integer> set) {

        for (int i = 0; i < set.size(); i++) {
            myCards.add(set.get(i));
        }
    }

    @Override
    public boolean checkSum() {

        if (open() < 18) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int open() {

        int sum = 0;

        for (int i = 0; i < myCards.size(); i++) {
            sum += myCards.get(i);
        }

        return sum;
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
