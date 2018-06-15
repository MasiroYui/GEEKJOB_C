/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orgcamp;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author absolute
 */
public class hyouzyunnkurasuworiyousitesyoriwosakusei{

    public static void main(String[] args) {
    
        String word = "wo";

        System.out.println(word.concat("rd"));

        try {
            
            File fp = new File("/Users/absolute/Desktop/課題");
            
            FileWriter fw = new FileWriter(fp);
            
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("文字列の語尾に文字列を追加する処理");
            
            bw.newLine();
            bw.write("2018-06-15 11:00 開始");
            bw.newLine();
            bw.write("2018-06-15 12:00 終了");
          
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}