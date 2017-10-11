/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_diagram;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


/**
 *
 * @author Ân
 */
public class DocFile {
    public static String ReadFile (String duongdan) {
        
        String str = "";
        FileReader fileReader = null;
        
        
        try {
            String dong  = "";
            
            // Khoi tao mot doi tuong
            fileReader = new FileReader(duongdan);
            
            // dua vao bo nho dem may tinh
            
            BufferedReader buffer = new BufferedReader(fileReader);
            while ((dong = buffer.readLine()) != null) {
                str += dong;
            }
//            System.out.println(str);
//            str = str.trim();
//            while (str.indexOf("  ") != -1) str = str.replaceAll("  "," ");
//            System.out.println(str);
            buffer.close();
            
            fileReader.close();
        } 
        catch (IOException ex) {
            System.err.println("Co loi : " + ex.getMessage());
        }
        
        return str;
    }
    
        
    }

