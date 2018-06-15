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

public class fairunokakidasitohozonn {
    public static void main(String[] arg) throws IOException{
        
        File fp = new File("/Users/absolute/Desktop/課題");
        
        FileWriter fw = new FileWriter(fp);
        
        fw.write("私の名前は江澤　将史です。よろしくお願いします。");
        
        fw.close();
    }
}
