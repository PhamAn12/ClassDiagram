/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_diagram;

import java.io.File;

/**
 *
 * @author Ân
 */
public class DocFolder {
    public static String readProject(String folderDir){
        String str = "";
        File fi = new File (folderDir);
        File [] path = fi.listFiles();
        
        for (File s: path) {
          //  System.out.println(s.getAbsolutePath());
            String st = DocFile.ReadFile(s.getAbsolutePath());
            str += st;
        }
        return str;
    }
}
