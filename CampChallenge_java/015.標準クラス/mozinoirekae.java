/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orgcamp;

/**
 *
 * @author absolute
 */


public class mozinoirekae {
    public static void main(String[] arg){
        
        String word = "きょUはぴIえIちぴIのくみこみかんすUのがくしゅUをしてIます";
        
        String word_Change1 = word.replaceAll("I", "い");
        String word_Change2 = word_Change1.replaceAll("U", "う");
        
        System.out.println("変更前:" + word);
        System.out.println("変更後:" + word_Change2);
    }
}
