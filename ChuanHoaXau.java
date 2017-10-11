/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_diagram;

/**
 *
 * @author Ân
 */
public class ChuanHoaXau {
    public static String ChuanHoa (String str) {
        str = str.trim();
        
        str = str.replaceAll("\\s+", " ");
        return str;
        
    }
}
