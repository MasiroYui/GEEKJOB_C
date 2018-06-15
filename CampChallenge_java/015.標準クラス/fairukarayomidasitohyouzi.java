/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orgcamp;

import java.io.*;

/**
 *
 * @author absolute
 */

public class fairukarayomidasitohyouzi {
    public static void main(String[] arg) throws FileNotFoundException, IOException{
        
        File fp = new File("/Users/absolute/Desktop/課題");
        
        FileReader fr = new FileReader(fp);
                
        BufferedReader br = new BufferedReader(fr);
        
        System.out.println(br.readLine());
        
        br.close();
    }
}